package tree.questions;

import java.util.concurrent.atomic.AtomicInteger;

public class RightViewOfTree {

    static void rightView(Node root){
        AtomicInteger lastLevel = new AtomicInteger(0);
        rightView(root, 1, lastLevel);
    }

    private static void rightView(Node root, int level, AtomicInteger lastLevel) {
        if(root == null){
            return;
        }
        if(lastLevel.get() < level){
            System.out.print(root.data+", ");
            lastLevel.set(level);
        }
        rightView(root.right, level +1, lastLevel);
        rightView(root.left, level +1, lastLevel);
        // uncomment below lines and comment above line if you want to print left view of tree
        /*rightView(root.left, level +1, lastLevel);
        rightView(root.right, level +1, lastLevel);*/

    }

    public static void main(String arg[]){
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.right = new Node(4);
        node.right.left = new Node(5);
        node.right.right = new Node(6);
        node.right.left.left = new Node(7);
        node.right.left.right = new Node(8);
        rightView(node);
    }
}
