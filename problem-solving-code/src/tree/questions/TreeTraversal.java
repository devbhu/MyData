package tree.questions;

import java.util.Stack;

public class TreeTraversal {

    public static void inOrderIterative(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        while (treeNode != null) {
            stack.push(treeNode);
            treeNode = treeNode.left;
        }
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.data + ", ");
            if (temp.right != null) {
                stack.push(temp.right);

                temp = temp.left;
                while (temp != null) {
                    stack.push(temp.left);
                    temp = temp.left;
                }
            }
        }
    }

    public static void main(String arg[]) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        inOrderIterative(treeNode);

    }
}
