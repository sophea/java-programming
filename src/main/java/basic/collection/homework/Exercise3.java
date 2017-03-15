/***/
package basic.collection.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * see exercise_java_collection.txt
 * 
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class Exercise3 {
    
    public static String[] getCountries() {
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
        return countries;
    }
    /**
     * @param args 
     */
    public static void main(String[] args) {
        
        //1 - Find duplicate country  and display all unique countries name using HashSet  ( method add , size )
        Set<String> hashset =   new HashSet<>();
        Set<String> duplicateSet  =   new HashSet<>();
        String[] countries = getCountries();
        for (String country : countries) {
            if (!hashset.add(country)) {
                duplicateSet.add(country);
            }
        }
        System.out.println("1 - Find duplicate country  and display all unique countries name using HashSet  ( method add , size )");
        System.out.println("Duplicate country name:");
        System.out.println(duplicateSet);
        System.out.println(String.format("There are %s countries %s", hashset.size(), hashset));
        
        //2 - Find duplicate country and display all unique countries name in alphabetical order
        Set<String> treeset =   new TreeSet<>();
        Set<String> duplicateTreeSet  =   new TreeSet<>();
        treeset.addAll(hashset);
        duplicateTreeSet.addAll(duplicateSet);
        System.out.println("\n2 - Find duplicate country and display all unique countries name in alphabetical order");
        System.out.println("Duplicate country name:" );
        for (String dup : duplicateTreeSet) {
            System.out.println(dup);
        }
        System.out.println(String.format("There are %s countries %s", treeset.size(), treeset));
        
        
        //3 - convert array above into LinkedHashSet Object and write a method named as isCountryExist(Set,countryName) return as boolean this method to check countryName existed or not
        System.out.println("\n3 - convert array above into LinkedHashSet Object and write a method named as isCountryExist(Set,countryName) return as boolean this method to check countryName existed or not");
        Set<String> linkedHash    =   new LinkedHashSet<>(Arrays.asList(countries));
        String countryName   =   "Cambodia";
        boolean isExist =   isCountryExist(linkedHash, countryName);
        if (isExist) {
            System.out.println("Country name: " + countryName + " is found in the object.");
        } else {
            System.out.println("Country name: " + countryName + " is not found in the object.");
        }
        String count_name2  =   "Canada";
        boolean isExist2    =   isCountryExist(linkedHash, count_name2);
        if(isExist2){
            System.out.println("Country name: "+count_name2+" is found in the object.");
        }else{
            System.out.println("Country name: "+count_name2+" is not found in the object.");
        }
    
        
        //5 : convert array above into ArrayList, LinkedList and display total size all items using Iterator and for-loop.
        List<String> arrayList =    new ArrayList<>(Arrays.asList(countries));  
        System.out.println("\n5 : convert array above into ArrayList, LinkedList and display total size all items using Iterator and for-loop.");
        System.out.println("List type: " + arrayList.getClass().getName() + " Total size: " + arrayList.size());
      for (String string : arrayList) {
            System.out.println(string);
        }
        List<String> linkedList   =   new LinkedList<>(Arrays.asList(countries));
        System.out.println("\nList type: "+linkedList.getClass().getName()+" Total size: "+linkedList.size());
        System.out.println("Elements:\n"+linkedList);
        for(Iterator<String> iterator = linkedList.iterator(); iterator.hasNext() ;) {
            System.out.println(iterator.next());
        }
        
        //6 : Convert array above into Map (HashMap, TreeMap) by key is countryName, value is number of times that countryName found and display all elements using entrySet() methods
        //ex : key Cambodia found 3 times, the value to store is 3 for key Cambodia,  Key USA found 1 time, value is 1.
        System.out.println("\n6 : Convert array above into Map (HashMap, TreeMap) by key is countryName, value is number of times that countryName found and display all elements using entrySet() methods");
        Map<String, Integer> hashMap = new HashMap<>();
        for (String item : countries) {
            Integer value = 1;
            if (hashMap.containsKey(item)) {
                value = hashMap.get(item) + 1;
            }
            hashMap.put(item, value);
            //hashMap.put(item, Collections.frequency(Arrays.asList(countries), item));
        }
        System.out.println("HashMap Example:");
        for(Entry<String, Integer> item : hashMap.entrySet()) {
            
            String key  =   item.getKey();
            Integer value    =   item.getValue();
            System.out.println(String.format("key :%s, value %s", key, value));
        }
        
        Map<String, Integer> treeMap = new TreeMap<>();
        for (String item : countries) {
            Integer value = 1;
            if (treeMap.containsKey(item)) {
                value = treeMap.get(item) + 1;
            }
            treeMap.put(item, value);
        }
        System.out.println("\nTreeMap Example:");
        Iterator<Map.Entry<String, Integer>> iterator2  =   treeMap.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> item = iterator2.next();
            String key = item.getKey();
            Integer time = item.getValue();
            System.out.println("Key " + key + " found " + time + " time" + (time > 1 ? "s" : "") + ", the value to store is "
                    + time + " for key " + key + ".");
        }
        
    }
    public static boolean isCountryExist(Set<String> set,String countryName){      
        return set !=null && set.contains(countryName);
    }    
    
}
