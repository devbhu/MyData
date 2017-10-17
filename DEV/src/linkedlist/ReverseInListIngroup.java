package linkedlist;

public class ReverseInListIngroup
{
   Node reverse(Node head,int k){
	   Node prev,forward =null,curr;
	   prev=null;
	   curr=head;
	   for(int i = 0 ; i<k;i++){
		   
		   forward=curr.next;
		   curr.next=prev;
		   prev=curr;
		   curr=forward;
		   if(forward==null)
			   break;
	   }
	   
	   if(forward!=null){
		   head.next=reverse(curr,k);
	   }
	   return prev;
	   
   }
   
   void printList(Node node) {
       while (node != null) {
           System.out.print(node.d + " ");
           node = node.next;
       }
      
   }
	
	public static void main(String[] args)
	{
		ReverseInListIngroup rev=new ReverseInListIngroup();
		int k=3;
		Node head=null;
		Node head1=new Node(1);
		head1.next=new Node(2);
		head1.next.next=new Node(3);
		head1.next.next.next=new Node(4);
		head1.next.next.next.next=new Node(8);
		head1.next.next.next.next.next=new Node(9);
		head1.next.next.next.next.next.next=new Node(10);
		head1.next.next.next.next.next.next.next=new Node(0);
		rev.printList(head1);
		
		head=rev.reverse(head1, k);
		System.out.println("dev");
		
		System.out.println();
		rev.printList(head);
	}

}
