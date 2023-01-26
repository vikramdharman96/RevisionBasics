package inheritance;

public class Education extends Medicine {
	public void ug() {
		System.out.println("UG");
	}
	public void pg() {
		System.out.println("PG");
	}
	
	public static void main(String[]arg) {
		Education e=new Education();
		e.empName();
		e.ug();
		e.pg();
		
		e.dental();
		e.mbbs();
		
		e.bE();
		
		e.bA();
		e.bEd();
		e.bsc();
	}


}
