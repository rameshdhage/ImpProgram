
public class PolindramNumber {
	public static void main(String[] args) {
		int num=282;
		int t=num;
		int rev=0;
		
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(rev==t) {
			System.out.println("polindram number is>>"+t);
		}else {
			System.out.println("not polindram number>>"+t);
		}
	}

}
