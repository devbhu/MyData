 class Node1 {
	 
	        int data;
	        Node1 next;
	 
	        Node1(int d) {
	            data = d;
	            next = null;
	        }
	    }
	 

public class ReverseLinkedList {
	static Node1 head;
	Node1 reverse(Node1 node) {
        Node1 prev = null;
        Node1 current = node;
        Node1 next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
	
	
	 int detectAndRemoveLoop(Node1 node) {
	        Node1 slow = node, fast = node;
	        while (slow != null && fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	 
	            // If slow and fast meet at same point then loop is present
	            if (slow == fast) {
	                removeLoop(slow, node);
	                return 1;
	            }
	        }
	        return 0;
	    }
	 
	    // Function to remove loop
	    void removeLoop(Node1 loop, Node1 curr) {
	        Node1 ptr1 = null, ptr2 = null;
	 
	        /* Set a pointer to the beging of the Linked List and
	         move it one by one to find the first node which is
	         part of the Linked List */
	        ptr1 = curr;
	        while (1 == 1) {
	 
	            /* Now start a pointer from loop_node and check if it ever
	             reaches ptr2 */
	            ptr2 = loop;
	            while (ptr2.next != loop && ptr2.next != ptr1) {
	                ptr2 = ptr2.next;
	            }
	 
	            /* If ptr2 reahced ptr1 then there is a loop. So break the
	             loop */
	            if (ptr2.next == ptr1) {
	                break;
	            }
	 
	            /* If ptr2 did't reach ptr1 then try the next node after ptr1 */
	            ptr1 = ptr1.next;
	        }
	 
	        /* After the end of loop ptr2 is the last node of the loop. So
	         make next of ptr2 as NULL */
	        ptr2.next = null;
	    }
	
	   /* void printList(Node1 node) {
	    	Node1 p=node;
	        do {
	            System.out.print(p.data + " ");
	            p = p.next;
	        }while(p!=node);
	    }*/
	    void printList(Node1 node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
	    public static void main(String[] args) {
	    	ReverseLinkedList list = new ReverseLinkedList();
	        ReverseLinkedList.head = new Node1(85);
	        ReverseLinkedList.head.next = new Node1(15);
	        ReverseLinkedList.head.next.next = new Node1(4);
	        ReverseLinkedList.head.next.next.next = new Node1(20);
		ReverseLinkedList.head.next.next.next.next = new Node1(2);
	        ReverseLinkedList.head.next.next.next.next.next=head.next.next;
	         
	        //System.out.println("Original Linked list is :");
	       // list.printList(head);
	       // head = list.reverse(head);
	       // System.out.println("");
	        //System.out.println("Reversed linked list : ");
	        //list.printList(head);
	        
	       // head.next.next.next.next.next = head.next.next;
	        int i=list.detectAndRemoveLoop(head);
	        if(i==1)
	        	System.out.println("loop is detected: ");
	        	 System.out.println("Linked List after removing loop : ");
	        list.printList(head);
	    }
	}

