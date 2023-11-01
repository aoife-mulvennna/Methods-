/**
 * 
 */
package methods_with_return_types;

import java.util.Scanner;
import java.util.Random;

/**
 * This class contains a method to simulate a coin toss
 */
public class CoinToss {

	/**
	 * @param args this method calls a method which returns the outcome of a coin
	 *             toss It allows the user to pick their coin call
	 */
	public static void main(String[] args) {
		System.out.println("Do you call heads or tails?");
		Scanner scanner = new Scanner(System.in);
		String coinCall = scanner.nextLine();
		String result = coinToss(coinCall);
		System.out.println(result);
	}

	/*
	 * This method will simulate a coin toss
	 */
	public static String coinToss(String coinCall) {
		Random rand = new Random();
		int coinTosserVal = rand.nextInt(2);

		if ((coinTosserVal == 0 && coinCall.equals("heads")) || (coinTosserVal == 1 && coinCall.equals("tails"))) {
			return "You Win!";
		} else {
			return "You lose!";
		}

	}

}
