package encapsulationExample;

import java.util.ArrayList;

public class EmployeeDetails{
	public static void main(String[] args) {
		EncapsulationExample e=new EncapsulationExample();
		e.setEmpId(1234);
		e.setName("vikram");
		e.setPhNo(98123423);
		
		EncapsulationExample e1=new EncapsulationExample();
		e1.setEmpId(9876);
		e1.setName("saanvi");
		e1.setPhNo(123457);
		
		ArrayList<EncapsulationExample> al=new ArrayList<>();
		
		al.add(e);
		al.add(e1);
		
	   for(int i=0;i<al.size();i++) {
		   System.out.println("Emp Id: "+al.get(i).getEmpId());
		   System.out.println("Emp Name: "+al.get(i).getName());
		   System.out.println("Emp Ph: "+al.get(i).getPhNo()+"\n");
	   }
	   
//	   for (EncapsulationExample encapsulationExample : al) {
//		   System.out.println(encapsulationExample.getEmpId());
//		   System.out.println(encapsulationExample.getName());
//		   System.out.println(encapsulationExample.getPhNo());	
//	}
	}
}
