package StringPrograms;

public class ReverseFirstHalf2 {

public static void reverseHalf(String str){
		int n=str.length();
		String s1 = str.substring(0,n/2);
		StringBuilder s = new StringBuilder(s1);
		System.out.println(s.reverse());
		}
	
	public static void main(String[] args) {
					reverseHalf(" softwaretesting");
		}

}
