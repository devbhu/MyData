package temp;

public class MaxDiffInArray {

	public static void main(String[] args) {
		int res,maxDiff,p,q,j,i;
		boolean b=false;
		res=maxDiff=p=q=0;
		int a[]={7, 9, 5, 6, 3, 20};
		j=a.length-1;
		i=0;
		for(i=0;i<=j;i++)
		{
			for(int k=i;k<=j;k++){
				if(a[k]>a[i])
				{
					res=a[k]-a[i];
					
					
					//System.out.println(i);
				}
				if(res>maxDiff){
					maxDiff=res;
					p=i;
					q=k;
					b=true;
				
			}
				
				}

	}
		if(b)
			System.out.println("Max Diff=  "  +maxDiff+"   j="+q+"   i="+p);
			else
				System.out.println("Soorry there is no such pair");
	}
}


