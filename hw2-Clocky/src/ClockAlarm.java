/*
 * Name: Jack Ambery
 * Assignment: hw2
 * Date: 20 September 2022
 * This is the ClockAlarm class for hw2.
 */

import java.util.ArrayList;
import java.util.List;

public class ClockAlarm {
	
	private List<String> alarmTimes = new ArrayList<String>();

	public void addAlarmTime(String alarm) {
		alarmTimes.add(alarm);
	}
	
	public void deleteAlarmTime(String alarm) {
		alarmTimes.remove(alarm);
	}
	
	public void displayAlarmTimes() {
		System.out.println("The following alarms are set: ");
		for (String s : alarmTimes) {
			System.out.println(s);
		}
	}
	
	public List<String> getAlarmTimes() {
		return alarmTimes;
	}

	public void setAlarmTimes(List<String> alarmTimes) {
		this.alarmTimes = alarmTimes;
	}
	
	
	
}
