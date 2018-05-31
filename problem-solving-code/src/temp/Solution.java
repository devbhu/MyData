package temp;

import java.util.*;

public class Solution {

    
    public void decentString(int n){
        int a3,b5;
        boolean flag=false;
        a3=-1;
        b5=-1;
        if(n>=3){
        if(n%3==0){
            for(int i=0;i<n;i++)
                System.out.print("5");
                 System.out.println();
        }
        
    else{
        b5=(n/3)*(n/3);
        a3=n%3;
        while(b5>=3 ){
            if(b5%3==0 && a3%5==0){
                for(int i=0;i<b5;i++)
                System.out.print("5");
            for(int j=0;j<a3;j++)
                System.out.print("3");
            System.out.println();
                flag =true;
                break;
            }
            b5=b5-3;
            a3=a3+3;
            
        }
    
        if(b5==1)
            System.out.println("33333");
        }
            
    }
        else if(n<3 || flag==false)
            System.out.println("-1");
            
        
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            sol.decentString(n);
        }
    }
        
}
