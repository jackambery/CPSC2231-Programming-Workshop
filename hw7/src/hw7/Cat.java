package hw7;

public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void makesSound() {
		System.out.println("meoww!");
	}

}
