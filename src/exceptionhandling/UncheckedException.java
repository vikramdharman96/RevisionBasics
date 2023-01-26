package exceptionhandling;

import java.util.ArrayList;
import java.util.Scanner;

public class UncheckedException {
	public static void main (String[]args) {
		int i=20;
//		System.out.println(i/0);  //ArithmeticException
		
		String s=null;
//		System.out.println(s.length());  //NullPointerException
		
		String st="abcde";
//		System.out.println(Integer.parseInt(st));  //NumberFormatException
		
		int arr[]=new int[5];
//		arr[6]=10;                      //ArrayIndexOutOfBoundsException
		
		String ss="vikram";
//		System.out.println(ss.charAt(7));    //StringIndexOutOfBoundsException
		
		ArrayList<String> as=new ArrayList<String>();
		
//		as.add("vikram");
//		as.add("saanvi");
//		as.get(0);
//		as.get(3);		           //IndexOutOfBoundsException
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter regno");
		int next = sc.nextInt();
		System.out.println(next);     //InputMismatchException
		
		
		
		
		
		
		
		
	
	
	}

}
