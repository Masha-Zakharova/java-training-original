package by.zakharovamaria.сreatearray;
import java.util.Random;

public class CreateArrayAndSum {

	public static final int MAX_NUMBER = 10;
	private static Random random = new Random();	
	
	private String[] strArr= new String[MAX_NUMBER];
	private int[] intArr = new int[MAX_NUMBER];
			
	public void generateRandomArray() { 
		for(int i = 0; i < strArr.length; i++) {			
			intArr[i] = random.nextInt(MAX_NUMBER);      // рандомные числа в диапазоне [0;10]
			strArr[i] = String.valueOf(intArr[i]);     		
		}
	}
	
	public void printArray() {
		System.out.print("Array: ");
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println(" ");
	}
	
	public String sumArray() {               // возвращает строку сумму чисел массива intArr
		int sum = 0;
		
		for(int i = 0; i < strArr.length; i++) {
			sum += intArr[i];
		}
		return Integer.toString(sum);
	}
	
}
