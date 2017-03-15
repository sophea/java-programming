package basic.collection.student.putthira;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import basic.collection.CountriesList;

public class exercise1 {
public static void main(String[] args) {
		
//		testReverse();
	Collection<String>  countries =  CountriesList.getAllCountries();
	//reverseCountries(countries);
	categorizedCountries(countries);
	}
	public static void reverseCountries(Collection<String> countries) {
		Collections.reverse((List<?>) countries);
		System.out.println(countries);
	}
	
public static void categorizedCountries(Collection<String> countries) {
        
        Map<String, Collection<String>> map = new HashMap<>();
        for (String country : countries) {
            String firstChar = String.valueOf(country.toUpperCase().charAt(0));
            if(map.get(firstChar) == null) {
                map.put(firstChar, new ArrayList<String>());
            }else {
                Collection<String> groupedCountry = map.get(firstChar);
                groupedCountry.add(country);
                map.put(firstChar, groupedCountry);
                }
        }
        System.out.println(map);
        System.out.println(map.get("B"));
        
    }

	//amend
//	public static void categorizedCountries(Collection<String> countries) {
//		
//		Map<String, Collection<String>> map = new HashMap<String, Collection<String>>();
//		for (String country : countries) {
//			String firstChar = String.valueOf(country.toUpperCase().charAt(0));
//			Collection<String> groupedCountry = map.get(firstChar);
//			if(groupedCountry == null) {
//			    groupedCountry = new ArrayList<>();
//				map.put(firstChar, groupedCountry);
//			}
//			groupedCountry.add(country);
//			
//		}
//	//	System.out.println(map);
//		System.out.println(map.get("A"));
//		
//	}
}
