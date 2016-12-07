/***/
package basic.collection.map;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * - Not support null key & null value
   - Use key to access
   - Synchronized (Thread-safe)
   -Implemented from Dictionary

   http://beginnersbook.com/2014/07/hashtable-in-java-with-example/
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class HashtableDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
     // Create a hash map
        Hashtable<String, Double> balance = new Hashtable<>();
        String str;
        double bal;

        balance.put("Zara", new Double(3434.34));
        balance.put("Mahnaz", new Double(123.22));
        balance.put("Ayan", new Double(1378.00));
        balance.put("Daisy", new Double(99.22));
        balance.put("Qadir", new Double(-19.08));

        
        // Show all balances in hash table.
        Enumeration<String> names = balance.keys();
        
        while(names.hasMoreElements()) {
           str = (String) names.nextElement();
           System.out.println(str + ": " + balance.get(str));
        }     
        
        System.out.println();
        
        // Deposit 1,000 into Zara's account
        bal = ((Double)balance.get("Zara")).doubleValue();
        
        balance.put("Zara", new Double(bal + 1000));
        System.out.println("Zara's new balance: " + balance.get("Zara"));

    }

}
