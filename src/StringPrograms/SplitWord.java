package StringPrograms;

public class SplitWord {

	public static void main(String[] args) {
		
		String str = "abcxyxbnun is a palindrome";
		String[] str1 = str.split("\\s");
		
			String[] str2 = str1[0].split("");
			
			  for(int i=0;i<str2.length-1;i++)
			  {
				 	System.out.println(str2[i]);
			}
		}
}
