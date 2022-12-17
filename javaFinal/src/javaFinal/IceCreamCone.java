package javaFinal;

public class IceCreamCone extends IceCream {
	
	private String type; //cup or cone
	
	public IceCreamCone(String flavor, String type) {
		super(flavor);
		this.type = type;
	}
	
	@Override
	public void addTopping(String topping) {
		if (topping.equals("banana")) {
			System.out.println("sorry msg - no banana");
		}
		else {
			super.addTopping(topping);
		}
	}
	
	@Override
	public void display() {
		System.out.println("This ice cream is in a " + type);
		super.display();
	}
	
}
