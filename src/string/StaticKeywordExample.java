package string;

public class StaticKeywordExample {
	
	int a=1;
	static String ss="Vikram";
	
	private static void m1() {
	
		System.out.println("this is static method");
	}
	
	private void m2() {
		System.out.println("this is non static method");

	}

	public static void main(String[]args) {
		StaticKeywordExample s=new StaticKeywordExample();
		System.out.println(s.a);   //non static variable
		
		System.out.println(ss);     //static variable
		
		s.m2();      //non static method
		
		m1();     //static variable we can call directly
		
		System.out.println(StaticKeywordExample.ss.length());
		
		
		//System----predefined class            class System{
		//out ----static variable					static PrintStream out;
		//println -----method					}
		
		
		
		
		
		
		
		
	}
	}
