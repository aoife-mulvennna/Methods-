/**
 * 
 */
package methods_with_return_types;
import java.util.Scanner;
/**
 * This class includes a method which returns a month from its number value 
 */
public class NumberMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a number between 1 and 12");
		
		int input;
		input = scanner.nextInt();
		numberMonth(input);
	}
		
		public static void numberMonth(int input) {
		
		switch(input) {
		case 1: {
		System.out.println("January");
		break;}
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("Decemeber");
			break;
		default: {
			System.out.println("Invalid. select a number between 1 and 12");
		}
		}
		

	}

}
