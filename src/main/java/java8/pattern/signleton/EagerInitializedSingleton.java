package java8.pattern.signleton;
/**
 * Eager initialization, the instance of Singleton Class is created at the time of class loading, 
 * this is the easiest method to create a singleton class 
 * but it has a drawback that instance is created even though client application might not be using it.
 * 
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
/**
 * 
 * 
 */
public class EagerInitializedSingleton {
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}