package collection;

import java.util.HashSet;

public class SetExample {
	public static void main(String[]args) {
		HashSet al =new HashSet();   //default capacity 16 Load Factor 0.75
		
	//	HashSet s=new HashSet(100); //initail capacity 100
		
	//	HashSet s=new HashSet(100,(float)0.95);  //load factor
	   
	//	HashSet<Integer> s=new HashSet<Integer>();  //similar datatype
		
		al.add(4);
		al.add("vikram");
		al.add("true");
		al.add(null);
		al.add(1);
		
		
	
	}

}
