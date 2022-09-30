package hw3;

public class DailyBeachJournal {
	
	private String beachName;
	private String beachActivity;
	private int suntanIndex;
	
	public DailyBeachJournal(String beachName, String beachActivity, int suntanIndex) {
		this.beachName = beachName;
		this.beachActivity = beachActivity;
		this.suntanIndex = suntanIndex;
	}
	
	public void report() {
		System.out.println("Beach: " + beachName);
		System.out.println("Activity Level: " + beachActivity);
		System.out.println("Suntan Index: " + suntanIndex + "\n");
	}
	
	public String getName() {
		return beachName;
	}
}
