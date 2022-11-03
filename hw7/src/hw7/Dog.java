package hw7;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void makesSound() {
		System.out.println("WOOF WOOF");
	}
	
}
