package NumberArray;

public class SumofDigit {

	public static void main(String[] args) {
	
		int no=325;
			
		int third = no%10;
		no=no/10;
		
		int second = no%10;
		no=no/10;
		
		if(third==second+no){
			System.out.println(third);
		}
	}

}
