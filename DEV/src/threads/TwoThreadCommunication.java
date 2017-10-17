package threads;

import java.util.ArrayList;
import java.util.List;

public class TwoThreadCommunication
{

	public static void main(String[] args){
	
	List<Character> list = new ArrayList<Character>();
	for(int i=97 ; i<123; i++){
	list.add((char)i);
	}
	//System.out.println(list);
		Thread t1= new Thread(new thread1(list));
		Thread t2= new Thread(new thread2(list));
		
		t1.start();
		t2.start();
		

	}

}

class thread1 implements Runnable{
	List arr=null;
	private int index=0;
	private volatile boolean flag=false;
	thread1(List al){
		arr=al;
	}
	public void run(){
		while(!flag){
		synchronized(arr){
			System.out.println("even===="+arr.get(index));
		//	System.out.println(index);
			 index+=2;
			try{
				//if(index%2!=0){
				
				arr.notify();
				 arr.wait();
				//}
			}
			catch(InterruptedException ie){}
			if(index>arr.size()-2)
				flag=true;
			}
			
		}
		}
	}



class thread2 implements Runnable{
	List arr=null;
	private int index=1;
	private volatile boolean flag=false;
	thread2(List al){
		arr=al;
	}
	public void run(){
		while(!flag){
		synchronized(arr){
			System.out.println("odd===="+arr.get(index));
			//System.out.println(index);
			index+=2;
			try{
	            // if(index%2==0){
				 
	             arr.notify();
	             arr.wait();
	            // }
			}
			catch(InterruptedException ie){}
			

           
			
		}
		if(index>arr.size()-1)
			flag=true;
		}
	}
}
