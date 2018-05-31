package temp;

public class MissingGPTerm {

	/**
	 * @param args
	 */
	int  findMissing(int a[],int l,int h,int r){
		if(h<=l)
		{
			return Integer.MAX_VALUE;
		}
		int mid=(h+l)/2;
		if(a[mid]*r!=a[mid+1]){
			return (a[mid]*r);
		}
		if(mid>0 && a[mid-1]*r!=a[mid]){
			return (a[mid-1]*r);
		}
		if(a[mid]==a[0]*mid*r){
			return findMissing(a,mid+1,h,r);
		}
		else
		return findMissing(a,l,mid-1,r);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingGPTerm m=new MissingGPTerm();
		int arr[] = {1,3,9,81};
	    int n = arr.length;
	    if(m.findMissing(arr,0,n-1,2)==Integer.MAX_VALUE)
	    	System.out.println("Sorry no missing element ");
	    else
	    System.out.println("The missing element is "+m.findMissing(arr,0,n-1,3));
	}

}
