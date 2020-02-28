package StringPrograms;

import java.util.Arrays;

public class AnagramProgram {
	
	public static boolean anagram(String  str1,String str2)
	{
		int n1= str1.length();
		int n2 = str2.length();
		
		if(n1!=n2)
			return false;
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i = 0;i<n1;i++)
		
			if(ch1[i]!=ch2[i])
				return false;
			return true;
		}
	
	
	public static void main(String[] args) {
		String s1 = "mom";
		String s2 = "momee";
		if(anagram(s1,s2))
		System.out.println("Two strings are equals : ");
		else
			System.out.println("Two strings are not equals");
			
	
	}

}
