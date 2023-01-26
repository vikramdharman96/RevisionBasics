package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>(); //wrapperclass to store similar datatype
		al.add(4);
		al.add(6);
		al.add(2);
		al.add(4);
		al.add(1);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
		
	// To convert Array into Arraylist----Array will allow similar data type
		String s[]= {"vikram","saanvi","biju","susmi"};
		for (String string : s) {
			System.out.println(string);
		}
		// Arrays is predefined class present in java.util package
		ArrayList all=new ArrayList(Arrays.asList(s));
		System.out.println(all);
	
		
//		List<String> asList = Arrays.asList(s);
//		System.out.println(asList);
//		
		
		
		
		
		
		
	}

}
