
class Animal {

}

class Dog extends Animal {
	
}

class Lion extends Animal {
	
}

public class Sample_ClassCastException {

	public static void main(String[] args) {
		
		try {
			Animal animal = new Dog(); // At runtime the instance is dog
			Dog bruno = (Dog) animal; // Downcasting
			
//			Animal animal2 = new Lion(); // At runtime the instance is animal
//			Dog tommy = (Dog) animal2; // Downcasting
		}catch (ClassCastException e) {
			System.out.println("ClassCastException caught!");
		}
		
	}

}
