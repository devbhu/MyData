package TreeQuestions;
import java.util.Scanner;

public class InorderSucessor {

	TreeNode findMin(TreeNode t){
		while(t.left!=null){
			t=t.left;

		}
		return t;
	}
	TreeNode Find(TreeNode root,int v){
		if(root.data==v)
			return root;
		else if(root.data>v)
			return Find(root.left,v);
		else if(root.data<v)
			return Find(root.right,v);
		else
			return null;

	}
	TreeNode  Successor(TreeNode root,int d){

		TreeNode curr=Find(root,d);
		//System.out.println(curr.data);

		if(curr.right!=null){
			return findMin(curr.right);
		}
		//if node has no right subtree
		else{
			TreeNode sucessor=null;
			TreeNode ancestor=root;

			while(ancestor!=curr){
				if(ancestor.data>curr.data){
					sucessor=ancestor;
					ancestor=ancestor.left;
				}
				else
					ancestor=ancestor.right;
			}
			return sucessor;
		}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new  Scanner(System.in);
		createBST b = new createBST();
		InorderSucessor is= new InorderSucessor();
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
		System.out.println("please enter tree node to find inorder sucessor ");
		int key= sc.nextInt();
		TreeNode temp=root;
		while(temp.right!=null)
			temp = temp.right;
		
		if(is.Successor(root,key)!=null && temp.data!=key)
			System.out.println("Successor of  "+key+"  is "+is.Successor(root,key).data);
		else
			System.out.println("Successor of  "+key+"  cannot find");

	}

}
