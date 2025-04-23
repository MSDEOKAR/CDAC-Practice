package others;

class Base
{
	 public static void test()
	{
		System.out.println("Base class test");
	}
}
public class OverrideStatic extends Base
{
	public static  void test()
	{
		System.out.println("Derived class test");
	}
	
	public static void main(String[] args)
	{
	OverrideStatic.test();
	
	
	}
}
