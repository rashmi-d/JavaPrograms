//Program to print the number of alphabets

package StringArray;

public class AlphaCount 
{
	public static void main(String[] args)
	{
		String str= "love my Son";
		String[] arr = str.split(" ");
		
		for(int i = 0;i<arr.length;i++)
		{
			String str2 =arr[i];
			String str3="";
			for(int j=str2.length()-1;j>=0;j--)
			{
				str3=str3+str2.charAt(j);
			}
				System.out.print(str3+" "+str3.length()+" ");
			}
		}
			
		}
		

		


