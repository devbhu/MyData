package TreeQuestions;

class Node
{
	int data;
	Node left, right;

	Node(int d)
	{
		data = d;
		left = null;
		right = null;
	}
}

public class BinaryTreeTraversal
{
	static Node root;
	static Integer a[]=new Integer[10];
    static Integer i=null;
	BinaryTreeTraversal()
	{
		root = null;
	}

	public void preorderTraversal(Node node)
	{
		if (node == null)
			return;
		System.out.print(node.data + "  ");
		preorderTraversal(node.left);
		preorderTraversal(node.right);

	}

	public void postorderTraversal(Node node)
	{
		if (node == null)
			return;
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.print(node.data + "  ");

	}

	public void inorderTraversal(Node node,Integer i)
	{
		if (node == null)
			return;
		inorderTraversal(node.left,i);
		System.out.print(node.data + "  ");
		//ii=90;
		//System.out.println(i+"  ");
	//	BinaryTreeTraversal.a[BinaryTreeTraversal.i++]=node.data;
		inorderTraversal(node.right,i);

	}

	public static void main(String arg[])
	{
		Integer i =
		null;
		BinaryTreeTraversal bt = new BinaryTreeTraversal();
		BinaryTreeTraversal.root = new Node(1);
		BinaryTreeTraversal.root.left = new Node(2);
		BinaryTreeTraversal.root.right = new Node(3);
		BinaryTreeTraversal.root.left.left = new Node(4);
		BinaryTreeTraversal.root.left.left.left = new Node(8);
		BinaryTreeTraversal.root.left.right = new Node(5);
		BinaryTreeTraversal.root.left.right.right = new Node(11);
		BinaryTreeTraversal.root.right.left = new Node(6);
		BinaryTreeTraversal.root.right.left.left = new Node(9);
		BinaryTreeTraversal.root.right.right = new Node(7);
		System.out.println("preorder traveasal");
		bt.preorderTraversal(root);
		System.out.println();
		System.out.println("inorder traveasal");
		bt.inorderTraversal(root,i);
		System.out.println(i);
		System.out.println();
		System.out.println("postorder traveasal");
		bt.postorderTraversal(root);

	}
}
