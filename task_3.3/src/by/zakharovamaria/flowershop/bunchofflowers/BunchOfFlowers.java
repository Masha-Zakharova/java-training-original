package by.zakharovamaria.flowershop.bunchofflowers;

import by.zakharovamaria.flowershop.flowers.Flower;

public class BunchOfFlowers {

	private Flower[] bouquet;
	
	public BunchOfFlowers() {
		this.bouquet = new Flower[0];
	}
	
	public void add(Flower flower) {
		int volume = bouquet.length;
		Flower[] tmp = new Flower[volume + 1];
		System.arraycopy(bouquet, 0, tmp, 0, volume);
		tmp[volume] = flower;
		bouquet = tmp;
	}
	
	public float totalCost() {
		float totalCost = 0;
		
		for(int i = 0; i < bouquet.length; i++) {
			totalCost += bouquet[i].getPrice();			
		}
		return totalCost;
	}
}
