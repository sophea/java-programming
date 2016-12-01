package java8.pattern.signleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*
Sometimes in distributed systems, we need to implement Serializable interface in Singleton class so that we can store it’s state in 
file system and retrieve it at later point of time. Here is a small singleton class that implements Serializable interface also.
*/

public class SerializationSingleton implements Serializable {
    /*some JVM get this error add it to resolve the issue**/
    private static final long serialVersionUID = 1L;
    
    private static SerializationSingleton instance;
    
    private SerializationSingleton(){}
    
    public static synchronized SerializationSingleton getInstance(){
        if(instance == null){
            instance = new SerializationSingleton();
        }
        return instance;
    }
    /**
     * So it destroys the singleton pattern, to overcome this scenario all we need to do it provide 
     * the implementation of readResolve() method.
     * */
    protected Object readResolve() {
        return getInstance();
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        SerializationSingleton instanceOne = SerializationSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializationSingleton instanceTwo = (SerializationSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
    }
    
}
