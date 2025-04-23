package serialize;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Emp implements Serializable {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private int i;
	private String str;
	private int k=10;



	public Emp(int i, String str) {
		super();
		this.i = i;
		this.str = str;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (i != other.i)
			return false;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Emp [i=" + i + ", str=" + str + "]";
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		File file = new File("ABC.dat");
		if(!file.exists()){
			file.createNewFile();
		}
		
		Emp emp = new Emp(10, "DipaK");
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
//		oos.writeObject(emp);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Emp emp1 = (Emp)ois.readObject();
		ois.close();
		if(emp.equals(emp1))
		{
			System.out.println(emp);
			System.out.println(emp1);
			System.out.println("Object are equal");
		}

	}

}
