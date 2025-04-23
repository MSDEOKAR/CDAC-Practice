import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


final class Identifier
{
	final String mark;
	final String aadharNo;
	
	public Identifier(String mark, String aadharNo) {
		super();
		this.mark = mark;
		this.aadharNo = aadharNo;
	}
	public String getMark() {
		return mark;
	}
	/*public void setMark(String mark) {
		this.mark = mark;
	}*/
	public String getAadharNo() {
		return aadharNo;
	}
	/*public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}*/
	@Override
	public int hashCode() {
		System.out.println("Identifier hashcode called");
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((aadharNo == null) ? 0 : aadharNo.hashCode());
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Identifier equals called");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Identifier other = (Identifier) obj;
		if (aadharNo == null) {
			if (other.aadharNo != null)
				return false;
		} else if (!aadharNo.equals(other.aadharNo))
			return false;
		if (mark == null) {
			if (other.mark != null)
				return false;
		} else if (!mark.equals(other.mark))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Identifier [mark=" + mark + ", aadharNo=" + aadharNo + "]";
	}
	
	
}
class Person
{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	@Override
	public int hashCode() {
		System.out.println("Person Hascode called");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Person equals called");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class HashTest {

	public static void main(String[] args) {
		/*************************************************HashSet****************************************/
		/*//Hashset Case no 1: Only one object get added
				Person person1 = new Person("Praphul", 30);
				Set<Person> set = new HashSet<Person>();
				set.add(person1);
				set.add(person1);
				set.add(person1);
				System.out.println(set);
				//Output: [Person [name=Praphul, age=30]]
*/				
		/*//Hashset Case no 2: All duplicate objects added without hashcode and equal impl
		Person person1 = new Person("Praphul", 30);
		Person person2 = new Person("Praphul", 30);
		Person person3 = new Person("Praphul", 30);
		Set<Person> set = new HashSet<Person>();
		set.add(person1);
		set.add(person2);
		set.add(person3);
		System.out.println(set);
		//Output: [Person [name=Praphul, age=30], Person [name=Praphul, age=30], Person [name=Praphul, age=30]]
*/		
		
		/*//Hashset Case no 3: All duplicate objects added with hashcode impl
		Person person1 = new Person("Praphul", 30);
		Person person2 = new Person("Praphul", 30);
		Person person3 = new Person("Praphul", 30);
		Set<Person> set = new HashSet<Person>();
		set.add(person1);
		set.add(person2);
		set.add(person3);
		System.out.println(set);
		//Output: [Person [name=Praphul, age=30], Person [name=Praphul, age=30], Person [name=Praphul, age=30]]
*/	
		
		/*//Hashset Case no 4: All duplicate objects added with hashcode  and equals impl
				Person person1 = new Person("Praphul", 30);
				Person person2 = new Person("Praphul", 30);
				Person person3 = new Person("Praphul", 30);
				Set<Person> set = new HashSet<Person>();
				set.add(person1);
				set.add(person2);
				set.add(person3);
				System.out.println(set);
				//Output: [Person [name=Praphul, age=30]]
		*/
		
		
//******************************* HashMap*******************************************/
//		Person person1 = new Person("Praphul", 30);
//		System.out.println(person1.getName().hashCode());
//		Person person2 = new Person("Praphul", 30);
//		System.out.println(person2.getName().hashCode());
//		System.out.println(person1.equals(person2));
//		
//		HashMap<String, Person> hm = new HashMap<>();
//		hm.put(person1.getName(), person1);
//		hm.put(person2.getName(), person2);
//		System.out.println("Size="+ hm.size());
//		System.out.println(hm);
//		//Output : {Praphul=Person [name=Praphul, age=30]}
		
		
//		ConcurrentHashMap<String, Person> hm = new ConcurrentHashMap<>();
//		hm.put(person1.getName(), person1);
//		hm.put(person2.getName(), person2);
//		System.out.println(hm.get("Dipak"));
//		System.out.println(hm);
//		
//		Hashtable<String, Person> hm = new Hashtable<String, Person>();
//		hm.put(person1.getName(), person1);
//		hm.put(person2.getName(), person2);
//		System.out.println(hm.get("Praphul"));
//		System.out.println(hm);
		
		
		Identifier id1 = new Identifier("mole", "12345");
		Identifier id2 = new Identifier("mole", "678991");
		
		Person person1 = new Person("Praphul", 30);
		Person person2 = new Person("Praphul", 30);
		
		Map<Identifier, Person> hm = new HashMap<>();
		hm.put(id1, person1);
		hm.put(id2, person2);
		System.out.println(hm.containsValue(person1));
		//id2.setMark("toll");
		
		//System.out.println(hm.get(id2));
		System.out.println(hm);
	}

}
