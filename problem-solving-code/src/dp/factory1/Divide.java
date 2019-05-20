package dp.factory1;

public class Divide implements Calculator {
    @Override
    public void calculate(double a, double b) {
        System.out.println("division : "+(a/b));
    }
}
