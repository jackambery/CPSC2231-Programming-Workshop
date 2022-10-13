package hw4;

public class TestHarness {

	public static void main(String[] args) {
		
		DogWalker dw = new DogWalker();
		
		//these are the top 10 dog names of 2022
		dw.addDog("luna");
		dw.addDog("charlie");
		dw.addDog("bella");
		dw.addDog("daisy");
		dw.addDog("milo");
		dw.addDog("lucy");
		dw.addDog("cooper");
		dw.addDog("bailey");
		dw.addDog("teddy");
		dw.addDog("max");
		
		dw.printDogList();
		System.out.println();
		
		dw.findDogUsingWhile("max");
		dw.findDogUsingWhile("jack"); //this is not in list, it will not print anything
		
		dw.removeDogUsingWhile("daisy");
		System.out.println(dw.removeDogUsingWhile("jack")); //testing
		System.out.println();
		dw.printDogList();
		System.out.println();
		
		dw.findDogUsingIterator("milo");
		dw.findDogUsingIterator("jeff"); //this will not print anything
		
		dw.removeDogUsingIterator("lucy");
		dw.removeDogUsingIterator("frank"); //nothing will be removed
		System.out.println();
		
		dw.printDogList();
	}

}
