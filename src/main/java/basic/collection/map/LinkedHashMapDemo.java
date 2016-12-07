package basic.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * his class extends HashMap and maintains a linked list of the entries in the map, in the order in which they were inserted. This
 * allows insertion-order iteration over the map. That is, when iterating a LinkedHashMap, the elements will be returned in the
 * order in which they were inserted.
 * You can also create a LinkedHashMap that returns its elements in the order in which they were last accessed
 * 
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class LinkedHashMapDemo {
    public static void main(String args[]) {
        
       // Map representing (Company, share price) as (key, value) pair
        Map<String, Double> linkedHashMap = new LinkedHashMap<String, Double>();
        linkedHashMap.put("Apple", new Double(91.98));
        linkedHashMap.put("Sony", new Double(16.76));
        linkedHashMap.put("Dell", new Double(30.47));
        linkedHashMap.put("HP", new Double(33.91));
        linkedHashMap.put("IBM", new Double(181.71));

        // Displaying the contents of the LinkedHashMap
        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);

        // One of the ways of iterating over the map
        // Notice the order of the elements is same as the order of insertion
        System.out.println("\nValues of map after iterating over it : ");
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }

        // Getting the value for a particular key
        System.out.println("\nThe current share price of HP is : "
                + linkedHashMap.get("HP"));

        // Getting the size of the LinkedHashMap
        System.out
                .println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());

        // Checking whether the LinkedHashMap is empty
        System.out.println("\nIs LinkedHashMap empty? : " + linkedHashMap.isEmpty());

        //Checking whether Map contains a particular key or value
        System.out.println("\nLinkedHashMap contains Sony as key? : " + linkedHashMap.containsKey("Sony"));
        System.out.println("LinkedHashMap contains 999.0 as value? : " + linkedHashMap.containsValue(999.0));
        
        // Removing a particular value
        System.out.println("\nRemove entry for Dell : " + linkedHashMap.remove("Dell"));
        System.out.println("Content of LinkedHashMap removing Dell: " + linkedHashMap);

        // Clearing the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
     }
}
