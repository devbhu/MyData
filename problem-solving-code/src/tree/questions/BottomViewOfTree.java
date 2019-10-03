package tree.questions;

import java.util.*;

class Pair{
    Node node;
    Integer hd;

    public Pair(Node first, Integer second) {
        this.node = first;
        this.hd = second;
    }

    public static Pair of(Node u, Integer v){
        return new Pair(u, v);
    }
}
public class BottomViewOfTree {

    private static void printBottomViewTree(Node root){
        if (Objects.isNull(root)) {
            return;
        }
        Pair temp;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        Pair pair = Pair.of(root,0);
        q.add(pair);
        while (!q.isEmpty()){
            Pair p = q.poll();
            map.put(p.hd, p.node.data);
            if(p.node.left != null){
                temp = Pair.of(p.node.left, p.hd-1);
                q.add(temp);
            }
            if(p.node.right != null){
                temp = Pair.of(p.node.right, p.hd+1);
                q.add(temp);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.print(entry.getValue()+", ");
        }

    }

    public static void main(String a[]){
        /*Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(17);
        root.right.right = new Node(25);
        root.left.left.left = new Node(6);*/
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        System.out.println("Bottom view of tree is :");
        printBottomViewTree(root);
    }

}
