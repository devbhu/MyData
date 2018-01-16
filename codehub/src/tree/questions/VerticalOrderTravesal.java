package tree.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VerticalOrderTravesal
{
	Node root;
	Map<Integer,List<Integer> > map;	
	List<Integer> list;
	
	
	
	private void verticalOder(Node root,int hd, Map<Integer,List<Integer> > m,List<Integer> list ){
		if(root==null)
			return;
		
		list.add(root.data);
		map.put(hd,list);
		verticalOder(root.left,hd-1,m,list);
		verticalOder(root.right,hd+1,m,list);
		}
		
	private void  printVerticalOrder(Node root){
		int hd=1;
		verticalOder(root,hd,map,list);
		
		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            List<Integer> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "n");
        }
		
	}
	
	
	public static void main (String arg[]){
		VerticalOrderTravesal v= new VerticalOrderTravesal();
		
		Node root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(17);
		root.right.right = new Node(25);
		root.left.left.left = new Node(6);
		v.printVerticalOrder(root);
	}
}

