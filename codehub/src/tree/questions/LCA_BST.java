package tree.questions;
/*class Node {
 
    int data;
    Node left, right;
 
    Node(int item) {
        data = item;
        left = right = null;
    }
}*/
 
class LCA_BST {
 
    static Node root;
     
    /* Function to find LCA of n1 and n2. The function assumes that both
     n1 and n2 are present in BST */
    Node lca(Node node, int n1, int n2) {
        if (node == null) {
            return null;
        }
 
        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (node.data > n1 && node.data > n2) {
            return lca(node.left, n1, n2);
        }
 
        // If both n1 and n2 are greater than root, then LCA lies in right
        if (node.data < n1 && node.data < n2) {
            return lca(node.right, n1, n2);
        }
 
        return node;
    }
 
    public static void main(String args[]) {
 
        // Let us construct the BST shown in the above figure
    	LCA_BST tree = new LCA_BST();
        LCA_BST.root = new Node(20);
        LCA_BST.root.left = new Node(8);
        LCA_BST.root.right = new Node(22);
        LCA_BST.root.left.left = new Node(4);
        LCA_BST.root.left.right = new Node(12);
        LCA_BST.root.left.right.left = new Node(10);
        LCA_BST.root.left.right.right = new Node(14);
 
        int n1 = 22, n2 = 14;
        Node t = tree.lca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
 
        n1 = 14;
        n2 = 8;
        t = tree.lca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
 
        n1 = 10;
        n2 = 22;
        t = tree.lca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
 
    }
}