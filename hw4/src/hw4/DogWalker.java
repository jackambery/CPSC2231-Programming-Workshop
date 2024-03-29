package hw4;

import java.util.ArrayList;
import java.util.Iterator;
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
		System.out.println("Here are the dogs: ");
		int i = 1; //this is extra to number the list
		for (String dog : doggies) {
			System.out.println(i + ". " + dog);
			i++;
		}
	}
	
	public void findDogUsingWhile(String dogName) {
		int index = 0;
		while (index < doggies.size()) {
			if (dogName.equals(doggies.get(index))) {
				System.out.println(doggies.get(index) + " is in the list!");
			}
			index++;
		}
	}
	
	//not sure why this method was suppose to return String
	public String removeDogUsingWhile(String dogName) {
		int index = 0;
		while (index < doggies.size()) {
			if (dogName.equals(doggies.get(index))) {
				System.out.println(doggies.get(index) + " has been removed.");
				String dog = doggies.get(index);
				doggies.remove(index);
				return dog;
			}
			index++;
		}
		return dogName + " was not found in the list";
	}
		
	public void findDogUsingIterator(String dogName) {
		Iterator<String> iter = doggies.iterator();
		
		while (iter.hasNext()) {
			String currentDog = iter.next();
			if (currentDog.equals(dogName)) {
				System.out.println("I found my dog: " + dogName);
			}
		}
	}

	public void removeDogUsingIterator(String dogName) {
		Iterator<String> iter = doggies.iterator();

		while (iter.hasNext()) {
			String currentDog = iter.next();
			if (currentDog.equals(dogName)) {
				iter.remove();
				System.out.println(dogName + " has been removed.");
			}
		}
	}
	
	
}





