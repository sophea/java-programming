package exercises.nguonchhay;

import java.util.Collections;
import java.util.List;
import basic.collection.CountriesList;

public class Exercise1 {
	
	public static void main(String []args) {
		System.out.println("--- Display all countries in reverse order ---");
		List<String> countries = (List<String>) CountriesList.getAllCountries();
		Collections.reverse(countries);
		System.out.print(countries);
	}
}