package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[]args) {
	//	HashMap m=new HashMap();   //default capacity 16 Load Factor 0.75
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		
		m.put(101, "vikram");
		m.put(102, "Saanvi");
		m.put(103, "bijju");
		m.put(104, "puppy");
		m.put(105, "vikram");
		
		System.out.println(m);
		
		System.out.println(m.get(104));
		
		m.remove(102);
		System.out.println(m);
		
		System.out.println(m.containsKey(103));
		System.out.println(m.containsValue("bijju"));
		
		System.out.println(m.isEmpty());
		
		System.out.println(m.keySet()); //return set of key
		
		System.out.println(m.values()); //return set of value
		
		System.out.println(m.entrySet()); //return all the entries as Set
		
		
		//to read all keys
		for (Object i : m.keySet()) {
			System.out.println(i);
			
		}
		
		//to read al values
		for (Object v : m.values()) {
			System.out.println(v);
			
		}
		
		//to read both key and values
		
		for (Object kv : m.keySet()) {
			
			System.out.println(kv+"   "+m.get(kv));
			
		}
		
		
		//Entry methods /enable second object (K,v)
		
		for (Map.Entry entry : m.entrySet()) 
		{
			System.out.println(entry.getKey()+"-----"+entry.getValue());
			
			//System.out.println(entry);
		}
		
		Set entrySet = m.entrySet();
		
		
		//Iterator
		Iterator iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		
		
		
		
		
		
		
		
	}

}
