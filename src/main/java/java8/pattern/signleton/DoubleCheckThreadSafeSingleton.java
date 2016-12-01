package java8.pattern.signleton;
/**
 * double checked locking principle is used. In this approach, the synchronized block is used inside.
 * if condition with an additional check to ensure that only one instance of singleton class is created.
 */
public class DoubleCheckThreadSafeSingleton {

    private static DoubleCheckThreadSafeSingleton instance;
    
    private DoubleCheckThreadSafeSingleton(){}
    
    public static  DoubleCheckThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new DoubleCheckThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
    
    
}
