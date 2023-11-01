/**
 * 
 */
package methods_with_return_types;
import java.util.Scanner;
/**
 * This class contains a method which returns the area of a rectangle whenb the
 * user enters the height and base
 */
public class AreaRectangle {
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int height, base;
		
		System.out.println("please enter the height of the rectangle");
		height = scanner.nextInt();
		System.out.println("Please enter the base of the rectangle");
		base = scanner.nextInt();
areaMethod(height, base);

	}
	public static void areaMethod(int height, int base) {
		int area;
		area = height * base;
		System.out.println("the area is equal to " + area);
	}

}
