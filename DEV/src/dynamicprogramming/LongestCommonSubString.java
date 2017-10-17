package dynamicprogramming;

public class LongestCommonSubString {


	//bottom up dynamic approach
	static int LCSubStr(String s1, String s2){
		int a[][] = new int[s1.length()+1][s2.length()+1];
		int res=0;
		int p,q;
		p=q=0;
		for(int i=0 ; i <= s1.length() ; i++){
			for(int j=0 ; j <= s2.length() ; j++){
				if( i == 0 || j == 0)
					a[i][j] =0;
				else if(s1.charAt(i-1) == s2.charAt(j-1)){
					a[i][j] =a[i-1][j-1]+1;
					if(a[i][j]>res){
						res = a[i][j];
						p=i; q=j;
					}
				}
				else
					a[i][j] =0;

			}
		}
		System.out.println("longest common sub string");
		while(a[p][q] != 0){
			//System.out.print(s1.charAt(p-1));
			p--;
			q--;
		}
		
		//System.out.println("longest common sub string");
		p++;
		q++;
		while(a[p][q] != 0){
			
			System.out.print(s1.charAt(p-1));
			p++;
			q++;
			
		}
		System.out.println();

		return res;
	}
	public static void main(String[] args) {
		String s1 = "abcdafkjd";
		String s2 = "zbcdafdkl";
		System.out.println("longest common sub string : "+LongestCommonSubString.LCSubStr(s1,s2));
	}

}
