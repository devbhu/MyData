package TreeQuestions;
import java.util.Scanner;
class TreeNode {
	int data;
	TreeNode left;
	TreeNode right; 
	TreeNode(int data)
	{
		this.data=data; 
		left=null;
		right=null;
	}
}
public class createBST {

	/**
	 * @param args
	 */
	// Find kth largest element is BST
	static Integer c=0;
	public static void ReverseInorderTraversal(TreeNode node,Integer key){
		//Integer c=0;
		if(node==null || key<2)
			return;
		//c++;
		// System.out.println(c);
		ReverseInorderTraversal(node.right,key);
		c++;
		System.out.println(c);
		if(c==key)
		{
			System.out.println(c+"th largest number is  "+node.data);
			return;
		}
		ReverseInorderTraversal(node.left,key);

	}
	// Create Binary Tree

	public static TreeNode createTree(TreeNode root,int value)
	{

		if(root==null)
			root=new TreeNode(value);
		if(root.data>value)
		{
			if(root.left==null)
				root.left=new TreeNode(value);
			else
				createTree(root.left,value);
		}

		if(root.data<value)
		{
			if(root.right==null)
				root.right=new TreeNode(value);
			else
				createTree(root.right,value);
		}
		return root;
	}

	public static void inorderTraversal(TreeNode node){
		if(node==null)
			return;
		inorderTraversal(node.left);
		System.out.print(node.data+"  ");
		inorderTraversal(node.right);

	}
	 
	 public void preorderTraversal(TreeNode node){
    	 if(node==null)
    		 return;
    	 System.out.print(node.data+"  ");
    	 preorderTraversal(node.left);
    	 preorderTraversal(node.right);
    	 
     }
     public void postorderTraversal(TreeNode node){
    	 if(node==null)
    		 return;
    	 postorderTraversal(node.left);
    	 postorderTraversal(node.right);
    	 System.out.print(node.data+"  ");
    	 
     }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc =new  Scanner(System.in);
		TreeNode root=null;
		System.out.println("please enter number of tree node kth value");
		int n= sc.nextInt();
		int key= sc.nextInt();
		System.out.println("please enter tree node");
		for(int i=0;i<n;i++)
		{

			int value=sc.nextInt();
			root=createTree(root,value);
		}
		inorderTraversal(root);
		System.out.println();

		ReverseInorderTraversal(root,key);
	}

}
