package tree.questions;

public class KthMaxElementBST
{
    Tree root;
   static  int count=0;
   private static  void  kthMaxElemenr(Tree root ,int k)
   {   
	   if(root==null )
		   return ;
	      
	    kthMaxElemenr(root.right,k);
	    if(++count==k)
	     System.out.println(root.data);
	     kthMaxElemenr(root.left,k);
	  
   }
   
   static void inorder(Tree root)
	{
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + ",");
		inorder(root.right);
	}
   
	public static void main(String[] args)
	{
		Tree root = new Tree(15);
		root.left = new Tree(7);
		root.right = new Tree(20);
		root.left.left = new Tree(4);
		root.left.right = new Tree(11);
		root.right.left = new Tree(18);
		root.right.right = new Tree(22);
		root.left.left.left = new Tree(1);
		root.left.left.right = new Tree(5);
		inorder(root);
		System.out.println();
		//System.out.println(kthMaxElemenr(root,3));
		kthMaxElemenr(root,4);
	}

}
