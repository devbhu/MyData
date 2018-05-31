package temp;

import java.io.*;
class StringInfo
{
 static String n;
 static int l;
 public static void main(String args[]) throws IOException
 {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 // Read the String
 System.out.print("Enter a String : ");
 n = br.readLine();
 l = n.length();
 find();
 }
 public static void find()
 {
 int a=0,b=0,c=0,d=0,e=0;
 char ch;
 for(int i=0;i<l;i++)
 {
  ch = n.charAt(i);
  if(ch>='A' && ch<='Z') // Condition for Uppercase letters
  a++;
  if(ch>='a' && ch <='z')
  b++;
  if(ch>='0' && ch<='9')
  c++;
  if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
  ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
  d++;
  if(ch==' ') // Condition for spaces
  e++;
        }
 System.out.println("\nNo. of Uppercase letters = " +a);
 System.out.println("\nNo.of Lowercase letters = " +b);
 System.out.println("\nNo. of Numerals = " +c);
 System.out.println("\nNo. of Vowels = " +d);
 System.out.println("\nNo. of Spaces = " +e);
 System.out.println("\nNo. of Special Characters = "+(l-(a+b+c+e)));
 }
}