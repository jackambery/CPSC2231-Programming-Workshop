package javaFinal;

public class IceCreamCup extends IceCream implements iIceCream {

	private String type; //cup or cone
	
	public IceCreamCup(String flavor, String type) {
		super(flavor);
		this.type = type;
	}
	
	@Override
	public void addTopping(String topping) {
		if (topping.equals("bonnet")) {
			System.out.println("sorry msg - no bonnet");
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
