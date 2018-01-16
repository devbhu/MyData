package dp.strategy;
public class Context {
 //  private Strategy strategy;

  public Context()
	{
		// TODO Auto-generated constructor stub
	}

/* public Context(Strategy strategy){
      this.strategy = strategy;
   }
*/
   public int executeStrategy(Strategy strategy,int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}