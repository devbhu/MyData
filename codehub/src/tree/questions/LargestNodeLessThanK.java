package tree.questions;

public class LargestNodeLessThanK
{
	 static Node root;
	  private static int largestNode(Node node , int K){
		  Node last_right_move = null;

		    while (node!=null)
		    {
		        if (K<=node.data)
		            node = node.left;
		        else
		        {
		            last_right_move = node;
		            node = node.right;
		        }
		    }

		    if (last_right_move!=null)
		        return last_right_move.data;
		    else
		        return Integer.MIN_VALUE;
	  }

	public static void main(String[] args)
	{
		LargestNodeLessThanK tree = new LargestNodeLessThanK();
        LargestNodeLessThanK.root = new Node(10);
        LargestNodeLessThanK.root.left = new Node(5);
        LargestNodeLessThanK.root.right = new Node(12);
        LargestNodeLessThanK.root.left.left = new Node(2);
        LargestNodeLessThanK.root.left.right = new Node(8);
        LargestNodeLessThanK.root.left.right.left = new Node(11);
        LargestNodeLessThanK.root.left.right.right = new Node(14);
        System.out.println(largestNode(root,1));

	}

}
