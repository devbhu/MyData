package tree.questions;

public class SameTree {

    public static boolean sameTree(Node r1, Node r2){
        if(r1 == null && r2 == null){
            return true;
        }
        if(r1 == null || r2 == null){
            return false;
        }

        return true;
    }
    public static void main(String arg[]){

    }
}
