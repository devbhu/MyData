package tree.questions;

import java.util.Scanner;

public class SizeOfBinaryTree {

	/**
	 * @param args
	 */
	int size(TreeNode root){
		if(root==null)
			return 0;
		int left_size=size(root.left);
		int right_size=size(root.right);
				return left_size+right_size+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new  Scanner(System.in);
		createBST b = new createBST();
		DeletionInBST del= new DeletionInBST();
		SizeOfBinaryTree s= new SizeOfBinaryTree();
		TreeNode root=null;
		System.out.println("please enter number of tree node");
		int n= sc.nextInt(); 
		System.out.println("please enter tree node");
		for(int i=0;i<n;i++)
		{

			int value=sc.nextInt();
			root=createBST.createTree(root,value);
		}
		System.out.println("Inorder trversal of tree is ");
		createBST.inorderTraversal(root);
		System.out.println();
		System.out.println("Size of tree is "+s.size(root));
		
		System.out.println("please enter tree node to delete ");
		int key= sc.nextInt();
		TreeNode temp=root;
		while(temp.right!=null)
			temp = temp.right;

		if(del.deleteNode(root,key)!=null){
			root=del.deleteNode(root,key);

		}

		System.out.println("Tree after deletion of "+key+"  is ");
		createBST.inorderTraversal(root);
		System.out.println();
		System.out.println("Size of Tree after deletion of "+key+"  is "+s.size(root));
	}

}
