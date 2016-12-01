/***/
package basic.ch1;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class TestModuleOperator {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isOddNumber(-3));
        
        System.out.println(isOddNumber(30));
        
        System.out.println(isOddNumber(41));

    }

    /**
     * this might not work with negative number unless num param parsing to abs number
     * */
//    public static boolean isOddNumber(int num) {
//        return num % 2 == 1;
//    }
    /**
    These lines above seem correct but they will return incorrect results one of every four times (Statistically speaking).
     Consider a negative Odd number, the remainder of division with 2 will not be 1. So, the returned result will be false which is incorrect!
    This can be fixed as follows:
    */
    public static boolean isOddNumber(int num) {
         return (num & 1) != 0;
    }
}
