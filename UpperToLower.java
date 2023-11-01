/**
 * 
 */
package method_invocation;
import java.util.Scanner;
/**
 * 
 */
public class UpperToLower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the method to convert an upper case letter to lower case");
		System.out.println("Please enter a letter to convert it to lower case");
		Scanner scanner = new Scanner(System.in);
		char userInput = scanner.next().charAt(0);
		upperToLower(userInput);
	}

	public static void upperToLower(char letter) {
		if (Character.isLowerCase(letter)) {
		System.out.println(letter +  " is lower case");
		} else {
		System.out.println(letter + " is not lowercase.");
		char lowercaseChar = Character.toLowerCase(letter);
		System.out.println("Lowercase: " + lowercaseChar);
		}
	}

}


