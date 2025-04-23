package threads;

public class Printer 
{
	boolean printOdd = true;
	
	
	synchronized public  void printEven(int number)
	{
		
		while(printOdd)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Even"+ number);
		printOdd = true;
		notifyAll();
	}
	
	synchronized public  void printOdd(int number)
	{
		while(!printOdd)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Odd"+ number);
		printOdd = false;
		notifyAll();
	}

}
