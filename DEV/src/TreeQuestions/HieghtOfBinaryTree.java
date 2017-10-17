package TreeQuestions;
class HieghtOfBinaryTree {
 
    static Node root;
 
    /* Compute the "maxDepth" of a tree -- the number of 
     nodes along the longest path from the root node 
     down to the farthest leaf node.*/
    int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
             
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
 
            /* use the larger one */
            if (lDepth > rDepth) {
                return (lDepth + 1);
            } else {
                return (rDepth + 1);
            }
        }
    }
     
    /* Driver program to test mirror() */
    public static void main(String[] args) {
 
    	HieghtOfBinaryTree tree = new HieghtOfBinaryTree();
 
        HieghtOfBinaryTree.root = new Node(1);
        HieghtOfBinaryTree.root.left = new Node(2);
        HieghtOfBinaryTree.root.right = new Node(3);
        HieghtOfBinaryTree.root.left.left = new Node(4);
        HieghtOfBinaryTree.root.left.left.left = new Node(4);
        HieghtOfBinaryTree.root.left.right = new Node(5);
        int l=tree.maxDepth(root)-1;
        System.out.println("Height of tree is : " + l);
         
 
    }
}
