package hw3;

public class TestHarness {

	public static void main(String[] args) {

		BeachReport br = new BeachReport();
		
		DailyBeachJournal laguna = new DailyBeachJournal("laguna beach", "moderate", 5);
		DailyBeachJournal second = new DailyBeachJournal("second beach", "busy", 7);
		DailyBeachJournal virginia = new DailyBeachJournal("virginia beach", "moderate", 6);
		DailyBeachJournal wave = new DailyBeachJournal("big wave beach", "quiet", 12);
		DailyBeachJournal goo = new DailyBeachJournal("goo lagoon", "very busy", 1);
		
		br.addJournal(laguna);
		br.addJournal(second);
		br.addJournal(virginia);
		br.addJournal(wave);
		br.addJournal(goo);
		
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
		br.removeJournal(second);
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
