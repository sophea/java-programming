package java8.pattern.signleton;
/*
 * Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
 * 
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}