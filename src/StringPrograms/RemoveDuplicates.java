package StringPrograms;

import java.util.Scanner;

public class RemoveDuplicates {

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
			// ignore white spaces and then increment
			if(str.charAt(i)!=' ')
		    		arr[str.charAt(i)]++;
		}
		// now traverse the array
		for(int i=0;i<str.length();i++){
			
			//ignore white spaces count
             if(str.charAt(i)!= ' '){
            	 //if the array index value is greater than 0,ie if it is occured then print
            	 if(arr[str.charAt(i)]!=0){ 
            		 System.out.print(str.charAt(i));
            		 //and then set the respective array value to 0,so that it may not repeat again
            		 arr[str.charAt(i)]=0;
            	 }
             }
            	// to print the white spaces
             else{
            	 System.out.print(str.charAt(i));
             }
		}
		sc.close();
	}

}
