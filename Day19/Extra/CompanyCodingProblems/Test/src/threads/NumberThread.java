package threads;

public class NumberThread extends Thread{
	private boolean isEven;
	private Printer printer;
	private int num;
	
	public NumberThread(boolean evenOdd,int no, Printer ptr )
	{
		isEven = evenOdd;
		num = no;
		printer = ptr;
	}
	
	@Override
	public void run() 
	{
		int number = (true == isEven)?2:1;
		while(number < num)
		{
			if(isEven)
			{
				printer.printEven(number);
				number += 2;
			}
			else
			{
				printer.printOdd(number);
				number += 2;
			}
		}
	}

	public static void main(String[] args) {
		Printer ptr = new Printer();
		NumberThread t1 = new NumberThread(false, 10,ptr);
		NumberThread t2 = new NumberThread(true, 10,ptr);
		t1.start();
		t2.start();
		
	}
}
