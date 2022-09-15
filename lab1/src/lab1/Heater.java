package lab1;

public class Heater {
	
	private double temperature;
	private double min;
	private double max;
	private double increment;
	
	public Heater(int min, int max) {
		this.min = min;
		this.max = max;
		
		increment = 5.0;
		temperature = 15.0;
	}
	
	public void warmer() {
		if (temperature + increment <= max) {
			temperature += increment;
		}
		else {
			System.out.println("The heater has reached it's maximum temperature.");
		}
	}
	
	public void cooler() {
		if (temperature - increment >= min) {
			temperature -= increment;
		}
		else {
			System.out.println("The heater has reached it's minimum heating temperature.");
		}
	}
	
	public void setIncrement(double value) {
		increment = value;
	}
	
	public double getTemperature() {
		return temperature;
	}	
	
}
