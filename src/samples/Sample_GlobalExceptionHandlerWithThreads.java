package samples;

public class Sample_GlobalExceptionHandlerWithThreads {

	public static void main(String[] args) {
		
		Thread.currentThread().setName("Main Thread");
		Handler globalExceptionHandler = new Handler();
		Thread.setDefaultUncaughtExceptionHandler(globalExceptionHandler);
		
		ChildThread childThread = new ChildThread();
		childThread.setName("Child Thread");
        childThread.start();

	}

}

class Handler implements Thread.UncaughtExceptionHandler {
	
	public void uncaughtException(Thread t, Throwable e) {
	    System.out.println("Throwable: " + e.getMessage());
	    System.out.println(t.toString());
	  }
}

class ChildThread extends Thread {
	public void run() {
        int num1 = 10;
        int num2 = 0;
        System.out.println("Result: "+ num1/num2);
	}
 }