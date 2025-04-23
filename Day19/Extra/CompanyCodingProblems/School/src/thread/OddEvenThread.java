package thread;

public class OddEvenThread extends Thread 
{
	boolean even = false;
	int maximum = 10;;
	int initNumber;
	public OddEvenThread(boolean even, int maximum) 
	{
		super();
		this.even = even;
		this.maximum = maximum;
		if(even)
			initNumber = 0;
		else initNumber= -1;
	}
	
	
	@Override
	public void run() 
	{
		super.run();
		while(initNumber < maximum)
		{
			if(even)
			{
				initNumber= initNumber+2;
				System.out.println(initNumber);
			}
			else
			{
				initNumber= initNumber+2;
				System.out.println(initNumber);
			}
		}
	}
	
	public static void main(String[] args) {
		Thread oddThread = new OddEvenThread(false, 10);
		Thread evenThread = new OddEvenThread(true, 10);
		oddThread.start();
		evenThread.start();
	}
	
	

}
