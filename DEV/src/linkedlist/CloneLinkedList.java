package linkedlist;

import java.util.HashMap;
import java.util.Map;

class ListNode{
	int d;
	ListNode next;
	ListNode random;
	ListNode(int d){
		this.d= d;
		next=null;
		random=null;
	}
}
public class CloneLinkedList
{
	// cloning linked list with two pointers next an arbitrary
	private static ListNode cloneListWithTwoPointer(ListNode start){
		
		Map<ListNode,ListNode> m = new HashMap<ListNode, ListNode>();
		ListNode orgiCurr=start;
		ListNode cloneCurr=null;
		while(orgiCurr!=null)
		{
			cloneCurr= new ListNode(orgiCurr.d);
			m.put(orgiCurr, cloneCurr);
			orgiCurr=orgiCurr.next;
		}
		orgiCurr=start;
		while(orgiCurr!=null){
			 cloneCurr = m.get(orgiCurr);
			cloneCurr.next=m.get(orgiCurr.next);
			cloneCurr.random=m.get(orgiCurr.random);
			orgiCurr=orgiCurr.next;
		}
		return m.get(start);
	}
	
	static void print(ListNode head)
    {
        ListNode temp = head;
        while (temp != null)
        {
            ListNode random = temp.random;
            int randomData = (random != null)? random.d: -1;
            System.out.println("Data = " + temp.d +
                               ", Random data = "+ randomData);
            temp = temp.next;
        }
    }
/*	
	// cloning linked list with single pointer next
	private static Node cloneList(Node start){
		if(start==null)
			return start;
		Node ptr,prev,head ;
		head = new Node(start.d);
		prev=head;
		ptr=start.next;
		//System.out.println("check");
         while (ptr!=null){
			Node tmp= new Node (ptr.d);
			prev.next=tmp;
			prev=tmp;
		//	System.out.println("check loop");
			ptr=ptr.next;
			tmp=null;
		}
		return head;
	}

	private static void printList(Node node) {
	       while (node != null) {
	           System.out.print(node.d + " ");
	           node = node.next;
	       }
	      
	   }*/
	
	public static void main(String[] args)
	{
		ListNode head=null;
		ListNode head1=new ListNode(1);
		head1.next=new ListNode(2);
		head1.next.next=new ListNode(3);
		head1.next.next.next=new ListNode(4);
		head1.next.next.next.next=new ListNode(8);
		head1.next.next.next.next.next=new ListNode(9);
		head1.next.next.next.next.next.next=new ListNode(10);
		head1.next.next.next.next.next.next.next=new ListNode(0);
		
		head1.random=head1.next.next;
		head1.next.next.random=head1.next.next.next.next;
		head1.next.next.next.next.random=head1.next.next.next.next.next.next.next;
		head1.next.next.next.next.next.next.next.random=head1.next.next.next.next.next.next;
		head1.next.next.next.next.next.next.random=head1.next.next.next.next.next;
		head1.next.random=head1.next.next.next;
		
		print(head1);
		System.out.println();
		head = cloneListWithTwoPointer(head1);
		print(head);
		

	}

}
