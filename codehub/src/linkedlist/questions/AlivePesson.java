package linkedlist.questions;

public class AlivePesson
{

	/**
	 * @param args
	 */
	 Node addToEmpty(Node last,int i){
		Node temp = new Node(i);
		last = temp;
		last.next=temp;
		return last;
	}
	 
	 Node addToEnd(Node last,int i){
		 Node temp = new Node(i);
		 temp.next=last.next;
		 last.next=temp;
		 last=temp;
		 return last;
	 }
	 
	Node insert(Node last){
		last=addToEmpty(last,1);
		for(int i=2; i <= 100;i++)
			last=addToEnd(last,i);
		return last;
		
		
	}
	
	void display(Node last){
		Node p=last.next;
		do{
			System.out.print(p.d+"  ");
			p=p.next;
		}while(p!=last.next);
		
	}
	
	int alivePersonNo(Node last){
		Node temp,temp1,curr,forward;
		forward=null;
		temp1=null;
		curr=last;
		temp=curr.next;
		while(curr.next!=curr){
			forward=curr.next.next;
			curr.next=temp.next;
					temp=null;
			
			
			
			
			
		}
		return 5;
		
	}
	public static void main(String arg[])
	{
		// TODO Auto-generated method stub
		Node last=null;
		AlivePesson ap=new AlivePesson();
		
			last=ap.insert(last);
			
		ap.display(last);

	}

}
