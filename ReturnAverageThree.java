/**
 * 
 */
package methods_with_return_types;

/**
 * 
 */
public class ReturnAverageThree {

	/**
	 * @param args this method takes 3 int values and returns the average of these
	 *             numbers as a double
	 */
	public static void main(String[] args) {

		double result = averageDoubleReturn(1, 2, 3);
		System.out.println(result);

	}
	/*
	 * method returns average of 3 ints as a double
	 * 
	 * @param a
	 * 
	 * @param b
	 * 
	 * @param c
	 */

	public static double averageDoubleReturn(int a, int b, int c) {
		double result;
		int averageVal = (a + b + c) / 3;
		result = (double) averageVal;
		return result;

	}

}
