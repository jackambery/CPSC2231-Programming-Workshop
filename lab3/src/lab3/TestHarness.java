package lab3;

import java.util.ArrayList;
import java.util.List;

public class TestHarness {

	public static void main(String[] args) {

		Factory factory = new Factory();
		
		Superhero aquaman = factory.getSuperhero(Heros.AQUAMAN, "jason mamoa");
		Superhero spiderman = factory.getSuperhero(Heros.SPIDERMAN, "peter parker");
		Superhero hulk = factory.getSuperhero(Heros.HULK, "bruce banner");
		
		List<Superhero> squad = new ArrayList<Superhero>();
		squad.add(aquaman);
		squad.add(spiderman);
		squad.add(hulk);
		
		for (Superhero s : squad) {
			s.useSuperPower();
		}
		
	}

}
