package basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Here we can see example for basic ArrayList operations like creating object for ArrayList, adding objects into ArrayList,
 * accessing objects based on index, searching an object in ArrayList whether it is listed under this instance or not, adding
 * elements at specific index, checking whether the ArrayList is empty or not, getting object index, and finally size of the
 * ArrayList. - See more at: http://www.java2novice.com/java-collections-and-util/arraylist/basic-operations/#sthash.IfA15Hfd.dpuf
 * 
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class MyBasicArrayList {

    public static void main(String[] a){
        List<String> list = new ArrayList<>();
        
        //add elements to the ArrayList
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
        System.out.println("Is arraylist empty? "+list.isEmpty());
        //indexOf
        System.out.println("Index of PERL is "+list.indexOf("PERL"));
        
        //size
        System.out.println("Size of the arraylist is: "+list.size());
        
        Collections.reverse(list);
        System.out.println("Results after reverse operation:");
        System.out.println(list);

    }

//        Output:
//
//        [JAVA, C++, PERL, PHP]
//        Element at index 1: C++
//        Does list contains JAVA? true
//        [JAVA, C++, PLAY, PERL, PHP]
//        Is arraylist empty? false
//        Index of PERL is 3
//        Size of the arraylist is: 5

        
}
