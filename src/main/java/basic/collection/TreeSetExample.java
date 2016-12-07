/***/
package basic.collection;

import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class TreeSetExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
     // TreeSet of String Type
        Set<String> treeSet1 = new TreeSet<String>();

        // Adding elements to TreeSet<String>
        treeSet1.add("ABC");
        treeSet1.add("String");
        treeSet1.add("Test");
        treeSet1.add("Pen");
        treeSet1.add("Ink");
        treeSet1.add("Jack");

        //Displaying TreeSet
        System.out.println(treeSet1);

        // TreeSet of Integer Type
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>();

        // Adding elements to TreeSet<Integer>
        treeSet2.add(88);
        treeSet2.add(7);
        treeSet2.add(101);
        treeSet2.add(0);
        treeSet2.add(3);
        treeSet2.add(222);
        System.out.println(treeSet2);

        // Like most of the other collection classes this class is also not synchronized, however it can be synchronized
        // explicitly like this: SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));
        SortedSet s = Collections.synchronizedSortedSet(treeSet2);
        s.add(32);
      //  System.out.println(tset2);
        
    }

}
