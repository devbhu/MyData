package TreeQuestions;
public class isBST {
	public static Node prevNode = null;

	// method 1: do inOrder and check if it is in ascending order
	// doesnt work in case of duplicates
	/*public boolean isBST1(Node root) {
		if (root != null) {
			if (!isBST1(root.left))
				return false;
			if (prevNode != null && prevNode.data >= root.data) {
				return false;
			}
			prevNode = root;
			return isBST1(root.right);
		}
		return true;
	}*/

	// //method 2
	// The max-Min solution
	public boolean isBST2(Node root, int min, int max) {
		if (root != null) {
			if (root.data > max || root.data < min) {
				return false;
			}
			return isBST2(root.left, min, root.data)
					&& isBST2(root.right, root.data, max);
		} 
		else
		{
			return true;
		}
	}

	public void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print("  " + root.data);
			inorder(root.right);
		}
	}

	public static void main(String args[]) {
		isBST i = new isBST();
		Node root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(17);
		root.right.right = new Node(25);
		root.left.left.left = new Node(6);
		System.out.println("Tree is ");
		i.inorder(root);
		System.out.println();
		//System.out.println("is Tree BST ?? METHOD 1 : " + i.isBST1(root));
		System.out.println("is Tree BST ?? METHOD 2 : "
				+ i.isBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		/*root.left.right.right = new Node(40);
		System.out.println("Tree is ");
		i.inorder(root);
		System.out.println();
		//System.out.println("is Tree BST ?? METHOD 1 : " + i.isBST1(root));
		System.out.println("is Tree BST ?? METHOD 2 : "
				+ i.isBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE));*/

	}

}

