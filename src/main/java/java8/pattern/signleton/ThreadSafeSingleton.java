package java8.pattern.signleton;
/**
 * thread-safe singleton class is to make the global access method synchronized, so that only one thread can execute this method at a time.
 * drawback : it reduces the performance because of cost associated with the synchronized method
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    
    
}
