package by.zakharovamaria.flowershop.flowers;

public abstract class Flower {
	
	private String color;             
	protected float price;             
	
	protected Flower(String color) {
		this.color = color;	
	}

	public String getColor() {
		return color;
	}
	
	public float getPrice() {
		return price;
	}
}
