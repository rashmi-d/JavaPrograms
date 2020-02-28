/*count the number of occurence of each character*/

package StringPrograms;

import java.util.Scanner;

public class OrderOfOccurence {

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		
	  /* create a integer array of size 122(256 recommended to store special characters) */
		
		int [] arr = new int[256];
		
		//On occurance of each character,increment the arr[] array
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
		    continue;
			
			arr[str.charAt(i)]++;
		}
		for(int i =0;i<256;i++)
		{
		if(arr[i]>1)
				System.out.println((char)(i)+" "+arr[i]);
		}
		sc.close();
	}
}




