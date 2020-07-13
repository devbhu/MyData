package dynamic.questions;

public class MinNumberOfOperation {

    private static int minOperation(int n){
        if(n==0)
            return 0;
        if(n%2==0){
            return 1+minOperation(n/2);
        }
        else{
            return 1+minOperation(n-1);
        }
    }

    public static void main(String a[]){
        System.out.println("Minimum number of operation: "+minOperation(7));
    }
}
