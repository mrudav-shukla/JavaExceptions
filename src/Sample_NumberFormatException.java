
public class Sample_NumberFormatException {

	public static void main(String[] args) {
		
		String str1 = "100ABCD";
		
		try {
			int x = Integer.parseInt(str1); // Converting string with inappropriate format
			int y = Integer.valueOf(str1);
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException caught!");
		}
		
	}
	
}
