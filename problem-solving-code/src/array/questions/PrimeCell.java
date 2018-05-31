package array.questions;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
*/
import java.util.*;

abstract class p{
	p(){
		
	}
	
}
class PrimeCell{
    private static boolean testPrime(int n){
        boolean flag=false;
        
        for(int i=2 ; i<Math.sqrt(n);i++){
            if(n%i==0){
                flag = true;
                break;
            }
            
        }
        if(flag)
        return false;
        else
        return true;
    }
    public static void main(String args[] ) throws Exception {

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int count = 0;
        int sum=0;
        int a[][] = new int[N][N];
         for (int i = 0; i < N; i++) {
              for (int j = 0; j < N; j++) {
                a[i][j]=s.nextInt();
                }
        }
         sum+=a[0][1]+a[1][0];
        if(testPrime(sum))
        count++;
        sum=0;
        sum = a[0][N-2]+a[1][N-1];
        if(testPrime(sum))
        count++;
        sum=0;
        sum = a[N-2][0]+a[N-1][1];
        if(testPrime(sum))
        count++;
        sum=0;
        sum = a[N-2][N-1]+a[N-1][N-2];
        if(testPrime(sum))
        count++;
        sum=0;
        for(int j=1;j<=N-2 ; j++){
            sum=0;
            System.out.println("1");
            sum+=a[0][j-1]+a[0][j+1]+a[1][j];
            if(testPrime(sum))
        count++;
        sum=0;
        }
        
        for(int i=1;i<=N-2 ; i++){
            sum=0;
            System.out.println("2");
            sum+=a[i-1][0]+a[i+1][0]+a[i][1];
            if(testPrime(sum))
        count++;
       // sum=0;
        }
        for(int i=1;i<=N-2 ; i++){
            sum=0;
            sum+=a[i][N-2]+a[i-1][N-1]+a[i+1][N-1];
            if(testPrime(sum))
        count++;
       // sum=0;
        }
        for(int j=1;j<=N-2 ; j++){
            sum=0;
            sum+=a[N-1][j-1]+a[N-2][j]+a[N-1][j+1];
            if(testPrime(sum))
        count++;
        //sum=0;
        }
   // int left,right,top,bottom;
   // left=right=top=bottom=0;
       for (int i = 1; i <=N-2; i++) {
              for (int j = 1; j <= N-2; j++) {
                  sum=0;
                  System.out.println("de");
                     sum+=a[i-1][j]+a[i][j-1]+a[i][j+1] +a[i+1][j];
                     System.out.println(sum);
                        if(testPrime(sum))
                        count++;
                   
                 
              //  grid[i][j]=s.nextInt();
                }
        }
      
    

        System.out.println(count);
    }
}

