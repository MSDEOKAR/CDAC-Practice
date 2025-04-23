package exception;

public class TestFinally 
{
	public float test()
	{
		try
		{
			System.out.println("In try");
			throw new ArrayIndexOutOfBoundsException();
			//return 0.0;
		}
		catch (Exception e)
		{
			System.out.println("In catch");
			return 1.0F;
		}
		finally
		{
			
			System.out.println("In finally");
			return 2.0F;
		}
		//return 3.0;
	}

	public static void main(String[] args) {
		System.out.println(new TestFinally().test());
	}
}
