package lab1;

public class TestHarness {

	public static void main(String[] args) {
		
		Heater h = new Heater(10, 30);
		h.cooler(); //temperature = 10
		h.warmer(); //temperature = 15
		h.warmer(); //temperature = 20
		
		double currentTemp = h.getTemperature();
		System.out.println("The temperature is " + currentTemp);
		
		h.setIncrement(20);
		h.warmer(); //too hot, 40
		h.cooler(); //too cold, 0
		
		h.setIncrement(3);
		h.warmer(); //temperature is 23
		
		currentTemp = h.getTemperature();
		System.out.println("The temperature is " + currentTemp);
	}

}
