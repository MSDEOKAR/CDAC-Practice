package thread.deadlock;

public class DeadLockThread  extends Thread{
	
	private NonStatic nonStatic;
	
	
	public DeadLockThread(NonStatic nonStatic) {
		super();
		this.nonStatic = nonStatic;
	}


	@Override
	public void run()
	{
		nonStatic.method1();
	}
	
	public static void main(String[] args) {
		NonStatic nonStatic = new NonStatic();
		new DeadLockThread(nonStatic).start();
		new DeadLockThread(nonStatic).start();
		new DeadLockThread(nonStatic).start();
	}

}
