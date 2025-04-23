class Base
{
	public void show()
	{
		System.out.println("Base.show");
	}
}

public class Test extends Base
{
	public void show()
	{
		System.out.println("Derioved.show");
	}
	
	public static void main(String[] args)
	{
		Test d = (Test) new Base();
		d.show();
	}
	
	
}