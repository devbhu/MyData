package ArrayQuestions;

public class RotateMatrix
{
       private void leftRotateMatrix(int m[][],int n){
    
   		for (int i = 0; i < n / 2; i++)
   		{
    	for (int j = i; j < n-i-1; j++)
   			{
   				
   				int temp = m[i][j];

   				m[i][j] = m[j][n-1-i];

   				m[j][n-1-i] = m[n-1-i][n-1-j];

   				m[n-1-i][n-1-j] = m[n-1-j][i];

   				m[n-1-j][i] = temp;
       }
   		}
       }
       
	
   private void  rightRotateMatrix(int m[][],int n){
     
	   for (int i = 0; i < n / 2; i++)
  		{
   	for (int j = i; j < n-i-1; j++)
  			{
			int temp = m[i][j];

			m[i][j] = m[n-1-j][i];

			m[n-1-j][i] = m[n-1-i][n-1-j];

			m[n-1-i][n-1-j] = m[j][n-1-i];

			m[j][n-1-i] = temp;
			
  			}
  		}
    	   
       }
   
   
   
   void displayMatrix(int mat[][],int N)
	{
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
				System.out.print(mat[i][j]+"   ");

			System.out.println();
		}
		System.out.println();
	}
       
	public static void main(String[] args)
	{
		RotateMatrix rm = new RotateMatrix();
		int n=4;
	int mat[][] =
		{
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
		};
	
	int mat1[][] =
		{
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
		};
	System.out.println("Given Matrix is ");
	rm.displayMatrix(mat,n);
	
	rm.leftRotateMatrix(mat,n);
	System.out.println("90 degree left rotation of  Matrix is ");
	rm.displayMatrix(mat,n);
	
	
	rm.rightRotateMatrix(mat1, n);
	System.out.println("90 degree right rotation of  Matrix is ");
	rm.displayMatrix(mat1, n);

}
	}


