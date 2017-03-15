/***/
package basic.collection.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import basic.collection.CountriesList;

/**
 * we have list name of countries , convert all list into map by grouping key as first letter of country with value of list of
 * countries with the same first letter. For instance : Country names Australia, Afghanistan , it will be stored in map key "A" ,
 * values ["Australia","Afghanistan"]
 * Source code to get all countries as List<String> :
 * 
 * https://github.com/sophea/java-programming/blob/master/src/main/java/basic/collection/CountriesList.java 
 * 
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class Exercise2 {

    /**
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("--- Countries before grouping ---");
        List<String> countries = (List<String>) CountriesList.getAllCountries();
        System.out.println(countries);
        //create Map with key and value as set objects
        Map<String, Set<String>>groupCountries = new HashMap<>();
        
        for(String country : countries) {
            String firstCountryLetter = String.format("%s", country.toUpperCase().charAt(0));
            Set<String> listCountry = groupCountries.get(firstCountryLetter);
            //check if null - create new object
            if (listCountry == null) {
                listCountry=new HashSet<String>();
                groupCountries.put(firstCountryLetter, listCountry);
            }
            //add item to listCountry
            listCountry.add(country);
            
        }
        
        System.out.println("\n--- Group countries by alphabet ---");
        System.out.println(groupCountries);
        
        listCountriesByLetter(groupCountries, "e");
        listCountriesByLetter(groupCountries, "Z");

    }
    /**
     * @param countries
     * @param letter
     */
    public static void listCountriesByLetter(Map<String, Set<String>> countries, String letter) {
        if (letter != null) {
            letter = letter.toUpperCase();
            System.out.println("\n--- List countries by alphabet '" + letter + "' ---");
            System.out.println(countries.get(letter));
        } else {
            System.out.println("Letter can not be null");
        }
    }
    
    
}
