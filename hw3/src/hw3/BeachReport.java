package hw3;

import java.util.ArrayList;
import java.util.List;

public class BeachReport {
	
	private List<DailyBeachJournal> dailyBeachJournals = new ArrayList<>();

	public void addJournal(String name, String activity, int suntan) {
		DailyBeachJournal dbj = new DailyBeachJournal(name, activity, suntan);
		dailyBeachJournals.add(dbj);
	}
	
	public void removeJournal(String name) {
		for (int i = 0; i< dailyBeachJournals.size(); i++) {
			if (dailyBeachJournals.get(i).getName().equals(name)) {
				dailyBeachJournals.remove(dailyBeachJournals.get(i));
			}
		}
	}
	
	public DailyBeachJournal findBeach(DailyBeachJournal dbj) {
		if (dailyBeachJournals.contains(dbj)) {
			System.out.println(dbj.getName() + " is in the beach report.");
			return dbj;
		}
		else {
			System.out.println(dbj.getName() + " was not found in the report.");
			return null;
		}
	}
	
	public void showAllBeaches() {
		for (DailyBeachJournal dbj : dailyBeachJournals) {
			System.out.println(dbj.getName());
		}
	}
	
	public int getJournalCount() {
		return dailyBeachJournals.size();
	}
	
	public List<DailyBeachJournal> getJournalList() {
		return dailyBeachJournals;
	}
	
	public void fullReport() {
		for (DailyBeachJournal dbj : dailyBeachJournals) {
			dbj.report();
		}
	}
}
