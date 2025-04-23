package thread.deadlock;

public class NonStatic {
	
	synchronized void method1()
	{
		System.out.println("NonStatic::method1 executed");
		method2();
	}

	
	synchronized void method2()
	{
		System.out.println("NonStatic::method2 executed");
	}
	
	public static void main(String[] args) {
		NonStatic nonStatic = new NonStatic();
		nonStatic.method1();
	}

}
