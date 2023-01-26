package polymorphism;
//overloading 
public class EmployeeDetails {
	public void emp() {
		System.out.println("EmployeeDetails:");
	}
	public void emp(int i) {
		System.out.println("EmpID:" +i);
	}
	public void emp(String n) {
		System.out.println("EmpName: "+n);
	}
	public void emp(String n, String s) {
		System.out.println("Mail:"+n+"   Gender:"+s);
	}
	String empdept(){
		return "Department: Testing";
	}
	//static keyword--no need to create object (directly call method/classname.methodname)
	public static void emplocation(){
		System.out.println("ooty");
	}
	
	public static void main(String []args) {
		EmployeeDetails e=new EmployeeDetails();
		e.emp();
		e.emp(12345);
		e.emp("Vikram");
		e.emp("vikr@gmail.com", "M");
		
		System.out.println(e.empdept());
		
		emplocation();//static keyword
	}


}
