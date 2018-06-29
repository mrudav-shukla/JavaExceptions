import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Sample_MalformedURLException {

	public static void main(String[] args) {
		
		URL baeldungURL = null;
		
		
		try {
			baeldungURL = new URL("malformedurl"); // throws MalformedURLException
			
			URLConnection myURLConnection = baeldungURL.openConnection(); // throws IOException
		   
			BufferedReader in = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
			String inputLine = "";
			
			while ((inputLine = in.readLine()) != null) { // throws IOException
				System.out.println(inputLine);
			}
			
			in.close(); // throws IOException
		    
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
