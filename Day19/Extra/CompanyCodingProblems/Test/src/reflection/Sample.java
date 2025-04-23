package reflection;

public class Sample 
{

	private String str1;
	private String str2;
	
	public Sample(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
	}
	public void method1()
	{
		System.out.println("medthod1");
	}
	public void method2()
	{
		System.out.println("medthod2");
	}
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
}
