package hw7;

import java.util.ArrayList;
import java.util.List;

public class TestHarness {

	public static void main(String[] args) {
		
		List<Animal> animalList = new ArrayList<Animal>();
		
		Dog d = new Dog("henry");
		Cat c = new Cat("sue");
		BeardedDragon bd = new BeardedDragon("drew");
		
		animalList.add(d);
		animalList.add(c);
		animalList.add(bd);
		
		for (Animal a : animalList) {
			System.out.print("My name is " + a.getName() + "! ");
			a.makesSound();
		}

	}

}
