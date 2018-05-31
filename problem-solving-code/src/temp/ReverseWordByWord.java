package temp;

import java.io.*;
public class ReverseWordByWord {
	String reverse1(String s){
		if(s==null || s.isEmpty())
			return s;
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		return rev;
		
	}
    public static void main(String args[]) throws IOException {
    	 System.out.println("please enter String  ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ReverseWordByWord b=new ReverseWordByWord();
        String input = br.readLine();
        String temp=b.reverse1(input);
        String[] words = temp.split(" ");
        String reverse = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse += words[i].charAt(j);
               
            }
            words[i]=reverse;
           // System.out.print(reverse + " ");
            reverse = "";
        }
        for (int i = 0; i < words.length; i++) {
        	 System.out.print(words[i]+"  ");
        }
    }
}