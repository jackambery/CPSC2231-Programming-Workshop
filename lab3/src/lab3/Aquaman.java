package lab3;

public class Aquaman extends Superhero {

	public Aquaman(String name) {
		super(name);
	}
	
	@Override
	public void useSuperPower() {
		System.out.println(name + " used underwater breathing and sea creature communication!");
	}
}
