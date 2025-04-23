interface I1
{
	public void i1();
	
}

interface I2
{
	public void i2();
	
}


interface I3 extends I1, I2
{
	public void i3();
	
}

class C1 
{
	public void c1()
	{
		System.out.println("c1");
	}
}


abstract class AC1 
{
	public void ac1()
	{
		System.out.println("ac1");
	}
	public void ac2()
	{
		System.out.println("ac2");
	}
}




public class TestInterface {

}
