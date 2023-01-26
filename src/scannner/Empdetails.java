package scannner;

import java.util.Scanner;

public class Empdetails {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		


		System.out.println("Emp FullName: ");
		String fname = s.nextLine();
		
		
		System.out.println("EmpName: ");
		String name = s.next();
		
		System.out.println("EmpID: ");
		int i =s.nextInt();
		
		System.out.println("Result: ");
		boolean b = s.nextBoolean();

				
		System.out.println("Full Name: "+fname);
		System.out.println("Emp Name is: "+name);
		System.out.println("EmpID is: "+i);
		System.out.println("Result is "+b);
		
		
		
		
	}

}
