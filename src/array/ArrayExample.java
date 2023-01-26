package array;

public class ArrayExample {
	public static void main(String[]args) {
		
		//int s[]=new int[5];//array declaration
		
		int s[]= {100,200,300,400,500};		//storing similar datatype 
		
		s[0]=100;
		s[1]=200;
		s[2]=300;
		s[3]=400;
		s[4]=500;
		
		
		System.out.println(s[2]);
		
		
		//for loop---indexed based one 
		System.out.println("for loop");
		for(int i=0;i<=4;i++) {
			System.out.println(s[i]);
		}
		
		//enhanced for loop----value based
		System.out.println("enhanced for loop");
		for (int i : s) {
			System.out.println(i);
			
		}
		
		
		
		
	}

}
