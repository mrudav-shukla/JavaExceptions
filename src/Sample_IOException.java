import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample_IOException {

	public static void main(String[] args) throws IOException{
		
		File localFile = new File("RandomLocation");
		BufferedReader br = null;
		try {
			FileReader fileReader = new FileReader(localFile); // throws FileNotFoundException
			br = new BufferedReader(fileReader); 
			
			String st = null;
			
			while ((st = br.readLine()) != null) { // throws IOException
			    System.out.println(st);
			 }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
		
	}

}
