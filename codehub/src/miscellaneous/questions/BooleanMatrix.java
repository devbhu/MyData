package miscellaneous.questions;

public class BooleanMatrix
{

	static int findRowNo(int m[][] ,int r,int c){
		int k=-1;
		for(int i=0,j=c-1;i<r && j>=0 ; ){
			if(m[i][j]==1){
				j--;
				k=i;
			}
			else if(m[i][j]==0){
				i++;
			}
		}
		return k;
	}
	public static void main(String[] args)
	{
		int m[][]={{1,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,1,1}};
		if(findRowNo(m,4,4)==-1)
			System.out.println("Matrix contain only 0's");
			else 
				System.out.println(findRowNo(m,4,4));	
		

	}

}
