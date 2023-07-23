
public class LargeThreeNumber {
	public static void main(String[] args) {
		  int x=100;
		  int y=200;
		  int z=300;
		  
		  if(x>y && x>z) {
			  System.out.println("The largest number among three number is>>"+x);
		  }
		  else if(y>x &&y>z) {
			  System.out.println("The largest number among three number is>>"+y);
		  }
		  else if (z>y && z>x){
			  System.out.println("The largest number among three number is>>"+z);
		  }
		  else {
			  System.out.println("Invalid input");
		  }
		  
	}

}
