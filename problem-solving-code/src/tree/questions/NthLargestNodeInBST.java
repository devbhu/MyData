package tree.questions;
//import java.Node;
/*class Node
{
	int data;
	Node left, right;

	Node(int d)
	{
		data = d;
		left = null;
		right = null;
	}
}*/
public class NthLargestNodeInBST
{
	 
	public void getNthLargestNode(Node node,int count[],int n)
	{
		if (node == null)
			return;
		getNthLargestNode(node.right, count,n);
		count[0]++;
		//System.out.print(count[0]+"  ");
		if(count[0]==n)
		System.out.print("Nth"+n+"largest value in BST is :"+node.data);
		getNthLargestNode(node.left,count,n);

	}
	public void inorderTraversal(Node node)
	{
		if (node == null)
			return;
		inorderTraversal(node.left);
		System.out.print(node.data + "  ");
		inorderTraversal(node.right);

	}
	public static void main(String[] args)
	{
		NthLargestNodeInBST ln = new NthLargestNodeInBST();
		int count[] =new int[1];
		count[0]=0;
		Node root = new Node(11);
		root.left = new Node(8);
		root.right = new Node(15);
		root.left.left = new Node(5);
		root.left.left.left = new Node(2);
		root.left.left.right = new Node(6);
		root.left.right = new Node(10);
		root.right.left = new Node(12);
		root.right.right = new Node(18);
		System.out.println("inorder traveasal");
		ln.inorderTraversal(root);
		//System.out.println("nth largest node value is ");
		ln.getNthLargestNode(root, count, 9);

	}

}
