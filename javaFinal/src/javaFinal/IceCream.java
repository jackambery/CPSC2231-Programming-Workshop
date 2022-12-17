package javaFinal;

public class IceCream implements iIceCream {

	private String flavor;
	private Topping topping;
	
	public IceCream(String flavor) {
		this.flavor = flavor;
		this.topping = new Topping();
	}
	
	public void addTopping(String topping) {
		this.topping.addTopping(topping);
	}
	
	public void display() {
		System.out.println("The flavor of this ice cream is " + flavor + ".");
		topping.display();
	}

}
