package java8.lamda;

public class MethodReference {
    public static void main(String a[]) {


//        Thread t = new Thread(() -> printMessage());
        Thread t = new Thread(MethodReference::printMessage);
        t.start();
        // System.out.print();
    }

    private static void printMessage() {
        System.out.print("dev");
    }
}
