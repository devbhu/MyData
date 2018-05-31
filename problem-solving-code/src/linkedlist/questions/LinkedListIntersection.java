package linkedlist.questions;

import java.util.HashSet;

//import LinkedList.Node;

class Node{
	int d;
	Node next;
	public Node(int d)
	{
		//super();
		this.d = d;
		this.next = null;
	}
	
}
public class LinkedListIntersection
{
   
	Node getIntersection(Node root1,Node root2){
		if(root1==null || root2==null)
			return null;
		HashSet<Node> hs=new HashSet<Node>();
		while(root1!=null){
			hs.add(root1);
			root1=root1.next;
		}
		
		while(root2!=null){
			if(hs.contains(root2))
				return root2;
			else
			root2=root2.next;
			//return null;
		}
		
		return null;
		
		
		
	}
	
	 void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.d + " ");
	            node = node.next;
	        }
	        System.out.println();
	    }
	public static void main(String[] args)
	{
		LinkedListIntersection li=new LinkedListIntersection();
		Node head1=new Node(1);
		Node head2=new Node(5);
		head1.next=new Node(2);
		head1.next.next=new Node(3);
		head1.next.next.next=new Node(4);
		head1.next.next.next.next=new Node(8);
		head1.next.next.next.next.next=new Node(9);
		head1.next.next.next.next.next.next=new Node(10);
		head2.next=new Node(6);
		head2.next.next=new Node(7);
		head2.next.next.next=head1.next.next.next.next;
		System.out.println("first linked list is");
		li.printList(head1);
		System.out.println("second linked list is");
		li.printList(head2);
		if(li.getIntersection(head1, head2)!=null)
		System.out.println("Intersection of Node value is:"+li.getIntersection(head1, head2).d);
		else
			System.out.println("There is no intersection between both points");
	}

}
