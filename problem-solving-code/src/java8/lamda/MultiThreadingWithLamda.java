package java8.lamda;
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i= 0 ; i < 10 ; i++){
            System.out.println("child thread");
        }
    }
}
public class MultiThreadingWithLamda {
    public static void main(String a[]){
        Runnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        Runnable r1 = () -> {
            for(int i= 0 ; i < 10 ; i++){
                System.out.println("child thread using lamda");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        for(int i= 0 ; i < 10 ; i++){
            System.out.println("main thread");
        }
    }

}
