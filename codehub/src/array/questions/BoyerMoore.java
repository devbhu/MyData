package array.questions;

import java.util.HashMap;
import java.util.Map;

public class BoyerMoore {

	public static void search(String pat, String txt) {
		Map<Character, Integer> mt = new HashMap<Character, Integer>();
		int tmp = 0;
		int skip = 0;
		int N = txt.length();
		int M = pat.length();
		for (int i = 0; i < pat.length(); i++) {
			mt.put(pat.charAt(i), (M-1-i));

		}
		//System.out.println(mt.get(pat.charAt(3)));
		
		for (int i = 0; i <= N - M; i = i + skip) {
			skip = 0;
			for (int j = M - 1; j >= 0; j--) {
				if (pat.charAt(j) != txt.charAt(i + j)) {
					if (mt.get(txt.charAt(i + j)) != null)
						skip = Math.max(1, mt.get(txt.charAt(i + j)));
					else
						skip = j;
					break;
				}
			}
			if (skip == 0) {
				tmp = i;
				break;
			}
		}

		if (skip == 0)
			System.out.println("Match found at index " + (tmp-1));
		else
			System.out.println("Match not found at index ");
	}

	public static void main(String[] args) {
		
		String pat = "eaut";
		String txt = " It is beautiful how dfer jjr";
		search(pat, txt);
	}

}
