package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[]args) {
		ArrayList li=new ArrayList();
		
		li.add(20);
		li.add("vikram");
		li.add(987654363124l);
		li.add(true);
		li.add(13241.234);
		li.add('a');
		li.add(null);
		System.out.println(li);
		
		
		
		int indexOf = li.indexOf(true);
		System.out.println("indexof: "+indexOf);
		
		System.out.println(li.lastIndexOf(null));
		
		System.out.println(li.indexOf("ram"));// return -1 if we print unknown value
		
		boolean contains = li.contains(13241.234);
		System.out.println(contains);
		
		System.out.println(li.set(3, "ram"));
		
		Object object = li.get(1);
		System.out.println(object);
		
		
		
		System.out.println("******LinkedList********");
		
		LinkedList li1=new LinkedList();
		
		li1.add(30);
		li1.add("vikram");
		li1.add('d');
		li1.add(false);
		li1.add("saanvi");
		
		System.out.println(li1);
		
		li1.addAll(li);
		System.out.println(li1);

		
		System.out.println("RetainAll: "+li1.retainAll(li));
		
		
		
		//for loop
		for(int i=0;i<li1.size();i++) {
			System.out.println(li1.get(i));
		}
		
		//foreach
		System.out.println("***foreach********");
		for (Object object2 : li1) {
			System.out.println(object2);
			
		}
		
		
		
		
//     Iterator method to read all data		
//		Iterator iterator = li.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}
		
	
		
		
		
		
		
		
	}
}
