// (1 вариант)
// Написать программу, позволяющую получить массив чисел в строках и вернуть строку - сумму этих чисел.

package by.zakharovamaria.сreatearray;

public class TestArray {

	public static void main(String[] args) {

		CreateArrayAndSum arr = new CreateArrayAndSum();		
		arr.generateRandomArray();
		arr.printArray();
		
		System.out.println("Integer sum: " + arr.sumArray());
	}

}
