/**
 * 
 */
package method_invocation;

/**
 * 
 */
public class IntegerOddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the testing of numbers to see if they are even or odd!");
		oddOrEven(5);
	}

	public static void oddOrEven(int number) {
		if (number % 2 == 0)
			System.out.println("Your number is even");
		else if (number % 2 == 1)
			System.out.println("Your number is odd");
	}

}
