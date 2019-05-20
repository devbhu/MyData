package dp.factory1;

public class CalculatorFactory {
    private Calculator calculator;
    public Calculator getCalculator(String type){
        if(type.equalsIgnoreCase("add")){
            calculator = new Add();
        }
        if(type.equalsIgnoreCase("sub")){
            calculator = new Subtract();
        }
        if(type.equalsIgnoreCase("mul")){
            calculator = new Multiplication();
        }
        if(type.equalsIgnoreCase("div")){
            calculator = new Divide();
        }
        return calculator;
    }
}
