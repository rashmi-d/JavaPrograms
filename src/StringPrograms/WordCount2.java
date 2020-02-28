package StringPrograms;

public class WordCount2 {

	public static void main(String[] args) {

		String str = "How are you";
		char[] ch= str.toCharArray();
		 int space = 0;
		 
		 for(char c:ch)
		 {
			 if(c==' ')
			 {
				 space++;
				}
		 }
			System.out.println("No of words  :"+(space+1));
		
	}
}
