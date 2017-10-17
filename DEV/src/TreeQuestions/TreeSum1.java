package TreeQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Tree
{
	int data;
	Tree left;
	Tree right;

	Tree(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
}

public class TreeSum1
{
	static int level = 0;
	Tree root;
	
	
	private static void postorderNonRecursive(Tree root){
		Stack<Tree> s= new Stack<Tree>();
		if(root==null)
			return;
		Tree temp=root;
		Tree q=root;
		while(true){
			while(temp.left!=null){
				s.push(temp);
				temp=temp.left;
			}
			while(temp.right==null || temp.right==q){
				System.out.print(temp.data+"   ");
				q=temp;
				if(s.empty()){
					return;
				}
				temp=s.pop();
			}
			s.push(temp);
			temp=temp.right;
			if(s.empty()){
				return;
			}
			
		}
	}
	private static void inorderNonRecurssive(Tree root1){
		if(root1==null)
			return;
		Stack<Tree> s= new Stack<Tree>();
		Tree temp=root1;
		while(temp!=null){
			s.push(temp);
			temp=temp.left;
		}
		
		while(!s.empty()){
			Tree t=s.pop();
			System.out.print(t.data+"  ");
			if(t.right!=null){
				Tree q=t.right;
				while(q!=null){
					s.push(q);
					q=q.left;
				}
			}
		}
	}
    private static  void labelOrderTraversal(Tree root){
    	Queue<Tree> q= new LinkedList<Tree>();
    	q.offer(root);
    	while(!q.isEmpty()){
    		Tree curr= q.poll();
    		System.out.print(curr.data+",");
    		if (curr.left != null && curr.right != null)
			{
				q.offer(curr.left);
				q.offer(curr.right);
			} else if (curr.left != null && curr.right == null)
				q.offer(curr.left);
			else if (curr.left == null && curr.right != null)
				q.offer(curr.right);
    	}
    	
		
     }
    private static void preorder(Tree node ){
    	Stack s= new Stack<Tree>();
    	s.push(node);
    	while(!s.empty()){
    		Tree curr=(Tree) s.pop();
    		System.out.print(curr.data+",");
    		if (curr.left != null && curr.right != null)
			{
				s.push(curr.right);
				s.push(curr.left);
			} else if (curr.left != null && curr.right == null)
				s.push(curr.left);
			else if (curr.left == null && curr.right != null)
				s.push(curr.right);
    		
    	}
    }
    
	private static int sumTree(Tree root)
	{
		if (root == null)
			return 0;
		int oldValue = root.data;
		int left = sumTree(root.left);
		int right = sumTree(root.right);
		root.data = left + right;
		return root.data + oldValue;
	}

	static void spiral(Tree root)
	{
		if (root == null)
			return;
		Stack s1 = new Stack<Tree>();
		Stack s2 = new Stack<Tree>();
		s1.push(root);
		Tree curr;
		while (true)
		{

			while (!s1.empty())
			{
				curr = (Tree) s1.pop();
				System.out.print(curr.data + ",");
				if (curr.left != null && curr.right != null)
				{
					s2.push(curr.right);
					s2.push(curr.left);
				} else if (curr.left != null && curr.right == null)
					s2.push(curr.left);
				else if (curr.left == null && curr.right != null)
					s2.push(curr.right);
			}
			while (!s2.empty())
			{
				curr = (Tree) s2.pop();
				System.out.print(curr.data + ",");
				if (curr.left != null && curr.right != null)
				{
					s1.push(curr.left);
					s1.push(curr.right);
				} else if (curr.left != null && curr.right == null)
					s1.push(curr.left);
				else if (curr.left == null && curr.right != null)
					s1.push(curr.right);
			}
			if (s1.empty() && s2.empty())
				return;
		}

		/*
		 * if(root==null) return ; if(level==0){ System.out.println(root.data);
		 * level =1; } if(level==1){ System.out.println(root.data);
		 * spiral(root.left); spiral(root.right); level=2; } if(level==2){
		 * System.out.println(root.data); spiral(root.left); spiral(root.right);
		 * level=1; }
		 */
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
		//root.left.left.right.right = new Tree(9100);
		//root.left.left.right.left = new Tree(910);
		System.out.println("given tree inorder ");
	    inorder(root);
	   /* System.out.println();
	    System.out.println("tree lable order  ");
	    labelOrderTraversal(root);
	    System.out.println();
	    System.out.println("tree lable order spiral  ");
	    spiral(root);
	    System.out.println();
	    System.out.println("pre order traversal");
	    preorder(root);
	    System.out.println();
	    System.out.println("in order traversal non recurssive");
	    inorderNonRecurssive(root);
	    System.out.println();
	    System.out.println("pre order traversal non recurssive");
	    postorderNonRecursive(root);
	    System.out.println();
	    System.out.println("tree sum  ");
	    sumTree(root);
	    inorder(root);*/
	    
	    
	
		
		
		

	}

}
