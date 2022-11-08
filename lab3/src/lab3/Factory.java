package lab3;

public class Factory {

	public Superhero getSuperhero(Heros h, String name) {
		
		Superhero s = null;
		switch (h) {
		case AQUAMAN:
			s = new Aquaman(name);
			break;
		case SPIDERMAN:
			s = new Spiderman(name);
			break;
		case HULK:
			s = new Hulk(name);
			break;
		default:
			break;
		}
		
		return s;
	}
	
}
