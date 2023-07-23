
public class ReverseNumber {
	public static void main(String[] args) {
		  int num=123;
		  
		  int r=0;
		  while(num>0){
			  r=num%10;
			  System.out.print(r);
				  num=num/10;
			  }
		  }
	}


