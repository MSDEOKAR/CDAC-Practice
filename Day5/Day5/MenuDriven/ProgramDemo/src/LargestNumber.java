import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		System.out.println("\n Enter 3 nos");
		Scanner scanner = new Scanner(System.in);
		int no1 = scanner.nextInt();
		int no2 = scanner.nextInt();
		int no3 = scanner.nextInt();
		int max = no1;

		if(no2 > max) {
			max = no2;
		}

		if(no3 > max) {
			max = no3;
		}
		
		System.out.println("\n Max=" +max);
		scanner.close();
	}

}
