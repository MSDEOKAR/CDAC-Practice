package com.cdkglobal;

public class TryCatchFinally {
	
	
	public static void main(String[] args) {
		try{
			
			System.out.println("Inside try");
			throw new Exception("\nException occured");
		}
			catch(Exception e)
		{
			int x = 10/0;
			System.out.println("Inside catch");
		}
		finally
		{
			System.out.println("Inside finally");
		}
	}

//	public static void main(String[] args) throws Exception {
//		try{
//			
//			System.out.println("Inside try");
//			throw new Exception("\nException occured");
//		}
//		finally
//		{
//			System.out.println("Inside finally");
//		}
//	}

}
