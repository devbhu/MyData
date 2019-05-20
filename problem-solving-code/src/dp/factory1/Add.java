package dp.factory1;

public class Add implements Calculator {
    @Override
    public void calculate(double a, double b) {
        System.out.println("sum : "+(a+b));
    }
}
