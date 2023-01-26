package array;

public class ArrayExample2 {
	public static void main(String[]args) {		
	//	String s[]=new String[5];
		
		String s1[]= {"vikram","saanvi","bijju","puppy","susmi"};

		System.out.println(s1[3]);
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);	
		}
		
		
		for(int i=4;i>=0;i--) {
			System.out.println(s1[i]);	
		}
		
		String s= "Believe in yourself";
		String[] split = s.split(" ");
		
		for (String string : split) {
			System.out.println(string);
		}
		
	}

}
