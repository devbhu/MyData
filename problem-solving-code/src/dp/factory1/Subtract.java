package dp.factory1;

public class Subtract implements Calculator {
    @Override
    public void calculate(double a, double b) {
        System.out.println("subtraction : "+(a-b));
    }
}
