package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class DateDemo
{
	public static void main(String[] args)
	{
		try
		{
			String strDate = null;
			DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter date in (dd/mm/yyyy) format");
			if(sc.hasNextLine())
			{
				strDate = sc.nextLine();
			}
			Date today = df.parse(strDate);           
			System.out.println("Today = " + df.format(today));
		
		} catch (ParseException e)
		{
			e.printStackTrace();
		}
	}
}