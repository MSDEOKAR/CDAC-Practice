package abstrat;

import java.io.IOException;

 abstract public class A {
	 
	 public A()
	 {
		 System.out.println("Constructor works");
	 }
	 
	 public void methodA1() throws IOException
	 {
		 
	 }
	abstract  public void methodA2();
	public static void main(String[] args) {
		System.out.println("hello");
		A.doIt();
	}
	public static void doIt() {
		System.out.println("doit");
	}
}
