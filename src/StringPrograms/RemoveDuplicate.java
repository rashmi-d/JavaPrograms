/*program to remove duplicate character in string*/

package StringPrograms;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		        String str1 = "softwaretesting";
		        System.out.println(removeDuplicateChars(str1)+ "  " +removeDuplicateChars(str1) .length());
		        String str2 = "teest";
		        System.out.println(removeDuplicateChars(str2)+" " +removeDuplicateChars(str2).length());
		    }
		 
		    private static String removeDuplicateChars(String sourceStr) {
		
		        char[] chrArray = sourceStr.toCharArray();
		        String targetStr = "";
		       for (char value : chrArray) {
		                 if (targetStr.indexOf(value) == -1) {
		                targetStr += value;
		                }
		        }
		        return targetStr;
		    }
}
