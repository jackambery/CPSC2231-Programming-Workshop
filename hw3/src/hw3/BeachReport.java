package hw3;

import java.util.ArrayList;
import java.util.List;

public class BeachReport {
	
	private List<DailyBeachJournal> dailyBeachJournals = new ArrayList<>();

	public void addJournal(DailyBeachJournal dbj) {
		dailyBeachJournals.add(dbj);
	}
	
	public void removeJournal(DailyBeachJournal dbj) {
		dailyBeachJournals.remove(dbj);
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
