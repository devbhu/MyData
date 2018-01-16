package miscellaneous.questions;

import java.util.Scanner;
    import java.util.concurrent.atomic.AtomicInteger;

    class UpdateVariable
    {
        static int num = 0;
        public static AtomicInteger  atomicInteger = new AtomicInteger(num);


        @SuppressWarnings("resource")
        public static void main(String args[])
        {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter Number of Threads: ");
           /* int getThreadNumber = userInput.nextInt();
            for(int i = 0; i < getThreadNumber; i++)
            {
                PrintThread p = new PrintThread();
                p.start();
            }*/
            PrintThread p1 = new PrintThread();
            p1.start();
            System.out.println("Thread Name: "+p1.getName());
            PrintThread p2 = new PrintThread();
            p2.start();
            System.out.println("Thread Name: "+p2.getName());
            PrintThread p3 = new PrintThread();
            p3.start();
            System.out.println("Thread Name: "+p3.getName());
            PrintThread p4 = new PrintThread();
            p4.start();
            System.out.println("Thread Name: "+p4.getName());

        }

    }

    class PrintThread extends Thread
    {
        public void run()
        {
        	
            //System.out.println("Thread Started: ");
            System.out.println(UpdateVariable.atomicInteger.incrementAndGet());

        }
    }