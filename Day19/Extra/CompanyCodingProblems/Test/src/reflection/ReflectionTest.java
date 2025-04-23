package reflection;

import java.util.Arrays;

public class ReflectionTest {
public static void main(String[] args) throws ClassNotFoundException {
	Class<?> c=Class.forName("reflection.Sample");  
	  System.out.println("Class Name:"+c.getName()); 
	  System.out.println("Interface:"+c.isInterface());  
	  System.out.println("ctors:"+Arrays.toString(c.getConstructors()));  
	  c.getConstructors()[0].setAccessible(true); // changing access specification
	  System.out.println("Methods:"+Arrays.toString(c.getMethods())); 
}
}
