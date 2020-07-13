package threads.questions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLock {
    public static void main(String ar[]) {

        Printer print = new Printer(new ReentrantLock());
        Thread t1 = new Thread(new TaskEvenOdd(print, 10, false),"Odd");
        Thread t2 = new Thread(new TaskEvenOdd(print, 10, true),"Even");
        t1.start();
        t2.start();
    }
}

class TaskEvenOdd implements Runnable {
    private int max;
    private Printer print;
    private boolean isEvenNumber;

    public TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
        this.max = max;
        this.print = print;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }
    }
}
class Printer {

    private volatile boolean isOdd;
    Lock lock;

    public Printer(Lock lock) {
        this.lock = lock;
    }

    void printEven(int number) {
        while (!isOdd) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + ":" + number);
                isOdd = false;

            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }finally {
                lock.unlock();
            }
        }

    }

      void printOdd(int number) {
        while (isOdd) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + ":" + number);
                isOdd = true;
               // wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
            finally {
                lock.unlock();
            }
        }

    }
}