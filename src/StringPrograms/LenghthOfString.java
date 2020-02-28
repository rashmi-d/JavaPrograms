/*Find the length of String without using length()*/

package StringPrograms;

public class LenghthOfString {
	
	public static void main(String[] args) {
		
		String s = "testing";
		int count=0;
		char[] ch=s.toCharArray();
		
		for(int i =0; i<ch.length;i++){
		if(ch!=null)
		{
			count++;
		}
	}
		System.out.println(count);
	}
	
}
