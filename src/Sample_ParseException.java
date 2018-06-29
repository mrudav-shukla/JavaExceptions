import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.sound.sampled.spi.FormatConversionProvider;

public class Sample_ParseException {

	public static void main(String[] args) {
		
		String str = "Abc";
		
		
		String string = "01, , 2010";
		DateFormat format = new SimpleDateFormat("MM, dd, yyyy");
		Date date;
		try {
			date = format.parse(string);
			System.out.println(date);
		} catch (ParseException e) {
			System.out.println("ParseException caught!");
		}
	}
	
}
