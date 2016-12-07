package basic.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String args[]) {
        // HashSet declaration
       Set<String> hset =  new HashSet<String>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);

        //Displaying HashSet elements
        System.out.println(hset);
      }
}
