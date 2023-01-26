package org.diffpackage;

//Accessing with different class on different package in addition we have to import
//import packagename.classname;
import org.demo.EmployeeDetails;
import org.demo.EmployeeDetails1;

public class EmployeeDetails3 {
	
	private void empGender() {
		System.out.println("Male");
	}

	private void empSalary() {
		System.out.println(50000);
	}

	public static void main(String[] args) {
		System.out.println("*******Employee Details*********");
		EmployeeDetails e = new EmployeeDetails();
		EmployeeDetails1 e1 = new EmployeeDetails1();
		EmployeeDetails3 e3 = new EmployeeDetails3();
		e.empId();
		e.empName();
		e1.empLocation();
		e1.empPhone();
		e3.empGender();
		e3.empSalary();
		
		String l = e.loginFb();
		System.out.println(l);
	}

}
