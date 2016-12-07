/***/
package basic.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class MyLinkedList {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
      //add elements to the LinkedList
        list.add("JAVA");
        list.add("C++");
        list.add("PERL");
        list.add("PHP");
        System.out.println(list);
        //get elements by index
        System.out.println("Element at index 1: "+list.get(1));
        System.out.println("Does list contains JAVA? "+list.contains("JAVA"));
        
        //add elements at a specific index
        list.add(2,"PLAY");
        System.out.println(list);
        //check Empty or not
        System.out.println("Is linkedlist empty? "+list.isEmpty());
        //indexOf
        System.out.println("Index of PERL is "+list.indexOf("PERL"));
        
        //size
        System.out.println("Size of the linkedlist is: "+list.size());
        
        Collections.reverse(list);
        System.out.println("Results after reverse operation:");
        System.out.println(list);

    }

}
