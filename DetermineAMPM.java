/**
 * 
 */
package method_invocation;
import java.util.Calendar;
import java.util.Scanner;
/**
 * This class uses a method to determine the time of day
 */
public class DetermineAMPM {

	/**
	 * @param args
	 * the user will say anything which will then invoke the method 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hi");
		String userResponse = scanner.next();

		timeOfDay(userResponse);
		scanner.close();
	}
		
public static void timeOfDay(String userResponse) {
	Calendar cal = Calendar.getInstance();
	int timeDay = cal.get(Calendar.HOUR_OF_DAY);
	
	if (timeDay < 12) {
		System.out.println("Good morning");
	} else if (timeDay >= 12) {
			System.out.println("I hope the morning went well for you. Enjoy the rest of your day.");
		} else {
			System.out.println("Invalid.");
		
	}
	

	}

}
