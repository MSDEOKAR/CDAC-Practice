package string;

public class StringTest {

	static public void main(String [] args)
	{
		String str1= "dipakkolte";
		String str2 = "dipak";
		str2 = str2+"kolte";
		if(str1== str2)
		{
		System.out.println("ref equal");
		
		}
		if(str1.equals(str2))
		{
		System.out.println("content equal");
		
		}
		
	}
}
