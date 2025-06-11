public class Exception {

	public static void main(String[] args) {
		
		try {
			int x=5;
			int y =0;
			System.out.println("result:"+(x/y));
		} 
		catch (ArithmeticException e) {
			System.out.println("Error Found");
		}
		finally {
			System.out.println("try later");
		}
	}
	

}
