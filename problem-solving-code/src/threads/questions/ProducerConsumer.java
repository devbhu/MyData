package threads.questions;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
    public static void main(String a[]) {
        BlockingQueue<Integer> blockingQueue =
                new LinkedBlockingQueue<Integer>(100);
        // Producer thread creation
        Thread producer = new Thread(new Producer(blockingQueue, 1));
        Thread producer1 = new Thread(new Producer(blockingQueue, 11));
        Thread producer2 = new Thread(new Producer(blockingQueue, 21));

        Thread consumer = new Thread(new ConsumerThread(blockingQueue));
        Thread consumer1 = new Thread(new ConsumerThread(blockingQueue));
        Thread consumer2 = new Thread(new ConsumerThread(blockingQueue));

        // Start Producer and Consumer thread
        producer.start();
        producer1.start();
        producer2.start();

        consumer.start();
        consumer1.start();
        consumer2.start();
    }
}

class Producer implements Runnable {

    private final BlockingQueue<Integer> blockingQueue;
    private int temp;

    public Producer(BlockingQueue<Integer> blockingQueue, int temp) {
        this.blockingQueue = blockingQueue;
        this.temp = temp;
    }

    public void run() {
        for (int i = temp; i < temp + 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Data produced : " + i);
                blockingQueue.put(i);
            } catch (InterruptedException ex) {
                System.out.println("Producer thread interrupted.");
            }
        }
    }

    public void printBQ() {
        System.out.println(blockingQueue.toString());
    }
}

class ConsumerThread implements Runnable {

    private final BlockingQueue<Integer> blockingQueue;

    public ConsumerThread(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Data consumed : " + blockingQueue.take());
            } catch (InterruptedException ex) {
                System.out.println("Consumer thread interrupted.");
            }
        }
    }
}
