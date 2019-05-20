package oops.concept;

public class B implements A {
    String bName = "B class";
    public void printB(){
        System.out.println("This is "+bName);
    }

    @Override
    public void printAB() {
        System.out.println("this is AB");
    }
}
