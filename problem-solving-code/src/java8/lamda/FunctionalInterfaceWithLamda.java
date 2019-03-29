package java8.lamda;

@FunctionalInterface
interface  Interf {
    public void add(int a, int b);
}

class Demo implements Interf{
    public void  add(int a, int b ){
        System.out.println("Sum :"+(a + b));
    }
}

public class FunctionalInterfaceWithLamda {
    public static void main(String arg[]) {
        Interf i = new Demo();
        i.add(23, 45);

        Interf in = (a, b) -> {
            System.out.println("Sum :" + (a + b+1));
        };
        in.add(4,5);
    }
}
