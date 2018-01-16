package dynamic.questions;
import java.util.*;

public class NumberOfBST {

	/**
	 * @param args
	 */
	int countBST(int n){
		int T[] = new int[n+1];
		T[0]=1;
		T[1] = 1;
		for(int i = 2 ; i <= n ; i++){
			//T[i]=0;
			for(int j = 0 ; j < i ; j++){
				//System.out.println("  dev");
				T[i] = T[i] + T[j]*T[i-j-1];
			}
		}
		//for(int i=0 ; i<=n ;i++)
		//	System.out.print(T[i]+"  ");	
		return T[n];
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		NumberOfBST bst  = new NumberOfBST();
		int n = sc.nextInt();
		System.out.println(bst.countBST(n));
	}

}
