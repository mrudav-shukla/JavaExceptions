
public class Sample_ArithmeticException {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 0;
		
		try {
			int num3 = num1/num2; // Trying to divide by zero
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught!");
		}
		
	}
	
}
