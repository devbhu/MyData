package dp.factory1;

public class TestCalculator {
    public static void main(String arg[]) {
        CalculatorFactory calculatorFactory = new CalculatorFactory();
        Calculator calculator = calculatorFactory.getCalculator("add");
        calculator.calculate(45.0, 50.0);
        calculator = calculatorFactory.getCalculator("sub");
        calculator.calculate(45.0, 50.0);
        calculator = calculatorFactory.getCalculator("mul");
        calculator.calculate(45.0, 50.0);
        calculator = calculatorFactory.getCalculator("div");
        calculator.calculate(45.0, 50.0);
    }
}
