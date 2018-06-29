package samples;

public class Sample_GlobalExceptionHandler {

	public static void main(String[] args) {
		
//		Handler globalExceptionHandler = new Handler();
//		Thread.setDefaultUncaughtExceptionHandler(globalExceptionHandler);
		
		DivisionOperation divisionObj = new DivisionOperation(10, 0);
		System.out.println("Result: " + divisionObj.divide());
		
	}

}

//class Handler implements Thread.UncaughtExceptionHandler {
//	
//	public void uncaughtException(Thread t, Throwable e) {
//	    System.out.println("Throwable: " + e.getMessage());
//	    System.out.println(t.toString());
//	  }
//}

class DivisionOperation {
	
	int num1;
	int num2;
	
	public DivisionOperation(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int divide() {
		return num1/num2;
	}
}
