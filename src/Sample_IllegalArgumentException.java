
public class Sample_IllegalArgumentException {

	public static void main(String[] args) throws InterruptedException {

		try {
			Thread.currentThread().sleep(-10000);
		}catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException caught!");
		}		
		
	}
	

}
