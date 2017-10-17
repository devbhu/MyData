package dynamicprogramming;

public class LongestCommonSubSequence {
	
	
	static int lcs( String X, String Y, int m, int n )
	{
	   if (m == 0 || n == 0)
	     return 0;
	   if (X.charAt(m-1) == Y.charAt(n-1))
	     return 1 + lcs(X, Y, m-1, n-1);
	   else
	     return Math.max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
	}
	
    // Bottom up dynamic approach
	static int findLCS(String x,String y ){
	    //initialize
	    
	  // int k =0;
	    int LCS[][] =new int[x.length()+1][y.length()+1];
	    for (int i=0; i <=x.length(); i++)
	        LCS[i][0]=0;     
	    for (int j=0; j <=y.length(); j++)
	        LCS[0][j]=0;
	    
	    for( int i=1; i <= x.length(); i++) {
	         for( int j =1; j<=y.length(); j++) {
	              if(x.charAt(i-1) == y.charAt(j-1)) {
	                        
	                        LCS[i][j] = 1 + LCS[i-1][j-1];
	                       // System.out.println("dev");
	                        
	              }
	              else {
	                   LCS[i][j] = Math.max(LCS[i-1][j],LCS[i][j-1]);
	              }
	         }
	    }    
	    printLCSMatrix(LCS,x,y);
	   return LCS[x.length()][y.length()] ;              
	}
static  void printLCSMatrix (int LCS[][],String x, String y){

    for( int i=0; i <= x.length(); i++) {
         for( int j =0; j<=y.length(); j++) {
        	 System.out.print(LCS[i][j]+ "   ");
         }
         System.out.println();
    }    
}
	public static void main(String[] args) {
		String s1="AXYT";
		String s2="AYZX";
		System.out.println("Longest Common SubSequence "+LongestCommonSubSequence.findLCS(s1,s2));
		System.out.println("Longest Common SubSequence "+LongestCommonSubSequence.lcs(s1,s2,s1.length(),s2.length()));
	}

}
