package javaFinal;

import java.util.ArrayList;
import java.util.List;

public class TestHarness {

	public static void main(String[] args) {
		
		List<IceCream> icl = new ArrayList<IceCream>();
		
		IceCream ic1 = new IceCreamCone("vanilla", "cone");
		IceCream ic2 = new IceCreamCup("chocolate", "cup");
		IceCream ic3 = new IceCreamCup("mint chocolate chip", "cup");
		
		// verifying logic
		ic1.addTopping("banana");
		ic2.addTopping("bonnet");
		
		ic1.addTopping("sprinkles");
		ic2.addTopping("gummy worms");
		ic3.addTopping("m&m's");
		
		icl.add(ic1);
		icl.add(ic2);
		icl.add(ic3);
		
		for(IceCream ic : icl) {
			ic.display();
			System.out.println();
		}
		
	}

}
