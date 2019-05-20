package dp.template;

public interface Processor {
     void readData();
     void processData();
     default void saveData(){
         System.out.println("data is been saved in db");
     }
//this is the rule , same order method should execute
     default void process(){
         readData();
         processData();
         saveData();
     }
}
