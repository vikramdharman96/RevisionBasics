package org.demo;

//Accessing different class on same package
//public ---global level access
//privte ---class level access

public class EmployeeDetails1 {
	public void empLocation() {
		System.out.println("Ooty");
	}
	public void empPhone() {
		System.out.println(1234557);
	}
	public static void main(String[]args) {
		EmployeeDetails1 e1=new EmployeeDetails1();
		EmployeeDetails e =new EmployeeDetails();
		e.empId();
		e.empName();
		e1.empPhone();
		e1.empLocation();
	}

}
