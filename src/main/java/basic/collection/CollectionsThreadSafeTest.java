/***/
package basic.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Why are almost collection classes not thread-safe?
 * Do you notice that all the basic collection classes - ArrayList, LinkedList, HashMap, HashSet, TreeMap, TreeSet, etc - all are
 * not synchronized? In fact, all collection classes (except Vector and Hashtable) in the java.util package are not thread-safe.
 * The only two legacy collections are thread-safe: Vector and Hashtable. WHY?
 * 
 * Here’s the reason: Synchronization can be very expensive!
 * You know, Vector and Hashtable are the two collections exist early in Java history, and they are designed for thread-safe from
 * the start (if you have chance to look at their source code, you will see their methods are all synchronized!). However, they
 * quickly expose poor performance in multi-threaded programs. As you may know, synchronization requires locks which always take
 * time to monitor, and that reduces the performance.
 * That’s why the new collections (List, Set, Map, etc) provide no concurrency control at all to provide maximum performance in
 * single-threaded applications.
 * The following test program compares performance between Vector and ArrayList - the two similar collections (Vector is
 * thread-safe and ArrayList is not):
 * 
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class CollectionsThreadSafeTest {

    public void testVector() {
        long startTime = System.currentTimeMillis();
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 10_000_000; i++) {
            vector.addElement(i);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Test Vector: " + totalTime + " ms" + " loop items " + 10_000_000);

    }

    public void testArrayList() {
        long startTime = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Test ArrayList: " + totalTime + " ms");

    }

    public static void main(String[] args) {
        
        CollectionsThreadSafeTest tester = new CollectionsThreadSafeTest();

        tester.testVector();
        tester.testArrayList();
        
//        Test Vector: 9266 ms
//        Test ArrayList: 4588 ms
    }
}
