/**
 * 
 */
package method_invocation;

import java.util.Scanner;

/**
 * 
 */
public class IntegerMultiples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a method to find if something is a multiple of another");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num1, num2;
		num1 = scanner.nextInt();
		System.out.println("Please enter a second number to check if number 1 is a multiple of it:");
		num2 = scanner.nextInt();
		
		isMultiple(num1,num2);
		
	}
	public static void isMultiple(int num1, int num2) {
		
		if (num2 % num1 ==0) { 
			System.out.println("Number 2 is a multiple of Number 1");
		}
		else {
			System.out.println("Number 2 is not a multiple of Number 1");
		}
		
	}

}
