package temp;

public class MyDeadlock extends Thread {
 
	String str1 = "Java";
    String str2 = "UNIX";
     
    Thread trd1 = new Thread("My Thread 1"){
        public void run(){
        	int i=0;
            while(i<5){
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(str1 + str2);
                    }
                }
                i++;
            }
        }
    };
     
    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
        	int i=0;
            while(i<5){
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(str2 + str1);
                    }
                }
                i++;
            }
        }
    };
     
    public static void main(String a[]){
        MyDeadlock mdl = new MyDeadlock();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}