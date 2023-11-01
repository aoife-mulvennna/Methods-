/**
 * 
 */
package method_invocation;

import java.util.Scanner;

/**
 * 
 */
public class NumberInWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * This method asks the user for a number and then prints this number as a word
		 */
		System.out.println("Please enter a number and I will return it to you in word format");
		Scanner scanner = new Scanner(System.in);
		int input;
		input = scanner.nextInt();
		scanner.close();

		printNumberInWord(input);
	}

	public static void printNumberInWord(int input) {
//		if (input == 1) {
//			System.out.println("ONE");
//		} else if (input == 2) {
//			System.out.println("TWO");
//		} else if (input == 3) {
//			System.out.println("THREE");
//		} else if (input == 4) {
//			System.out.println("FOUR");
//		} else if (input == 5) {
//			System.out.println("FIVE");
//		} else if (input ==6) {
//			System.out.println("SIX");
//		} else if (input ==7) {
//			System.out.println("SEVEN");
//		} else if (input ==8) {
//			System.out.println("EIGHT");
//		} else if (input ==9) {
//			System.out.println("NINE");
//		} else
//			System.out.println("OTHER");

		switch (input) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;
		}
	}

}
