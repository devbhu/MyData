package temp;

public class LoopPattern
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int n=10;
		int i,j,k;
		i=j=k=0;
		boolean b=true;
		char a[][] = new char[n][n];
        for(i=0;i<=n/2;i++){
        	if(b){
        		for(j=0;j<i+1;j++)
        			a[i][j]='*';
        		for(k=j;k<n;k++)
        			a[i][k]='#';
        		b=false;
        	}
        	else{
        		for(j=0;j<n-i-1;j++)
        			a[i][j]='#';
        		for(k=j;k<n;k++)
        			a[i][k]='*';
        		b=true;
        	}
        }
        for(k=i;k<n;k++){
        	for(j=0 ; j<n ; j++){
        	//	System.out.println("dev");
        		if(n%2==0)
        		a[k][j]=a[n-k][j];
        		else
        			a[k][j]=a[n-k-1][j];	
        	}
        }
        for(i=0;i<n;i++){
        	for(j=0;j<n;j++){
        		System.out.print(a[i][j]);
        	}
        	System.out.println();
        }
	}

}
