package hw3;

public class TestHarness {

	public static void main(String[] args) {

		BeachReport br = new BeachReport();
		
		br.addJournal("laguna beach", "moderate", 5);
		br.addJournal("second beach", "busy", 7);
		br.addJournal("virginia beach", "moderate", 6);
		br.addJournal("big wave beach", "quiet", 12);
		br.addJournal("goo lagoon", "very busy", 1);
		
		System.out.println(br.getJournalCount() + " journals have been added the beach report.\n");
		
		System.out.println("Checking if \"goo lagoon\" is in report:");
		String temp = "goo lagoon";
		for (int i = 0; i < br.getJournalList().size(); i++) {
			if (br.getJournalList().get(i).getName().equals(temp)) {
				System.out.println(temp + " is in the list.\nHere is the report: ");
				br.getJournalList().get(i).report();
			}
		}
		
		br.showAllBeaches();
		System.out.println("\nRemoving second beach...\n");
		br.removeJournal("second beach");
		br.showAllBeaches();
		
		System.out.println("\nUsing a while loop: ");
		int index = 0;
		while (index < br.getJournalList().size()) {
			System.out.println(br.getJournalList().get(index).getName());
			index++;
		}
		
		System.out.println("\nUsing a for-each loop:");
		for(DailyBeachJournal beach : br.getJournalList()) {
			System.out.println(beach.getName());
		}
		
		System.out.println("\n--- Full Report ---");
		br.fullReport();
	}

}
