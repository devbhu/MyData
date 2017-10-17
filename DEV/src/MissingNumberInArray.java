
public class MissingNumberInArray {
	int getMissingNo (int a[], int n)
	{
	    int i, total;
	    total  = (n+1)*(n+2)/2;   
	    for ( i = 0; i< n; i++)
	       total -= a[i];
	    return total;
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumberInArray obj= new MissingNumberInArray();
	
		    int a[] = {1,2,4,5,3};
		    int miss = obj.getMissingNo(a,5);
		    System.out.println("missing number="+miss);
		}

	}


