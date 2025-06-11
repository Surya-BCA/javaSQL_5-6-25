import java.util.*;

public class CatchException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the number a:");
			int a = s.nextInt();
			System.out.println("Enter the number b:");
			int b = s.nextInt();
			System.out.println("result:" + (a / b));

		} catch (ArithmeticException e) {

			int result = 0;
			if (result == 0) {
				System.out.println("Succesfully executed");
			} else {
				System.out.println("Error Found");
			}
		}

	}

}
