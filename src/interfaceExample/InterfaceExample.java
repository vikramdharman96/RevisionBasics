package interfaceExample;


interface Test{
	int a=10;    //by default its static and final variable
	int b=10;
	void display();//by default its abstract method
	void add();
}

interface Test1{
	
	int c=10;
	void show();

}


public class InterfaceExample implements Test, Test1{				//use implements keyword to acccess Interface 
	
	@Override
	public void display() {
		System.out.println(a);
	}

	@Override
	public void add() {
		System.out.println(a+b);
	}
	@Override
	public void show() {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		InterfaceExample s=new InterfaceExample();
		s.display();
		s.add();
		s.show();
		
		
		
	}

	
	
	
	
	


}
