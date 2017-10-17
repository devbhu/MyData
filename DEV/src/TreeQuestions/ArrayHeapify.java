package TreeQuestions;

public class ArrayHeapify
{
  int a[];
     
  ArrayHeapify(int b[]){
	  a=b;
  }
   
  
  void printHeap(){
	  for(int i=1; i<=a.length-1;i++){
		  System.out.print(a[i]+",");
	  }
  }
  private void swap(int m,int n){
	  int temp= a[n];
	  a[n]=a[m];
	  a[m]=temp;
  }
  
  public void heapify(int j){
	  int l= a.length-j-1;
	  int temp = (int) Math.floor(l/2);
	  if(l%2==0)
	  {
		  if(a[temp]<a[temp*2])
		 swap(temp,temp*2);
		  temp--;
		 
	  }
	  
	  for(int i = temp; i>=1 ; i--){
		int curr=i;
		while(curr<=temp){
			 if(a[2*curr]>a[2*curr+1]  && a[2*curr]>a[curr]){
				swap(2*curr,curr);
				curr=2*curr;
			}
			else if(a[2*curr]<a[2*curr+1]  && a[2*curr+1]>a[curr]){
				swap(2*curr+1,curr);
				curr=2*curr+1;
			}
			else if(a[2*curr]==a[2*curr+1]  && a[2*curr]>a[curr]){
				swap(2*curr,curr);
				curr=2*curr;
			}
			else curr++;
		}
	  }
	  
	  }
	  
  private int[] heapSort(){
	  int arr[] = new int[a.length-1];
	  int j=0;
	  for(int i=a.length-1 ;i>=1;i--){
		  heapify(j);
		 // printHeap();
		//  System.out.println();
		  arr[j++]=a[1];
		  a[1]=a[i];
		 
	  }
	  return arr;
	  
  }
  
	public static void main(String[] args)
	{
		int h[]={0,5,3,17,10,84,19,6,22,9,4,-1,0,453};
		ArrayHeapify heap = new ArrayHeapify(h);
		heap.heapify(0);
		System.out.println("the heap tree is ");
		heap.printHeap();
		int temp[]=heap.heapSort();
		System.out.println();
		System.out.println("the sorted heap tree is ");
		for(int i=0;i<temp.length; i++)
		System.out.print(temp[i]+" ,");
	}

}
