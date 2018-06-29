
class ChildThread extends Thread {
	public void run() {
		try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread at: " + i);
            
                // Calling a sleep on child thread.
                // So that main thread gets chance of execution.
                Thread.sleep(1000);
                System.out.println("Child thread at: " + i + " out of sleep.");
            }
        }
        catch (InterruptedException e) {
            System.out.println("Child thread is interrupted!");
        }
	}
 }

public class Sample_InterruptedException {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main thread executing.");
		
		ChildThread childThread = new ChildThread();
        childThread.start();
        Thread.sleep(1200);
        // main thread calls interrupt() method on 
        // child thread
        childThread.interrupt();
 
    }
	
}
