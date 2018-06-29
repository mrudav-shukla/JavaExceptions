import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample_IllegalStateException {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i);
		}
		
		Iterator<Integer> intListIterator = intList.iterator(); //Initialized with index at -1
		
		try {
			intListIterator.remove(); // IllegalStateException
		}catch(IllegalStateException e) {
			System.out.println("IllegalStateException caught!");
		}
		
	
	}
	
}
