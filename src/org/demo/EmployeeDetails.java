package org.demo;

public class EmployeeDetails  {
	// method
	public void empId() {
		System.out.println(1234);
	}
	public String loginFb() {
		return "Success";
	}

	public void empName() {
		System.out.println("Vikram");
	}

	public static void main(String[] arg) {
		EmployeeDetails e = new EmployeeDetails();
		e.empId();
		e.empName();
		String l = e.loginFb();
		System.out.println("LoginFacebook : " +l);
	}

}
