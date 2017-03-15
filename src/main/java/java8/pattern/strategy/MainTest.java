/***/
package java8.pattern.strategy;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2017
 */
public class MainTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Robot r1 = new Robot("Big Robot");
        Robot r2 = new Robot("George v.2.1");
        Robot r3 = new Robot("R2");

        r1.setBehavior(new AgressiveBehavior());
        r2.setBehavior(new DefensiveBehavior());
        r3.setBehavior(new NormalBehavior());
        
        r1.showBehavior();
        r2.showBehavior();
        r3.showBehavior();


    }

}
