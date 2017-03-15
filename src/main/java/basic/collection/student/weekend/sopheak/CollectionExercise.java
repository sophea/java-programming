/***/
package basic.collection.student.weekend.sopheak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import basic.collection.CountriesList;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class CollectionExercise {
public static void main(String[] args) throws Exception {
        
        String[] countries = {
                "Cambodia",
                "VietNam",
                "Thailand",
                "USA",
                "Cambodia",
                "France",
                "England",
                "VietNam",
                "Cambodia"
                };
        // TODO: 1 - Find duplicate country  and display all unique countries name using HashSet  ( mehtod add , size )
        
        System.out.println("1 - Find duplicate country  and display all unique countries name using HashSet  ( mehtod add , size )");
        System.out.println("");

        Set<String> countryHashSet = new HashSet<String>();
        Set<String> duplicatedCountries1 = convertToSetAndGetDuplicate(countryHashSet, countries);
        
        if(duplicatedCountries1.size() > 0){
            System.out.println("Duplicated Country name is :");
            displaySet(duplicatedCountries1);
        }
        
        System.out.printf("There %d are countries : ", countryHashSet.size());
        System.out.println(countryHashSet);
        
        split();
        
        
        // TODO: 2 - Find duplicate country and display all unique countries name in aphabet order
        
        System.out.println("2 - Find duplicate country and display all unique countries name in aphabet order");
        System.out.println("");

        SortedSet<String> countrySortedSet = new TreeSet<String>();
        Set<String> duplicatedCountries2 = convertToSetAndGetDuplicate(countrySortedSet, countries);
        
        if(duplicatedCountries2.size() > 0){
            System.out.println("Duplicated Country name is :");
            displaySet(duplicatedCountries2);
        }
        
        System.out.printf("There %d are countries : ", countrySortedSet.size());
        System.out.println(countrySortedSet);
        
        split();
        
        // TODO: 3 - convert array above into LinkedHashSet Object and write a method named as isCountryExist(Set,countryName) return as boolean this method to check countryName existed or not
        System.out.println("3 - convert array above into LinkedHashSet Object and write a method named as isCountryExist(Set,countryName) return as boolean this method to check countryName existed or not");
        System.out.println("");

        Set<String> countryLinkedHashSet = new LinkedHashSet<String>();
        convertToSet(countryLinkedHashSet, countries);
        String countryName = "Thai";
        if(isCountryExist(countryLinkedHashSet, countryName)){
            System.out.printf("Country name: %s found in the object.", countryName);
        }else{
            System.out.printf("Country name: %s is not found in the object.", countryName);
        }
        System.out.println("");
        
        split();
        
        // TODO: 4 : write Own class : MyUtils with one static method as below
        System.out.println("4 : write Own class : MyUtils with one static method as below");
        System.out.println("");
        
        MyUtils.checkDuplicate(new HashSet<String>(), countries);
        MyUtils.checkDuplicate(new TreeSet<String>(), countries);
        MyUtils.checkDuplicate(new LinkedHashSet<String>(), countries);
        
        split();

        // TODO: 5 : convert array above into ArrayList, LinkedList and display total size all items using Iterator and for-loop. 
        System.out.println("5 : convert array above into ArrayList, LinkedList and display total size all items using Iterator and for-loop.");
        System.out.println("");

        List<String> countryArrayList = new ArrayList<String>(Arrays.asList(countries));
        System.out.println("List Type : ArraList, Total Size: " + countryArrayList.size());
        displayList(countryArrayList);
        
        System.out.println("");
        
        List<String> countryLinkedList = new LinkedList<String>(Arrays.asList(countries));
        System.out.println("List Type : LinkedList, Total Size: " + countryLinkedList.size());
        displayList(countryLinkedList);
        
        split();
        
        // TODO: 6 : Convert array above into Map (HashMap, TreepMap) by key is countryName, value is number of times that countryName found and display all elements using entrySet() methods
        
        System.out.println("6 : Convert array above into Map (HashMap, TreepMap) by key is countryName, value is number of times that countryName found and display all elements using entrySet() methods");
        System.out.println("");

        Map<String, Integer> countryHashMap = new HashMap<String, Integer>();
        Map<String, Integer> countryTreeMap = new TreeMap<String, Integer>();
        
        convertToMap(countryHashMap, countries);
        convertToMap(countryTreeMap, countries);

        System.out.println("HashMap: " + countryHashMap);
        System.out.println("Tree: " + countryTreeMap);
        
        split();
        
        /* TODO:    
         * we have list name of countries , convert all list into map by grouping key as first letter of country with value of list of countries with the same first letter.  
         * For instance : Country names Australia, Afghanistan , it will be stored in map key "A" , values ["Australia","Afghanistan"]
         */
        
        System.out.println("Extra Challenge: We have list name of countries , convert all list into map by grouping key as first letter of country with value of list of countries with the same first letter.");
        System.out.println("");
        
        List<String> countryList = (List<String>) CountriesList.getAllCountries();
        Map<String, Set<String>> groupedCountries = new HashMap<>();
        convertToMapWithGrouping(groupedCountries, countryList);
        System.out.println(groupedCountries);
        
    }
    
    /**
     * Convert given array to set and return duplicated items
     * @param set
     * @param items
     * @return set Duplicated items
     */
    public static Set<String> convertToSetAndGetDuplicate(Set<String> set, String[] items){
        Set<String> duplicatedItems = new HashSet<String>();
        for(String item:items){
            if(!set.add(item)) {
                duplicatedItems.add(item);
            }
        }
        return duplicatedItems;
    }
    
    /**
     * Convert given array to set
     * @param set
     * @param items
     */
    public static void convertToSet(Set<String> set, String[] items){
        for(String item:items){
            set.add(item);
        }
        //my comment : you can use below
//        if (set == null) {
//            set = new LinkedHashSet<>();
//        }
//        set.addAll(Arrays.asList(items));
    }
    
    /**
     * Convert given array to Map
     * @param map
     * @param items
     */
    public static void convertToMap(Map<String, Integer> map, String[] items){
        for(String item:items){
            if(!map.containsKey(item)){
                map.put(item,  1);
            }else{
                map.put(item, map.get(item) + 1);
            }
            //sophea comment :
//            Integer value = 1;
//            if (map.containsKey(item)) {
//                value = map.get(item) + 1;
//            }
//            map.put(item, value);
        }
    }
    
    /**
     * Convert given list to grouping map
     * @param map
     * @param list
     */
    public static void convertToMapWithGrouping(Map<String, Set<String>> map, List<String> list){
        for(String country:list){
//            String countryKey = getCountryKey(new String(country));
//            if (!map.containsKey(countryKey)) {
//                Set<String> tmp = new HashSet<String>();
//                tmp.add(country);
//                map.put(countryKey, (HashSet<String>) tmp);
//            } else {
//                map.get(countryKey).add(country);
//            }
            
            //sophea comment : 
             String firstLetter = country.substring(0,1).toUpperCase();
            Set<String> listCountry = map.get(firstLetter);
            //check if null - create new object
            if (listCountry == null) {
                listCountry = new HashSet<String>();
                map.put(firstLetter, listCountry);
            }
            //add item to listCountry
            listCountry.add(country);
        }
    }
    
    /**
     * convert country name to key with first letter with upper case
     * @param country
     * @return
     */
    public static String getCountryKey(String country){
        return country.substring(0,1).toUpperCase();
    }
    
    /**
     * 
     * @param set
     */
    public static void displaySet(Set<String> set){
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    /**
     * @param set
     * @param countryName
     * @return boolean
     */
    public static boolean isCountryExist(Set<String> set, String countryName){
        return set.contains(countryName);
        //FIXME: Sophea comment
        // return set !=null && set.contains(countryName);
    }
    
    /**
     * Display list with an organized format
     * @param list
     */
    public static void displayList(List<String> list){
        StringBuilder s = new StringBuilder();
        s.append("Elements : [");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            s.append('"');
            s.append(iterator.next());
            s.append('"');
            if(iterator.hasNext()){
                s.append(",");
            }
        }
        s.append("]");
        
        System.out.println(s);
    }
    
    /**
     * Line Split
     */
    public static void split(){
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("");
    }
}
