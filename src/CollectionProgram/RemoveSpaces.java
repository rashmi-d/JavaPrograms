package CollectionProgram;

import java.util.*;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
 
		al.add("  " );
		al.add("asdd");
		al.add("dfdf");
		al.add("  ");
	    
		ArrayList<String> al1 = new ArrayList<>();
		for(int i =0;i<al.size();i++)
		{
			if(al.get(i).equals("  "))
			{
				
			}
			else
			{
				al1.add(al.get(i));
			}
		}
	System.out.println(al1);
	}
}
		

	