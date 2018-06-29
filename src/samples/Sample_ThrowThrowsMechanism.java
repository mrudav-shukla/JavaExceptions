package samples;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample_ThrowThrowsMechanism {

	public static void main(String[] args) {

		String strDate = "01, , 2010";
		String dateFormat = "MM, dd, yyyy";
		
		try {
			Date date = new DateParser().getParsedDate(strDate, dateFormat);
		} catch (ParseException e) {
			System.out.println("The calling method caught ParseException!");
		}
		
	}
	
}

class DateParser {
	
	public Date getParsedDate(String strDate, String dateFormat) throws ParseException {
		DateFormat format = new SimpleDateFormat(dateFormat);
		try {
			return format.parse(strDate);
		} catch (ParseException parseException) {
			throw parseException;
		}		
	}
	
}
