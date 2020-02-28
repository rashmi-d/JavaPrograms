package StringPrograms;

public class ReverseFirstHalf {

	public static void main(String[] args) {
	
		String s = "software";
		String s3="";
		int n = s.length();
		int len  = n/2;
	
	   String s2 = s.substring(0,len);
		 
		for(int i=s2.length()-1;i>=0;i--)
		{
				s3=s3+s2.charAt(i);
			}
		System.out.println(s3);
	}

}
