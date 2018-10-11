// Написать программу: выводящую на экран случайно сгенерированное трёхзначное натуральное число и
// (1 вариант) его наибольшую цифру
// (4 вариант) сумму его цифр

package by.zakharovamaria.randomthreedigitnumber;

public class TestThreeDigitNumber {

	public static void main(String[] args) {
		
		RandomThreeDigitNumber testNumber = new RandomThreeDigitNumber();

		System.out.println("Number: " + testNumber.getNumber());
		System.out.println("Max digit: " + testNumber.maxDigit());
		System.out.println("Sum of digits: " + testNumber.sumDigits());

	}

}