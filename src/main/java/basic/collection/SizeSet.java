/***/
package basic.collection;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class SizeSet {
    public static void main(String[] args) {
        EnumSet<Size> largeSizes = EnumSet.of(Size.XL,Size.XXL,Size.XXXL);
        for(Iterator<Size> it = largeSizes.iterator();it.hasNext();){
            Size size = (Size)it.next();
            System.out.println(size);
        }
    }
}

enum Size {
    S, M, L, XL, XXL, XXXL;

  }