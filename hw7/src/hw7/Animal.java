package hw7;

public class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void makesSound() {
		System.out.println("** crickets **");
	}
	
	public String getName() {
		return name;
	}
	
}
