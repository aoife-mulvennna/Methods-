/**
 * 
 */
package methods_with_return_types;

import java.util.Scanner;

/**
 * 
 */
public class ReturnCapitalCity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a name of a country");
		Scanner scanner = new Scanner(System.in);
		String country = scanner.nextLine();
		String result = countryToCity(country);
		
		if (result != null) {
		    System.out.println("The capital city of " + country + " is " + result);
		} else {
		    System.out.println("Country not found.");
		}
		scanner.close();
	}

	/*
	 * this method uses the input of a country to output its capital city
	 */
	public static String countryToCity(String country) {
		String lowercaseCountry = country.toLowerCase();

		if (lowercaseCountry.equals("canada")) {
			return "Ottowa";
			
		} else if (lowercaseCountry.equals("france")) {
			return "Paris";

		} else if (lowercaseCountry.equals("germany")) {
			return "Berlin";

		} else if (lowercaseCountry.equals("italy")) {
			return "Rome";

		} else if (lowercaseCountry.equals("japan")) {
			return "Tokyo";

		} else if (lowercaseCountry.equals("russia")) {
			return "Moscow";

		} else if (lowercaseCountry.equals("united kingdom")) {
			return "London";

		} else if (lowercaseCountry.equals("united states")) {
			return "Washington";
			
		} else {
			return null;
		}
	}
}
