package TreeQuestions;

import java.util.Scanner;

public class DeletionInBST {

	TreeNode findMin(TreeNode t){
		while(t.left!=null){
			t=t.left;

		}
		return t;
	}
	TreeNode deleteNode(TreeNode root,int value){

		if(root==null)
			return null;

		if(root.data>value){
			//parent=root;
			root.left=deleteNode(root.left,value);
		}
		else if(root.data<value){

			root.right=deleteNode(root.right,value);

		}
		else {

//if node has no child
			if(root.left==null && root.right==null){
				root=null;
				return root;

			}
			//if node has only one  child
			else if(root.left==null){
				TreeNode temp=root;
				root=root.right;
				temp=null;
				return root;
			}
			else if(root.right == null){
				TreeNode temp=root;
				root=root.left;
				temp=null;
				return root;
			}
			//if node has two child
			else if(root.left!=null && root.right!=null){
				TreeNode temp=findMin(root.right);
				root.data=temp.data;
				root.right=deleteNode(root.right,temp.data);
			}


		}

		return root;
	}


	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
		createBST b = new createBST();
		DeletionInBST del= new DeletionInBST();
		TreeNode root=null;
		System.out.println("please enter number of tree node");
		int n= sc.nextInt();
		System.out.println("please enter tree node");
		for(int i=0;i<n;i++)
		{

			int value=sc.nextInt();
			root=createBST.createTree(root,value);
		}
		createBST.inorderTraversal(root);
		System.out.println();
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

	}

}
