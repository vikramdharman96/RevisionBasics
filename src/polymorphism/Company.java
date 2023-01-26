package polymorphism;
//Overriding
public class Company extends EmployeeDetails {
	public void companydetail() {
		System.out.println("****Company***");
	}
	@Override
	public void emp() {
		System.out.println("TCS");
	}
	@Override
	String empdept() {
		return "Department: Development";
	}
	@Override
	public void emp(String n) {
	System.out.println("Name:"+n);
	}
	
	
	public static void main(String[] args) {
		Company c=new Company();
		c.companydetail();
		c.emp();
		c.emp("Ram");
		
		System.out.println(c.empdept());
		EmployeeDetails.emplocation();//static keyword --classname.method name
		
	}
	
	
	
	

}
