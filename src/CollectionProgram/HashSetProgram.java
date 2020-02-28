package CollectionProgram;

import java.util.*;

public class HashSetProgram {

	public static void main(String[] args) {
		
		HashSet<String>  hs = new HashSet<>();
				
		/*Not Follow order of insertion*/
		hs.add("rash");
		hs.add("sush");
		hs.add("ash1");
		hs.add("ash2");
		hs.add("ash3");
		hs.add("ash4");
	
		
		/*It will not allow duplicate*/
		hs.add("ash1");
				
		for(String text:hs)
		System.out.println(text);
		
		HashSet<Integer>  hs1 = new HashSet<Integer>();
		hs1.add(9);
		System.out.println(hs1);
		
		Set <String> s = new TreeSet<String>(hs);
		System.out.println(s);
		
		/*Linked List follow order of insertion */
		
 		LinkedList<String> ll = new LinkedList<>();
 		ll.add("assd");
 		ll.add("sdsd");
 		ll.add("hasf");
 		ll.add("sdsfd");
 		
 		System.out.println(ll);
		}

}
