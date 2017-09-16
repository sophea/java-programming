package exercises.nguonchhay;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import basic.collection.CountriesList;

public class Exercise2 {
	
	public static void main(String[] args) {
		System.out.println("--- Countries before grouping ---");
		List<String> countries = (List<String>) CountriesList.getAllCountries();
		System.out.println(countries);
		
		Map<String, Set<String>>groupCountries = new HashMap<>();
		for(String country : countries) {
			String firstCountryLetter = country.substring(0, 1).toUpperCase();
			Set listCountry = groupCountries.get(firstCountryLetter);
		
			if (null == listCountry) {
				listCountry = new HashSet<>();
				groupCountries.put(firstCountryLetter, listCountry);
			}
			listCountry.add(country);
		}
		
		System.out.println("\n--- Group countries by alphabet ---");
		System.out.println(groupCountries);
		
		listCountriesByLetter(groupCountries, "A");
		listCountriesByLetter(groupCountries, "Z");
	}
	
	/**
	 * @param countries
	 * @param letter
	 */
	public static void listCountriesByLetter(Map<String, Set<String>> countries, String letter) {
		System.out.println("\n--- List countries by alphabet '" + letter + "' ---");
		System.out.println(countries.get(letter));
	}
}
