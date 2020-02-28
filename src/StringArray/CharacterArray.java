package StringArray;

public class CharacterArray {
	
	public static void main(String[] ar){
	String str = "Rashmi";
	
	/*Getting each character without using string class*/
	char[] ch= str.toCharArray();
	
	for(int i =0;i<str.length();i++)
	{
	System.out.println(ch[i]);
	}
	/*Getting each character with string class*/	
	for(int i = 0;i<str.length();i++)
	{
	
		System.out.println(str.charAt(i));
		}
	}
}
