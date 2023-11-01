/**
 * 
 */
package method_invocation;

import java.util.Scanner;

/**
 * This class contains a method which prints the sum of 1+2+3... to an upper
 * bound determined by user program should also display average of these numbers
 */
public class Sum_and_Average {

	/**
	 * @param args
	 */

	
	
	public static void main(String[] args) {
		System.out.println("Please enter a number which is the upper bound of the calculations");
		Scanner scanner = new Scanner(System.in);
		double userUpperBound;
		
		userUpperBound = scanner.nextDouble();
		SumAndAverage(userUpperBound);
		
		scanner.close();
	}

	public static void SumAndAverage(double userUpperBound) {
		double sum, loop, avg;
		sum = 0;
		for (loop = 1; loop <= userUpperBound; loop++) {
			sum += loop;
		}
		System.out.println("The sum is " + sum);
		
		avg = sum/userUpperBound;
		System.out.println("The average is " + avg);

	}

}
