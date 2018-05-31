package dynamic.questions;

public class CountNoEncodingOfDigitString
{

	// Recursive approach
	int countEncoding(String s)
	{
		int len = s.length();
		int count = 0;
		if (len == 1 || len == 0)
			return 1;

		if (s.charAt(len - 1) > '0')
			count = countEncoding(s.substring(0, len - 1));
		if (s.charAt(len - 2) < '2'
				|| (s.charAt(len - 2) == '2' && s.charAt(len - 1) < '7'))
			count += countEncoding(s.substring(0, len - 2));
		return count;

	}

	// Dynamic approach

	int dynamicCountEncoding(String s){
		int len = s.length();
		int t[] =new int[len+1];
		t[0]=0;
		t[1]=1;
		for(int i=2;i<=len;i++){
			if (s.charAt(i-1) > '0')
				t[i]=t[i-1];
			if (s.charAt(i - 2) < '2' || (s.charAt(i- 2) == '2' && s.charAt(i-1) < '7'))
				t[i]=t[i]+t[i-2];
			}
		return t[len];
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CountNoEncodingOfDigitString obj = new CountNoEncodingOfDigitString();
		System.out.println(obj.countEncoding("12321"));
		System.out.println(obj.dynamicCountEncoding("12321"));
	}

}
