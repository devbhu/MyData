package temp;

import java.io.*;
public class ArrayMaxSum {

	public static void main(String[] args) throws IOException {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// int a[] =new int[6];
		 System.out.println("please enter integers");
		/* for(int i=0;i<6;i++)
		 {
			 a[i]=Integer.parseInt(br.readLine());
		 } */
		int a[]={1,2,5,-7,2,5};
		 int max,res,count,k,maxEnd;
		 max=res=0;
		 count=maxEnd=k=-1;
		 
		 for(int i=0;i<6;i++){
			 if(a[i]>=0)
			 { 
				 if(count<0)
				 {
					 count=i;
				 }
				 res=res+a[i];
				 if(res>max)
				 {
					 
					 max=res;
					 k=count;
					 
				 }
				 
			 }
			 else
				 {
				 if(count>0 )
			 {
				maxEnd=i;
			 }
				 res=0;
				 count=-1;
		 }
		 }
		 if(a[5]>0 )
			 maxEnd=6;
		 System.out.println(" count="+count);
		 System.out.println("k="+maxEnd);
		 System.out.print(" the largest subset having max sum is {");
		 for(int i=k; i<maxEnd ;i++){
			 System.out.print(a[i]+",");
			 
		 }
		 System.out.print(" }");
		// TODO Auto-generated method stub

	}

}
