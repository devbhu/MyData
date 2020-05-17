package solid.priciple.liskovsubstitution;

public class Engine {
    public void on(){
        System.out.println("car on");
    }

    public void powerOn(int power){
        System.out.println("car generation power :"+power);
    }
}
