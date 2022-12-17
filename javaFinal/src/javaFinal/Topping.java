package javaFinal;

import java.util.ArrayList;
import java.util.List;

public class Topping {
	
	private List<String> toppings;
	
	public Topping() {
		toppings = new ArrayList<String>();
	}
	
	public void addTopping(String topping) {
		toppings.add(topping);
	}
	
	public void display() {
		System.out.println("The ice cream has these toppings:");
		for (String t : toppings) {
			System.out.println(t);
		}
	}
}
