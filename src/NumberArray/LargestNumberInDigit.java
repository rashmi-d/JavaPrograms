package NumberArray;

import org.testng.collections.Objects.ToStringHelper;

public class LargestNumberInDigit {

	public static void main(String[] args) {
	
		int n = 94654657;
		int max = 0;
	
		while(n>0)
		{
	      int  rem = n%10;
	       if(rem>=max)
	    	   max=rem;
		      n=n/10;
	         }
		System.out.println(max);
		
		
	}

}
