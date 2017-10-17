// Java program for reversing the linked list
 class Node
	{

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}
class LinkedList
{

	 Node head;

 

	/* Function to reverse the linked list */
	Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	private void addAtBegining(int i)
	{
		head = new Node(i);
		// return head;
	}

	private void createLinkedList(int i)
	{
		Node ptr = head;
		while (ptr.next!= null)
		{
			ptr = ptr.next;
		}
		
		Node temp=new Node(i);
		ptr.next=temp;
		
       
	}

	// prints content of double linked list
	void printList(Node node)
	{
		while (node != null)
		{
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();

		/*LinkedList.head = new Node(85);
		LinkedList.head.next = new Node(15);
		LinkedList.head.next.next = new Node(4);
		LinkedList.head.next.next.next = new Node(20);*/
		for(int i =1 ; i<= 50 ; i++){
			if(i==1)
				list.addAtBegining(i);
			else
				list.createLinkedList(i);
		}

		System.out.println("Original Linked list is :");
		list.printList(list.head);
		list.head = list.reverse(list.head);
		System.out.println("");
		System.out.println("Reversed linked list : ");
		list.printList(list.head);
	}
}