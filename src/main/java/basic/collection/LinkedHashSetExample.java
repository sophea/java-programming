/***/
package basic.collection;

import java.util.LinkedHashSet;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class LinkedHashSetExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // LinkedHashSet of String Type
        LinkedHashSet<String> linkHastSetTest = new LinkedHashSet<String>();

        // Adding elements to the LinkedHashSet
        linkHastSetTest.add("Z");
        linkHastSetTest.add("PQ");
        linkHastSetTest.add("N");
        linkHastSetTest.add("O");
        linkHastSetTest.add("KK");
        linkHastSetTest.add("FGH");
        System.out.println(linkHastSetTest);

        // LinkedHashSet of Integer Type
        LinkedHashSet<Integer> linkSet2 = new LinkedHashSet<Integer>();

        // Adding elements
        linkSet2.add(99);
        linkSet2.add(7);
        linkSet2.add(0);
        linkSet2.add(67);
        linkSet2.add(89);
        linkSet2.add(66);
        System.out.println(linkSet2);

    }

}
