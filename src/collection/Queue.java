package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args) {
		PriorityQueue q =new PriorityQueue(); //allows similardatatype--not allowed hetrogenios data
		
		q.add('A');
		q.add('B');
		q.add('C');
		q.add('D');
		q.offer('C');
		
		System.out.println(q); // duplicates and insertion order
		
//		System.out.println(q.element());  //Returns head &if empty returns NosuchElementException
//		System.out.println(q.peek());   //returns head &if empty null
		
		
//		System.out.println(q.remove());  //return and remove header element  & if empty NosuchElementException
//		System.out.println(q);
//		System.out.println(q.poll());  //return and remove header element & if empty null
//		System.out.println(q);
		
		
		Iterator iterator = q.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	}

}
