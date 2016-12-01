package java8.pattern.signleton;

/**
 * Static block initialization implementation is similar to eager initialization, 
 * except that instance of class is created in the static block that provides option for exception handling.
 * 
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public class StaticBlockSingleton {

    private StaticBlockSingleton() {
        
    }
    
    private static StaticBlockSingleton instance = null;
    
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
