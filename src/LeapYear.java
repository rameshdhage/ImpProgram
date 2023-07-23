
public class LeapYear {
	public static void main(String[] args) {
		
	
	int y=2016;
	
	if(y%4==0 && y%100!=0 || y%400==0) {
		System.out.println("This is leap year "+y);
	}else {
		System.out.println("This is not leap year"+y);
	}
	

	
	}

}
