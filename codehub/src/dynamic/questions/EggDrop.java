package dynamic.questions;

public class EggDrop {
	
	
	static int eggDropCount(int n, int k)
	{
	    // If there are no floors, then no trials needed. OR if there is
	    // one floor, one trial needed.
	    if (k == 1 || k == 0)
	        return k;
	 
	    // We need k trials for one egg and k floors
	    if (n == 1)
	        return k;
	 
	    int min = Integer.MAX_VALUE , x, res;
	 
	    // Consider all droppings from 1st floor to kth floor and
	    // return the minimum of these values plus 1.
	    for (x = 1; x <= k; x++)
	    {
	        res =1+ Math.max(eggDropCount(n-1, x-1), eggDropCount(n, k-x));
	        if (res < min)
	            min = res;
	    }
	 
	    return min;
	}
	
	// Bottom up dynamic approach 
	static int findMinAttempt(int egg,int floor){
		int c=0;
		int T[][]=new int[egg+1][floor+1];
		for(int j=1 ; j<=floor ; j++)
			T[1][j] =j;
		for(int i=2 ; i<=egg ; i++)
		{
			for(int j=1 ; j<=floor ; j++)
			{   
				T[i][j] = Integer.MAX_VALUE;
				for(int k =1 ; k <= j ; k++)
				{
					c = 1 + Math.max(T[i-1][k-1],T[i][j-k]);
					if(c<T[i][j])
						T[i][j]=c;

				}
			}
		}
		printLCSMatrix(T,egg,floor);
		return T[egg][floor];
	}

	static  void printLCSMatrix (int T[][] ,int x, int y){

		for( int i=0; i <= x ; i++) {
			for( int j =0; j<=y; j++) {
				System.out.print(T[i][j]+ "   ");
			}
			System.out.println();
		}    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("minimum no of attempts "+EggDrop.findMinAttempt(2,6));
		System.out.println("minimum no of attempts "+EggDrop.eggDropCount(2,6));
	}

}
