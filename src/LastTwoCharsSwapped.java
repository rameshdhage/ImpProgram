
public class LastTwoCharsSwapped {
	
	
	    public static String lastTwo(String str) {
	        if (str.length() < 2) {
	            return str;
	        }

	        String lastChar = str.substring(str.length() - 1);
	        String secondLastChar = str.substring(str.length() - 2, str.length() - 1);
	        String remainingChars = str.substring(0, str.length() - 2);

	        return lastChar + secondLastChar +remainingChars;
	    }

	    public static void main(String[] args) {
	        System.out.println(lastTwo("coding"));  // Output: "codign"
	        System.out.println(lastTwo("cat"));  // Output: "cta"
	        System.out.println(lastTwo("ab"));  // Output: "ba"
	    }
	}
	
	

