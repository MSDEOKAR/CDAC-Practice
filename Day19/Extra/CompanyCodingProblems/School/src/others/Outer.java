package others;
//Test for creating Inner object directly
//Directly create static variables in Inner class
//Use Inner class as static class
//Use outer class members in Inner class

public class Outer 
{
	int p;
	public class Inner
	{
		int i;
		
		public void test()
		{
			i=20;
			Outer.this.p =20;
			System.out.println("test executed");
		}	
	}
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		Outer.Inner objInner =o.new Inner();
		objInner.test();
	}

}
