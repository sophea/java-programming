/***/
package basic.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class BasicSet {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        /**
         * We can create a Set from an existing collection. This is a trick to remove duplicate elements in non-Set collection.
         * Consider the following code snippet:
         */
        List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
        System.out.println(listNumbers);
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
        System.out.println(uniqueNumbers);
        /* output
        [3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6]
        [1, 2, 3, 4, 5, 6, 7, 8, 9]
        */ 
        
        /*
         * The add()method returns true if the set does not contain the specified element, and returns false if the set already
         * contains the specified element:
         */
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
         
        if (names.add("Peter")) {
            System.out.println("Peter is added to the set");
        }
         
        if (!names.add("Tom")) {
            System.out.println("Tom is already added to the set");
        }
        
        //The Set can contain a null element:
        names.add(null);
        
        //Removing an element from a Set:        
        /*The remove() method removes the specified element from the set if it is present (the method returns true, or false otherwise)
         * 
         * Note that the objects in the Set should implement the equals() and hashCode() methods correctly so the Set can find and remove the objects.
         * */
        if (names.remove("Mary")) {
            System.out.println("Marry is removed");
        }
        
        
        // Check if a Set is empty:
        // The isEmpty() method returns true if the set contains no elements, otherwise returns false:

        if (names.isEmpty()) {
            System.out.println("The set is empty");
        } else {
            System.out.println("The set is not empty");
        }
        
        // Remove all elements from a Set:
        // The clear() method removes all elements from the set. The set will be empty afterward:

        names.clear();
        if (names.isEmpty()) {
            System.out.println("The set is empty");
        }
        
        
        // Get total number of elements in a Set:
        //
        // The size() method returns the number of elements contained in the set:

        Set<String> sets = new HashSet<>();
        sets.add("Tom");
        sets.add("Mary");
        sets.add("Peter");
        sets.add("Alice");

        System.out.printf("The set has %d elements", sets.size());
        // Note that the Set interface does not provide any API for retrieving a specific element due to its nature of unordered.
        // Except the TreeSet implementation allows retrieving the first and the last elements.
        
        
        //Performing Bulk Operations between two Sets
        
        // We can perform some mathematic-like operations between two sets such as subset, union, intersection and set difference.
        // Suppose that we have two sets s1 and s2.
        //
        // Subset operation:
        //
        // s1.containsAll(s2) returns true if s2 is a subset of s1 (s2 is a subset of s1 if s1 contains all of the elements in
        // s2).
        //
        // Example:
            
        Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));
         
        if (s1.containsAll(s2)) {
            System.out.println("s2 is a subset of s1");
        }
        
        //s1.addAll(s2) — transforms s1 into the union of s1 and s2. (The union of two sets is the set containing all of the elements contained in either set.)
        
        s1 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
        s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
        System.out.println("s1 before union: " + s1);
        s1.addAll(s2);
        System.out.println("s1 after union: " + s1);
        // s1 before union: [1, 3, 5, 7, 9]
        // s1 after union: [1, 2, 3, 4, 5, 6, 7, 8, 9]
        
        // Intersection operation:
        // s1.retainAll(s2) — transforms s1 into the intersection of s1 and s2. (The intersection of two sets is the set
        // containing only the elements common to both sets.)
        //Example:
        s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
        s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
        System.out.println("s1 before intersection: " + s1);
        s1.retainAll(s2);
        System.out.println("s1 after intersection: " + s1);
        //s1 before intersection: [1, 2, 3, 4, 5, 7, 9]
        //s1 after intersection: [2, 4]
        
        
        // Set difference operation:
        //
        // s1.removeAll(s2) — transforms s1 into the (asymmetric) set difference of s1 and s2. (For example, the set difference of
        // s1 minus s2 is the set containing all of the elements found in s1 but not in s2.)
        //
        // Example:
            
        s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
        s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
         
        System.out.println("s1 before difference: " + s1);
         
        s1.removeAll(s2);
             
        System.out.println("s1 after difference: " + s1);
        //s1 before difference: [1, 2, 3, 4, 5, 7, 9]
        //s1 after difference: [1, 3, 5, 7, 9]
        
//        checkedSet(): Returns a dynamically typesafe view of the specified set.
//        checkedSortedSet(): Returns a dynamically typesafe view of the specified sorted set.
//        emptySet(): Returns the empty set (immutable).
//        singleton(): Returns an immutable set containing only the specified object.
//        unmodifiableSet(): Returns an unmodifiable view of the specified set.
//        unmodifiableSortedSet(): Returns an unmodifiable view of the specified sorted set.  
    }
    
    //Iterating over elements in a Set
    public static void useIterator() {
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        names.add("Alice");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
        // use for loop
        // for (String name : names) {
        // System.out.println(name);
        // }
        
        //Searching for an element in a Set
        //The contains(Object) method returns true if the set contains the specified element, or return false otherwise. For example:
        if (names.contains("Mary")) {
            System.out.println("Found Mary");
        }
    }

}
