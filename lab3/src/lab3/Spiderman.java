package lab3;

public class Spiderman extends Superhero {

	public Spiderman(String name) {
		super(name);
	}
	
	@Override
	public void useSuperPower() {
		System.out.println(name + " used spidey senses!");
	}

}
