package TreeQuestions;


class MinMax{
    int min;
    int max;
    boolean isBST;
    int size ;
    
    MinMax(){
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        isBST = true;
        size = 0;
    }
    
   
}

public class LorgestBSTInBinaryTree {

	static Node root;
	
	 public int largestBST(Node root){
	        MinMax m = largest(root);
	        return m.size;
	       
	    }
	    
	    private MinMax largest(Node root){
	       
	        if(root == null){
	            return new MinMax();
	        }
	        
	        MinMax leftMinMax = largest(root.left);
	        MinMax rightMinMax =largest(root.right);
	        
	        MinMax m = new MinMax();
	        if(leftMinMax.isBST == false || rightMinMax.isBST == false || (leftMinMax.max > root.data || rightMinMax.min <= root.data)){
	            m.isBST = false;
	            m.size = Math.max(leftMinMax.size, rightMinMax.size);
	            return m;
	        }
	        m.isBST = true;
	        m.size = leftMinMax.size + rightMinMax.size + 1;
	        m.min = root.left != null ? leftMinMax.min : root.data;
	  
	        m.max = root.right != null ? rightMinMax.max : root.data;
	   
	        return m;
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
		LorgestBSTInBinaryTree tree=new LorgestBSTInBinaryTree();
		LorgestBSTInBinaryTree.root = new Node(20);
		LorgestBSTInBinaryTree.root.left = new Node(8);
		LorgestBSTInBinaryTree.root.right = new Node(22);
		//tree.root.right.right = new Node(22);
		//tree.root.right.right.left = new Node(50);
		LorgestBSTInBinaryTree.root.left.left = new Node(4);
		//tree.root.left.left.left = new Node(40);
		LorgestBSTInBinaryTree.root.left.right = new Node(12);
		LorgestBSTInBinaryTree.root.left.right.left = new Node(10);
		LorgestBSTInBinaryTree.root.left.right.right = new Node(14);
		
		System.out.println("Tree is ");
		tree.inorderTraversal(root);
		System.out.println();
		
		System.out.println("Size of longest binary tree is "+tree.largestBST(root));
		//System.out.println(tree.size(root));

	}

}
