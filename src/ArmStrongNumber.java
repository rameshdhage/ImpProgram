
public class ArmStrongNumber {
	
	public static void main(String[] args) {
		int num=370;
		
		int sum=0;
		int rem;
		int temp=num;
	
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
			
		}if(temp==sum) {
			
	     System.out.println("This number is armStrong number>>"+temp);
		}
		else {
			System.out.println("This number is not armStrong number>>"+temp);
		}
			
	}
	
	}

