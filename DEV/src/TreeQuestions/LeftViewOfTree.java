package TreeQuestions;


class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
/* Class to print the left view */
class LeftViewOfTree
{
    Node root;
    static int  max_level = 0;
 
    // recursive function to print left view
    void leftViewUtil(Node node, int level)
    {
        // Base Case
        if (node==null) return;
 
        // If this is the first node of its level
        if (max_level < level)
        {
            System.out.print(" " + node.data);
            max_level = level;
        }
 
        // Recur for left and right subtrees
      //  leftViewUtil(node.right, level+1);
        leftViewUtil(node.left, level+1);
        leftViewUtil(node.right, level+1);
    }
 
    // A wrapper over leftViewUtil()
    void leftView()
    {
        leftViewUtil(root, 1);
    }
 
    /* testing for example nodes */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
    	LeftViewOfTree tree = new LeftViewOfTree();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.left.right = new Node(11);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);
 
        tree.leftView();
    }
}