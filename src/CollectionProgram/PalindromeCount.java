package CollectionProgram;

public class PalindromeCount {

	public static void main(String[] args) {
		
		String s = "abababb";
		for(int i=0;i<s.length()-2;i++)
		{
			int j=i+3;
			String s1 = s.substring(i,j);
	     	stringPalindrome(s1);
		}
	}

	public static void stringPalindrome(String str)
	{
		String str1 = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1 = str1+str.charAt(i);
		}
		if(str.equals(str1))
		{
			System.out.println(str+"------"+"String is a palindrome");
		}
			else
				System.out.println(str+"-------- " +"Given string is not a palindrome");
		}
 }