package linkedlist.questions;

// { Driver Code Starts


import java.util.*;
import java.io.*;


class ReverseLL {
    // This function should reverse linked list and return
    // head of the modified linked list.

    static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.d + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            ReverseLL g = new ReverseLL();
            head = g.reverseList(head);
            printList(head);
            t--;
        }
    }
    Node reverseList(Node head) {
        if (head == null)
            return null;
        Node curr = head;
        Node f = head.next;
        Node p = null;
        while (curr.next!=null) {
            curr.next = p;
            p = curr;
            curr = f;
            f = curr.next;

        }
        curr.next=p;
        return curr;

    }

}



