package oops.concept;

public interface A {
    String aName = "A class";

    default void printA(){
        System.out.println("This is "+aName);
    }

    public void printAB();
}
