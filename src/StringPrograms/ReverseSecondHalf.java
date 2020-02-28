/*Program to Reverse second half of String  */

package StringPrograms;

public class ReverseSecondHalf {

	public static void main(String[] args) {
		
		String str="software";
		String s = "";
		int n = str.length();
	//	System.out.println(str.substring(n/2-1,n));
		
		String str1 = str.substring(n/2-1,n);
		
		for(int i=str1.length()-1;i>0;i--)
		{
			s=s+str1.charAt(i);
		}
		System.out.println(s);
	}
}
