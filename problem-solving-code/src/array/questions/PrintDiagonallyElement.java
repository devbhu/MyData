package array.questions;

import java.util.Scanner;

public class PrintDiagonallyElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubint 
		Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter number of rows and column ");
		 
		int row=sc.nextInt();
		int col=sc.nextInt();
		int i=0;
		int a[][]=new int[row][col];
		 System.out.println("Enter Matrix Element");
		for( i=0;i<row;i++){
		      for(int j=0;j<col;j++ ){
		    	a[i][j]=sc.nextInt();
		      }
		      System.out.println();
		      }
		 System.out.println("orginal Matrix");
		for( i=0;i<row;i++){
	      for(int j=0;j<col;j++ ){
	    	  System.out.print(a[i][j]+"  ");
	      }
	      System.out.println();
	      }
		
      for( i=0;i<row;i++){
    	   int c=0;
      for(int j=i;j>=0; ){
    	  System.out.print(a[j][c]+"  ");
    	  j=j-1;
    	  c=c+1;
    	   
      }
      System.out.println();
    	  
	}
      if(i==row){
    	  for(i=row-1;i>=0;i--){
    		  int c=col-i;
    		  int r=row-1;
    		  for(int j=i;j>=1;j--){
    			  System.out.print(a[r][c]+"  ");
    	    	  r=r-1;
    	    	  c=c+1;
    		  }
    		  System.out.println();
    	  }
      }
	}

}
