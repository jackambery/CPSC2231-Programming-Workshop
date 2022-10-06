package hw4;

import java.util.ArrayList;
import java.util.List;

public class DogWalker {
	
	private List<String> doggies;
	
	public DogWalker() {
		doggies = new ArrayList<String>();
	}
	
	public void addDog(String name) {
		doggies.add(name);
	}
	
	public void printDogList() {
		for (String dog : doggies) {
			System.out.println(dog);
		}
	}
	
	
}
