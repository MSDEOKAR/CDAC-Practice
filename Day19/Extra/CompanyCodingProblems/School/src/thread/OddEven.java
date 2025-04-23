package thread;

public class OddEven {


	static class TaskEvenOdd implements Runnable {

		private int max;
		private Printer print;
		private boolean isEvenNumber;

		TaskEvenOdd(Printer print, int max, boolean isEvenNumber){
			this.print = print;
			this.max = max;
			this.isEvenNumber = isEvenNumber;
		}

		@Override
		public void run() {

			//System.out.println("Run method");
			int number = isEvenNumber == true ? 2 : 1;
			while(number<= max){

				if(isEvenNumber){
					//System.out.println("Even :"+ Thread.currentThread().getName());
					print.printEven(number);
					//number+=2;
				}   
				else {
					//System.out.println("Odd :"+ Thread.currentThread().getName());
					print.printOdd(number);
					// number+=2;
				}
				number+=2;
			}

		}

	}

	static class Printer {

		boolean isOdd= true;


		synchronized void printEven(int number) {

			while(isOdd == true){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Even:"+number);
			isOdd = true;
			notifyAll();
		}

		synchronized void printOdd(int number) {
			while(isOdd == false){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Odd:"+number);
			isOdd = false;
			notifyAll();
	
		}

	}

	public static void main(String []args){
		OddEven oddEven = new OddEven();
		Printer print = new OddEven.Printer();
		Thread t1 = new Thread(new TaskEvenOdd(print, 100,  false));
		Thread t2 = new Thread(new TaskEvenOdd(print, 100, true));
		t1.start();
		t2.start();
	}
}
