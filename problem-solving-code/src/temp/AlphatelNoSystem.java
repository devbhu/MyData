package temp;
/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class AlphatelNoSystem {
   public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       String i=sc.next();
       String i1=sc.next();
      // System.out.println(i+"---"+i1);
         StringBuilder sumstring = new StringBuilder();
         int carry=0;
       Map <String, Integer> m=new HashMap<String ,Integer>();
       m.put("M",0); m.put("L",1); m.put("K",2); m.put("J",3);
        m.put("I",4); m.put("H",5); m.put("G",6); m.put("F",7);
        m.put("E",8); m.put("D",9); m.put("C",10); m.put("B",11);
       m.put("A",12); m.put("N",13); m.put("O",14); m.put("P",15);
       m.put("Q",16); m.put("R",17); m.put("S",18); m.put("T",19);
       m.put("U",20); m.put("V",21); m.put("W",22); m.put("X",23);
       m.put("Y",24); m.put("Z",25);
      //  System.out.println(m);     
       Map <Integer, String> m1=new HashMap<Integer, String>();
          
       for(Map.Entry<String,Integer> entry : m.entrySet()){
           m1.put(entry.getValue(),entry.getKey());
       }
     //  System.out.println(m1);
       int l=i.length();
       int l1=i1.length();
       StringBuilder t1 = new StringBuilder(i);
       t1=t1.reverse();
        StringBuilder t2 = new StringBuilder(i1);
      t2= t2.reverse();
      // System.out.println(t1+"---"+t2);
      //  System.out.println(l+"---"+l1);
      if(l<=l1){
         // System.out.println("dev");
          for(int j =0 ;j<l;j++){
             // System.out.println(m.get(String.valueOf(t1.charAt(j)))+"---"+m.get(t1.charAt(j)));
              int sum = m.get(String.valueOf(t1.charAt(j)))+m.get(String.valueOf(t2.charAt(j)));
             // System.out.println(sum+ "dev");
              int div = sum/26;
              int rem=sum%26 +carry;
             // System.out.println("dev");
            sumstring.append(m1.get(rem));
             if(div>=1)
             carry=1;
             else
             carry=0;
          }
          for(int j=l;j<l1;j++){
              int sum=m.get(String.valueOf(t2.charAt(j)));
              int div = sum/26;
              int rem=sum%26 +carry;
             sumstring.append(m1.get(rem));
             if(div>=1)
             carry=1;
             else
             carry=0;
          }
      }
      else if(l>l1){
          for(int j =0 ;j<l1;j++){
              int sum = m.get(String.valueOf(t1.charAt(j)))+m.get(String.valueOf(t2.charAt(j)));
              int div = sum/26;
              int rem=sum%26 +carry;
             sumstring.append(m1.get(rem));
             if(div>=1)
             carry=1;
             else
             carry=0;
          }
          for(int j=l1;j<l;j++){
              int sum=m.get(String.valueOf(t1.charAt(j)));
              int div = sum/26;
              int rem=sum%26 +carry;
             sumstring.append(m1.get(rem));
             if(div>=1)
             carry=1;
             else
             carry=0;
          }
          
      }
      sumstring=sumstring.reverse();
      System.out.println(sumstring);
      
       
       

	//Write code here

   }
}
