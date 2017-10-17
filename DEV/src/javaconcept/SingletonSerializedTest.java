package javaconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import java.io.Serializable;

class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}
    
   /* private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }*/
    private static  SerializedSingleton instance =null;
   // private static final SerializedSingleton instance = new SerializedSingleton();
   /* public static SerializedSingleton getInstance(){
        return instance;
    }*/
    
    public static SerializedSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (SerializedSingleton.class) {
                if(instance == null){
                    instance = new SerializedSingleton();
                }
            }
        }
        return instance;
    }
    
    protected Object readResolve() {
        return getInstanceUsingDoubleLocking();
    }
    
}

public class SingletonSerializedTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstanceUsingDoubleLocking();
        //serialization 
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        
    }

}