
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int x= 2;
		
		final int c = 2;
		switch (x) {
		case 1:
			System.out.println(1);
			break;
		case 10:
			System.out.println(10);
			break;
		case c:
			System.out.println(2);
			break;
		case 5:
			System.out.println(5);
			break;
		default:
			System.out.println("none");
			break;
		}

	}

}
