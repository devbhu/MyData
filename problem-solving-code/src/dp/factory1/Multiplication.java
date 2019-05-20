package dp.factory1;

public class Multiplication implements Calculator {
    @Override
    public void calculate(double a, double b) {
        System.out.println("multiplication : "+(a*b));
    }
}
