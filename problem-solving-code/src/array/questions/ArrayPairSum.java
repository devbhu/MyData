package array.questions;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairSum {

    private static void printPair(int a[], int len, int sum){
        Set<Integer> hashSets = new HashSet<>();
        for(int i = 0; i < len; i++){
            if(hashSets.contains(sum - a[i])){
                System.out.println("The pair are "+a[i]+" and "+(sum-a[i]));
                break;
            }
            hashSets.add(a[i]);
        }
    }

    public static void main(String arg[]){
        int a[] = {-1,4,45,6,10,-9};
        printPair(a,6,-10);
    }
}
