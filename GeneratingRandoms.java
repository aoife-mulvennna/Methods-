/**
 * 
 */
package method_invocation;
import java.util.Random;
/**
 * 
 */
public class GeneratingRandoms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	generateRandom();

	}
	/*
	 * This method will generate 10 random numbers between 1 and 100
	 */
	public static void generateRandom() {
		int loop;
		Random rand = new Random();
		int randomNo;
		
		System.out.println("Generating 10 random integers in range 1...100");
		for (loop = 1; loop <11; loop++) {
			randomNo = rand.nextInt(100) + 1;
			System.out.println(randomNo);
		}
		System.out.println("Done");
	}

}
