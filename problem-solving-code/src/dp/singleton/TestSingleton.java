package dp.singleton;

public class TestSingleton {

    public static void main(String arg[]){
        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();
        System.out.println(logger.hashCode());
        System.out.println(logger1.hashCode());
    }
}
