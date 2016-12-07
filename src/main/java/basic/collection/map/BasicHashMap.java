/***/
package basic.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap
 * 
 *  Key and value based
    Allows null key and multiple null values.
    No order key and value.
    Not synchronized
    Performance better than TreeMap

 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class BasicHashMap {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, String> mapHttpErrors = new HashMap<>();
        
        mapHttpErrors.put(303, "See Other");
        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(404, "Not Found");
        mapHttpErrors.put(500, "Internal Server Error");
         
        System.out.println(mapHttpErrors);
        
        //Performing Basic Operations on a Map
        //(put), lookup (get), checking (containsKey and containsValue), 
        //modification (remove and replace) and cardinality (size and isEmpty).
        
        //get
        String status301 = mapHttpErrors.get(301);
        System.out.println("301: " + status301);
        
        //Checking if the map contains a specified key:
        if (mapHttpErrors.containsKey("200")) {
            System.out.println("Http status 200");
        }
        
        //Checking if the map contains a specified value:
        if (mapHttpErrors.containsValue("OK")) {
            System.out.println("Found status OK");
        }
        
        //Removing a mapping from the map:
        String removedValue = mapHttpErrors.remove(500);
        if (removedValue != null) {
            System.out.println("Removed value: " + removedValue);
        }
        
        //Replacing a value associated with a specified key:
        System.out.println("Map before: " + mapHttpErrors);
        mapHttpErrors.replace(304, "No Changes");
        System.out.println("Map after: " + mapHttpErrors);
        
        //Getting the size of the map:
        int size = mapHttpErrors.size(); 
        System.out.println(" map size :" + size);
        
        //Checking if the map is empty:
        if (mapHttpErrors.isEmpty()) {
            System.out.println("No Error");
        } else {
            System.out.println("Have HTTP Errors");
        }
        
        
        //Iterating Over a Map (using Collection views)
        Map<String, String> mapCountryCodes = new HashMap<>();
        
        mapCountryCodes.put("1", "USA");
        mapCountryCodes.put("44", "United Kingdom");
        mapCountryCodes.put("33", "France");
        mapCountryCodes.put("81", "Japan");
        
        //entrySet(): returns a Set view of the mappings contained in this map. 
        //Therefore we can iterate over mappings in the map like this:
        Set<Map.Entry<String, String>> entries = mapCountryCodes.entrySet(); 
        for (Map.Entry<String, String> entry : entries) {
            String code = entry.getKey();
            String country = entry.getValue();
            System.out.println(code + " => " + country);
        }
        
        Set<String> setCodes = mapCountryCodes.keySet();
        Iterator<String> iterator = setCodes.iterator();
         
        while (iterator.hasNext()) {
            String code = iterator.next();
            String country = mapCountryCodes.get(code);
            System.out.println(code + " => " + country);
        }

        //values(): returns a collection of values contained in the map. 
        //Thus we can iterate over values of the map like this
        Collection<String> countries = mapCountryCodes.values();
        for (String country : countries) {
            System.out.println(country);
        }
        
        
        //The clear() method removes all mappings from the map. 
        mapHttpErrors.clear();
        System.out.println("Is map empty? " + mapHttpErrors.isEmpty());
    }

}
