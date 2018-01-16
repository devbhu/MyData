//package ArrayQuestions;

import java.util.*;

public class EquqlStacks {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int i,j,k,a,b,c,res;
        boolean flag=false;
        i=j=k=a=b=c=res=0;
        int h1[] = new int[n1];
        for(int h1_i=n1-1; h1_i >=0; h1_i--){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=n2-1; h2_i >= 0; h2_i--){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=n3-1; h3_i >= 0; h3_i--){
            h3[h3_i] = in.nextInt();
        }
            a=h1[i];
            b=h2[j];
            c=h3[k];
        while(i<n1 && j<n2 && k<n3){
            
            if(a==b && b==c){
                  res=a;
                flag=true;
                i++;
                j++;
                k++;
                if(i<n1 && j<n2 && k<n3){
                 a=a+h1[i];
                 b=b+h2[j];
                 c=c+h3[k];
                  
            }
            }
          else if((a<b && b<c)|| (a>b && a<c))
                {
                 i++;
                j++;
                if(i<n1 && j<n2){
                a=a+h1[i];
                b=b+h2[j];
                   // System.out.println(a+"- "+b+"- "+c);
                }
            }
            else if((a<c && c<b) || (c<a && a<b))
                {
                i++; k++;
                if(i<n1 && k<n3){
                 a=a+h1[i];
                c=c+h3[k];
                }
            }
            else if((a>b && b>c) || (a>c && c>b))
                {
                j++; k++;
                if(j<n2 && k<n3){
                b=b+h2[j];
                c=c+h3[k];
                }
            }
            else if(a==b && a>c )
                {
                k++;
                if(k<n3)
                c=c+h3[k];
            }
            else if(a==b && a<c )
            {
                i++; j++;
            	if(i<n1 && j<n2){
                a=a+h1[i];
                b=b+h2[j];
                }
            }
            else if(b==c && b>a)
                {
                i++;
                if(i<n1)
                a=a+h1[i];
            }
            else if(b==c && b<a)
            {
                j++; k++;
                if(j<n2 && k<n3){
                b=b+h2[j];
                c=c+h3[k];
                }
            }
            else if(a==c && a>b)
                {
                j++;
                if(j<n2)
                b=b+h2[j];
            }
            else if(a==c && a<b)
            {
            	i++; k++;
                if(i<n1 && k<n3){
                 a=a+h1[i];
                c=c+h3[k];
        
        }
       
            
    }
       
            
    }
         if(flag)
            System.out.println(res);
        else
            System.out.println(0);
}
    }

