package hw5;

public class TestHarness {

	public static void main(String[] args) {

		Superheros s = new Superheros();
		
		//map testing
		s.putEntryInMap("superman", "super strength");
		s.putEntryInMap("spiderman", "shoot webs");
		s.putEntryInMap("hulk", "hulk smash");
		s.putEntryInMap("captain america", "great fighter");
		s.putEntryInMap("ironman", "insane gadgets");
		
		s.displayAllMapEntries();
		
		String hulkPower = s.getEntryFromMap("hulk");
		System.out.println("Hulk's power: " + hulkPower + "\n");
		
		System.out.println("Removing Captain America...");
		s.removeEntryFromMap("captain america");
		System.out.println("");
		s.displayAllMapEntries();
		
		//set testing
		s.addToSet("shapeshifting");
		s.addToSet("invisibility");
		s.addToSet("super speed");
		s.addToSet("flight");
		s.addToSet("flight");
		s.addToSet("flight");
		s.addToSet("super speed");
		
		s.printSet();
		System.out.println("");
		System.out.println("Removing flight...");
		s.removeFromSet("flight");
		
		s.printSet();
		
	}

}
