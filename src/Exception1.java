
public class Exception1 {
	
	public static void main(String [] args){
		Exception1 ex=new Exception1();
		ex.getSum(0, 0);
	}

	
		private Integer getSum(int a,int b) {
			try {
			System.out.println("Inside try");
			
			throw new Exception("");
		}catch (Exception e) {
			System.out.println("inside catch");
		return 0;
		}
			finally
			{
			System.out.println("inside finally");
		    }
		
		}}	
			
			
			
	

	


