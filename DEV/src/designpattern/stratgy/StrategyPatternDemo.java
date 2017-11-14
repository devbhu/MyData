package designpattern.stratgy;
public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context();		
      System.out.println("10 + 5 = " + context.executeStrategy(new OperationAdd(),10, 5));

      context = new Context();		
      System.out.println("10 - 5 = " + context.executeStrategy(new OperationSubstract(),10, 5));

      context = new Context();		
      System.out.println("10 * 5 = " + context.executeStrategy(new OperationMultiply(),10, 5));
   }
}