import java.util.Scanner;

/**
 * 
 */

public class NumberPrinter {

	public static void printNumberUsingWhile(int no) {
		int counter = 1;

		while(counter <= no) {
			System.out.println(counter);
			counter = counter +1;
		}

	}

	public static void printNumberUsingFor(int no) {
		for ( int counter =1 ; counter <= no; counter = counter +1) {
			System.out.println(counter);
		}

	}

	public static void printNumberUsingDoWhile(int no) {
		int counter = 1;

		do {
			System.out.println(counter);
			counter = counter +1;
		} while(counter <= no);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("\n Enter number");
		int no = scanner.nextInt();
		NumberPrinter.printNumberUsingWhile(no);
		NumberPrinter.printNumberUsingFor(no);
		NumberPrinter.printNumberUsingDoWhile(no);
		scanner.close();
	}

}
