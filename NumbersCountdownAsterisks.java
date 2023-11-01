/**
 * 
 */
package method_invocation;

import java.util.Scanner;

/**
 * 
 */
public class NumbersCountdownAsterisks {

	/**
	 * @param args
	 */
	public static final String ASTERISK = "*";

	public static void main(String[] args) {
		countdownNumbers();
	}

	/*
	 * prompt the user for a numner (between 5 and 50 (inclusive)). Then output to
	 * screen a countdown of the numbers starting with the given number and include
	 * on the same line the same numbert of asterisks
	 */
	public static void countdownNumbers() {
		
		System.out.println("Please enter a number between 5 and 50");
		Scanner scanner = new Scanner(System.in);
		int userNumber;
		
		while (true) {
			System.out.println("Enter a number between 5 and 50 (inclusive):");
			if (scanner.hasNextInt()) {
				userNumber = scanner.nextInt();
				if (userNumber >= 5 && userNumber <= 50) {
					break;
				} else {
					System.out.println("Please enter a valid number wihtin the given range.");
				}
			} else {
				System.out.println("invalid input. Please enter a valid number");
				scanner.next();
			}

		}
		for (int outer = userNumber; outer >= 1; outer--) {
			StringBuilder line = new StringBuilder();
			line.append(outer).append(" ");
			for (int inner = 0; inner < outer; inner++) {
				line.append("*");
			}
			System.out.println(line.toString());
		}
		scanner.close();
	}
}
