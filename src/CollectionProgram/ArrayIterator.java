package CollectionProgram;

import java.util.*;

public class ArrayIterator {
	
	public static void main(String args[]){  
		
		//Creating arraylist	
	ArrayList<String> list=new ArrayList<String>();    
	
	//Adding object in arraylist
	list.add("abc");  
	list.add("Vijay");  
	list.add("xyz");  
	list.add("Ajay");  
	
	//Traversing list through Iterator   
	
    Iterator  itr=list.iterator();  
	
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
}
	

