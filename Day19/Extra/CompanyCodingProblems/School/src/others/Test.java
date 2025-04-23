package others;
public class Test
{
private final String strValue;

public Test()
{
  strValue = "Test";
}

 public void display()
 {
  System.out.println(strValue);
 }

public static void main(String []args)
 {
   Test objTest = new Test();
   objTest.display();
 }

}

