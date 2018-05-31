package temp;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerPattern {

    public static void main(String args[]){
  
     //Creating shared object
     BlockingQueue sharedQueue = new LinkedBlockingQueue();
 
     //Creating Producer and Consumer Thread
     Thread prodThread = new Thread(new Producer1(sharedQueue));
     Thread consThread = new Thread(new Consumer1(sharedQueue));

     //Starting producer and Consumer thread
     prodThread.start();
     //Thread.sleep(1000);
     consThread.start();
    }
 
}

//Producer Class in java
class Producer1 implements Runnable {

    private final BlockingQueue sharedQueue;

    public Producer1(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

  //  @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                System.out.println("Produced: " + i);
                sharedQueue.put(i);
               Thread.sleep(10);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Producer1.class.getName()).log(Level.SEVERE, null, ex);
            	ex.printStackTrace();
            }
        }
    }

}

//Consumer Class in Java
class Consumer1 implements Runnable{

    private final BlockingQueue sharedQueue;

    public Consumer1 (BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
  
   // @Override
    public void run() {
    	int i=0;
        while(i<10){
            try {
                System.out.println("Consumed: "+ sharedQueue.take());
            } catch (InterruptedException ex) {
               // Logger.getLogger(Consumer1.class.getName()).log(Level.SEVERE, null, ex);
            	ex.printStackTrace();
            }
            i++;
       }
    }
  
  
}


