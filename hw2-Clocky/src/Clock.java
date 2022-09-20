/*
 * Name: Jack Ambery
 * Assignment: hw2
 * Date: 20 September 2022
 * This is the Clock class for hw2.
 */

public class Clock {
	
	private ClockAlarm clockAlarm = new ClockAlarm();
	private String currentTime;
	
	public Clock(String alarmTime, String currentTime) {
		//clockAlarm = new ClockAlarm();
		clockAlarm.addAlarmTime(alarmTime);
		this.currentTime = currentTime;
	}
	
	public Clock(String currentTime) {
		this.currentTime = currentTime;
	}
	
	public void setAlarmTime(String time) {
		clockAlarm.addAlarmTime(time);
	}
	
	public void removeAlarmTime(String time) {
		clockAlarm.deleteAlarmTime(time);
	}
	
	public void showAlarmTimes() {
		clockAlarm.displayAlarmTimes();
	}
	
	public ClockAlarm getClockAlarm() {
		return clockAlarm;
	}
	
	public void setClockAlarm(ClockAlarm clockAlarm) {
		this.clockAlarm = clockAlarm;
	}
	
	public String getCurrentTime() {
		return currentTime;
	}
	
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	
	public void print() {
		System.out.println("The current time is: " + currentTime);
		System.out.print("The following alarms are set: ");
		clockAlarm.displayAlarmTimes();
	}
	
	
	
}
