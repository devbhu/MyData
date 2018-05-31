package miscellaneous.questions;

public class StringMatching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jimsawmeinbarberparlour";
		String pattern = "barber";
		boolean flag = false;
		int i, j, count, l, k;
		i = j = count = k = 0;
		int t[] = new int[26];
		l = pattern.length() - 1;
		for (i = 0; i < t.length; i++)
			t[i] = pattern.length();
		for (i = 0; i < t.length; i++)
			System.out.print(t[i] + ", ");
		System.out.println();

		for (j = 0; j < l; j++) {
			k = pattern.charAt(j) - 97;
			t[k] = l - j;
		}
		for (i = 0; i < 26; i++)
			System.out.print(t[i] + ", ");
		/*
		 * for (i = l; i < str.length(); i++) { l=pattern.length()-1; //
		 * System.out.println(l+", "); if (str.charAt(i) == pattern.charAt(l)) {
		 * l--; i--; System.out.println(l+", "); } else if (str.charAt(i) !=
		 * pattern.charAt(l) && i<str.length()){ i = l+t[str.charAt(i)-97];
		 * System.out.println(i+", "); } if (l == i) break; }
		 */
		/*
		 * for(i=0;i<str.length();i++){ int temp=i; count=0;
		 * for(j=0;j<pattern.length();j++){
		 * if((str.charAt(i)==pattern.charAt(j)) && i<str.length()){
		 * System.out.println(i+"--------"+count); i++; count++;
		 * 
		 * } if(count==pattern.length()){ flag=true; break; } }
		 * if(count==pattern.length()){ flag=true; break; } i=temp; }
		 */
		if (l == 0)
			System.out.println("Pattern found");
		else
			System.out.println("Pattern not found");
	}

}

// O(mn) time complexity
