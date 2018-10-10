/* Написать программу, содержащую иерархии цветов для цветочного магазина. 
   Собрать букет и определить его стоимость. */
 

package by.zakharovamaria.flowershop.bunchofflowers;

import by.zakharovamaria.flowershop.flowers.tulips.*;
import by.zakharovamaria.flowershop.flowers.roses.*;

public class TestBunchOfFlowers {

	public static void main(String[] args) {
		
		BunchOfFlowers weddingBouquet = new BunchOfFlowers();
		
		weddingBouquet.add(new Flammentanz("Dark red"));
		weddingBouquet.add(new Pomponella("Pale pink"));
		weddingBouquet.add(new Pomponella("Pale pink"));
		weddingBouquet.add(new Recreado("Dark purple"));
		weddingBouquet.add(new Olaf("Ruby red"));
		
		System.out.println("Total cost of wedding bouquet: " + weddingBouquet.totalCost());

	}
}
