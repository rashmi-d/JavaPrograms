package NumberArray;

import java.util.Arrays;

public class MissingNumberArray {

	public int missingnos(int[] input)
	{
		 int max = input[0]; 
	        
	      for (int i = 1; i < input.length; i++) 
	           if (input[i] > max) 
	             max = input[i]; 
	      	        return max; 
	  	}
	
	public static void main(String[] args) {
		
		MissingNumberArray a2= new  MissingNumberArray();
	    int [] a={1,4,3,5,6,10,19};
	    int b[]={1,4,3,5,6,7,9};
	    int[] c = new int[a.length+b.length];
	    int count=0;
	   
	   for(int i=0;i<a.length;i++){
		   	c[i]=a[i];
		   	count++;
	   }
	   	for(int j=0;j<b.length;j++){
	   		c[count++]=b[j];
	   	}
	   	for(int i=0;i<c.length;i++){
	   		Arrays.sort(c);
		   System.out.print(c[i]+" ");
		    }
	   int max = a2.missingnos(c);

        int[] copyArray = new int[100];
       
           for(int i : c) {
           copyArray[i] = 1;
       }
           System.out.println("Missing numbers in an array are : "); 
          for(int i=1 ;i <= max; i++){
           if(copyArray[i]==0)
        	   
               System.out.print(i + " ");
 
       	}
	   }
	}
	
