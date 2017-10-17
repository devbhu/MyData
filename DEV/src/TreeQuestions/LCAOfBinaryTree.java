package TreeQuestions;

public class LCAOfBinaryTree {

	static Node root;
	Node lca(Node node, int n1, int n2) {
		if (node == null) {
			return null;
		}
		if(node.data==n1 || node.data==n2)
			return node;
		Node left=lca(node.left, n1, n2);
		Node right=lca(node.right, n1, n2);

		if (left!=null  && right!=null) 
			return node;
		else if (left==null  && right==null)
			return null;
		else 
			return left != null ? left:right;
	}

	void inorderTraversal(Node node){
		if(node==null)
			return;
		inorderTraversal(node.left);
		System.out.print(node.data+"  ");
		inorderTraversal(node.right);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Let us construct the BST shown in the above figure
		createBST b=new createBST();
		LCAOfBinaryTree tree = new LCAOfBinaryTree();
		LCAOfBinaryTree.root = new Node(20);
		LCAOfBinaryTree.root.left = new Node(8);
		LCAOfBinaryTree.root.right = new Node(22);
		LCAOfBinaryTree.root.right.right = new Node(22);
		LCAOfBinaryTree.root.right.right.left = new Node(50);
		LCAOfBinaryTree.root.left.left = new Node(4);
		LCAOfBinaryTree.root.left.left.left = new Node(40);
		LCAOfBinaryTree.root.left.right = new Node(12);
		LCAOfBinaryTree.root.left.right.left = new Node(10);
		LCAOfBinaryTree.root.left.right.right = new Node(14);

		System.out.println("Tree is ");
		tree.inorderTraversal(root);
		System.out.println();

		int n1 = 40, n2 = 14;
		//if(tree.lca(root, n1, n2)!=null){
			Node t = tree.lca(root, n1, n2);
			System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
		//}

		n1 = 14;
		n2 = 8;
		t = tree.lca(root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

		n1 = 50;
		n2 = 22;
		t = tree.lca(root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
		 


	}

}
