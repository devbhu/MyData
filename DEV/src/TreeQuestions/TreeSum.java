package TreeQuestions;

class TreeSum 
{
    Node root;
  
    // Convert a given tree to a tree where every node contains sum of
    // values of nodes in left and right subtrees in the original tree
    int fun(Node root){
    	if(root==null )
    		return 0;
    	fun(root.left);
    	fun(root.right);
    	if(root.left!=null)
    		root.data+=root.left.data;
    	if(root.right!=null)
    		root.data+=root.right.data;
    	/*if(root.left!=null && root.right!=null)
    		root.data+=root.left.data+root.right.data;*/
    	/*if(root.left==null && root.right==null)
    		root.data=0;*/
    	return root.data;
    	
    }
    int toSumTree(Node node) 
    {
        // Base case
        if (node == null)
            return 0;
  
        // Store the old value
        int old_val = node.data;
  
        // Recursively call for left and right subtrees and store the sum
        // as new value of this node
        node.data = toSumTree(node.left) + toSumTree(node.right);
  
        // Return the sum of values of nodes in left and right subtrees
        // and old_value of this node
        return node.data + old_val;
    }
  
    // A utility function to print inorder traversal of a Binary Tree
    void printInorder(Node node) 
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
  
    /* Driver function to test above functions */
    public static void main(String args[]) 
    {
        TreeSum tree = new TreeSum();
  
        /* Constructing tree given in the above figure */
        tree.root = new Node(10);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(-4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(5);
  
        //tree.toSumTree(tree.root);
        tree.fun(tree.root);
  
        // Print inorder traversal of the converted tree to test result 
        // of toSumTree()
        System.out.println("Inorder Traversal of the resultant tree is:");
        tree.printInorder(tree.root);
    }
}