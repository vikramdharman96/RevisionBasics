package exceptionhandling;

public class HandleUncheckedException {
	public static void main(String[] args) {
		System.out.println("Started");
		
//		int i=20;
//		try {
//		System.out.println(i/0);  //ArithmeticException
//		}
//		catch (ArithmeticException e) {
//			System.out.println(e.getMessage()); 
//			System.out.println("Pending");
//		}
//		
//		
//		
//		String s=null;
//		try {
//		System.out.println(s.length());  //NullPointerException
//		}
//		catch (NullPointerException e) {
//			System.out.println(e.getMessage());
//			System.out.println("Pending");
//		}
//		
//		String st="abcde";
//		try{
//		System.out.println(Integer.parseInt(st));  //NumberFormatException
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());    //Exception is super class of all exceptions
//		}
		
		
		int arr[]=new int[5];
		try {
		arr[6]=10;                      //ArrayIndexOutOfBoundsException
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("Inprogress");
		System.out.println("Completed");
		
	
		
		
		
		
		
		
	}

}
