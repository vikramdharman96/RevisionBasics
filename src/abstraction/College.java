package abstraction;

public class College extends University {

	@Override
	public void ug() {
		System.out.println("B.sc CS");
		
	}

	@Override
	public void pg() {
		System.out.println("MCA");
		
	}
	public static void main (String[]args) {
		College c=new College();
		c.ug();
		c.pg();
		c.bE(); 
	}
	

}
