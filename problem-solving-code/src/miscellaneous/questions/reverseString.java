package miscellaneous.questions;

public class reverseString {
	
	String reverse1(String s){
		if(s==null || s.isEmpty())
			return s;
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		return rev;
		
	}

	public static void main(String[] args) {
		reverseString b=new reverseString();
		
		String s="devmani singh";
		//String rev=new StringBuffer(s).reverse().toString();
		//String rev="";
//		char str[]=s.toArray();
		System.out.println(b.reverse1(s));
		
		// TODO Auto-generated method stub

	}

}
