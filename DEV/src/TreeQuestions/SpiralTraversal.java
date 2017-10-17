package TreeQuestions;
import java.util.*;

public class SpiralTraversal {

	/**
	 * @param args
	 */
	static Node root;
	void spiralPrint(Node root){
		Stack<Node> s1 = new Stack <Node>();
		Stack<Node> s2 = new Stack <Node>();
		s1.push(root);

		while (true){

			while(!s1.empty()){

				root=s1.pop();
				System.out.print(root.data+"  ");
				if(root.left!=null)
					s2.push(root.left);
				if(root.right!=null)
					s2.push(root.right);

			}

			while(!s2.empty()){

				root=s2.pop();
				System.out.print(root.data+"  ");
				if(root.right!=null)
					s1.push(root.right);
				if(root.left!=null)
					s1.push(root.left);


			}
			if(s1.empty() && s2.empty())
				break;
		}
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
		SpiralTraversal tree=new SpiralTraversal();
		SpiralTraversal.root = new Node(20);
		SpiralTraversal.root.left = new Node(8);
		SpiralTraversal.root.right = new Node(22);
		SpiralTraversal.root.right.right = new Node(22);
		SpiralTraversal.root.right.right.right = new Node(30);
		SpiralTraversal.root.right.right.left = new Node(50);
		SpiralTraversal.root.left.left = new Node(4);
		SpiralTraversal.root.left.left.left = new Node(40);
		SpiralTraversal.root.left.left.left.left = new Node(4);
		SpiralTraversal.root.left.right = new Node(12);
		SpiralTraversal.root.left.right.left = new Node(10);
		SpiralTraversal.root.left.right.right = new Node(14);

		System.out.println("Tree is ");
		tree.inorderTraversal(root);
		System.out.println();
		System.out.println("Spiral level order traversal Tree is ");
		tree.spiralPrint(root);
	}

}
