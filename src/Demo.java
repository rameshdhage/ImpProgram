

public class Demo {
	
	public static  String lastTwo(String str) {
		if(str.length() < 2) {
			return str;
			
		}
		String lastTwoChar=str.substring(str.length()-1);
	    String secondLast=str.substring(str.length() -2 ,str.length()-1);
        String remaining=str.substring(str.length()-2);
        
        return lastTwoChar+secondLast+remaining;
        
}
	public static void main(String[] args) {
	System.out.println(lastTwo("coding"));
	System.out.println(lastTwo("cat"));
	System.out.println(lastTwo("ab"));
}
}
	