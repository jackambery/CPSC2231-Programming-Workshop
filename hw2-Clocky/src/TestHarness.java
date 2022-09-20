/*
 * Name: Jack Ambery
 * Assignment: hw2
 * Date: 20 September 2022
 * This is the client class for hw2.
 */

public class TestHarness {

	public static void main(String[] args) {
		
		Clock clock = new Clock("5:30");
		
		String time = clock.getCurrentTime();
		System.out.println("The current time is " + time);
		
		clock.setAlarmTime("7:30");
		clock.showAlarmTimes();
		
		clock.getClockAlarm().addAlarmTime("7:35");
		clock.getClockAlarm().addAlarmTime("7:36");
		clock.showAlarmTimes();
		
		clock.removeAlarmTime("7:30");
		clock.showAlarmTimes();

	}

}
