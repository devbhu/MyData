package dp.adapter;

public class AdapterDemo {
    public static void main(String arg[]) {
        ITarget iTarget = new Adapter(new Adaptee());
        iTarget.request();
    }
}
