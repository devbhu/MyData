package dynamicprogramming;

public class MaximumSizeSquareSubMatrixWithAll1s {
	
		
		 int  maxSizeSubSquareSOfAll1(int M[][],int R ,int C){
			 int i,j;
			  int S[][] = new int[R][C];
			  int max_of_s, max_i, max_j; 
			  
			  /* Set first column of S[][]*/
			  for(i = 0; i < R; i++)
			     S[i][0] = M[i][0];
			  
			  /* Set first row of S[][]*/    
			  for(j = 0; j < C; j++)
			     S[0][j] = M[0][j];
			      
			  /* Construct other entries of S[][]*/
			  for(i = 1; i < R; i++)
			  {
			    for(j = 1; j < C; j++)
			    {
			      if(M[i][j] == 1) {
			        S[i][j] = Math.min(S[i][j-1], S[i-1][j]);
			      if( S[i][j] <  S[i-1][j-1])
			    	  S[i][j] += 1;
			      else 
			    	  S[i][j] = S[i-1][j-1] + 1;
			      }
			      else
			        S[i][j] = 0;
			    }    
			  } 
			   
			  /* Find the maximum entry, and indexes of maximum entry 
			     in S[][] */
			  max_of_s = S[0][0]; max_i = 0; max_j = 0;
			  for(i = 0; i < R; i++)
			  {
			    for(j = 0; j < C; j++)
			    {
			      if(max_of_s < S[i][j])
			      {
			         max_of_s = S[i][j];
			         max_i = i; 
			         max_j = j;
			      }        
			    }                 
			  }     
			  System.out.println(" Maximum size sub-matrix is: ");
			  printMatrix(M ,max_of_s ,max_i ,max_j);
			 
			  return max_of_s;
			}     
			 
		void printMatrix(int M[][] ,int max_of_s ,int max_i ,int max_j){
			 for(int i = max_i; i > max_i - max_of_s; i--)
			  {
			    for(int j = max_j; j > max_j - max_of_s; j--)
			    {
			      System.out.print(M[i][j]+"   ");
			    }  
			    System.out.println();
			  }  
		}
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSizeSquareSubMatrixWithAll1s m = new MaximumSizeSquareSubMatrixWithAll1s();
		int matrix[][] ={{1,1,1,1},{1,1,1,1},{1,1,1,1},{0,1,1,1}};
		int r = m.maxSizeSubSquareSOfAll1(matrix,4,4);
		  System.out.println("no of rows in largest sub square matrix is   :" +r);
	}

}
