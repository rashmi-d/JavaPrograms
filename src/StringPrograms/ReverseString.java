/*Reverse a String using built in method and check for palindrome*/

package StringPrograms;

public class ReverseString {
	
	public static void main(String[] args)
	{
		String s = "mom";
		StringBuilder build = new StringBuilder(s);
		System.out.println(build.reverse());
	   
		StringBuilder s1=build.reverse();
		String s2 = new String(s1);
    	if(s.equals(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
