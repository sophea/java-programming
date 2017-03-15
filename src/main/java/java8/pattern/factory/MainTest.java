/***/
package java8.pattern.factory;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2017
 */
public class MainTest {
    public static void main(String[] args) {

        //create a product from Factory
        Product p = ProductFactory.createProduct("1");
        p.showProduct();
        
        ProductFactory.createProduct("two").showProduct();
    }
}
