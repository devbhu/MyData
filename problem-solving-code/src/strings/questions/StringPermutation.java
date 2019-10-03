package strings.questions;

import java.util.Map;
import java.util.TreeMap;

public class StringPermutation {
    private static void permuteIfNoDuplicateChar(char a[], int k, int level) {
        if (level == k) {
            System.out.println(a);
        }

        for (int i = k; i < a.length; i++) {
            swap(a, k, i);
            permuteIfNoDuplicateChar(a, k + 1, level);
            swap(a, k, i);
        }
    }

    private static void swap(char a[], int k, int i) {
        char t = a[k];
        a[k] = a[i];
        a[i] = t;
    }

    private static void permute(char a[], int level, int len) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : a) {
            map.compute(c, (p, v) -> {
                if (v == null)
                    return 1;
                else
                    return v + 1;
            });
        }
        char str[] = new char[map.entrySet().size()];
        int index[] = new int[map.entrySet().size()];
        int i, j;
        i = j = 0;

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            str[i++] = e.getKey();
            index[j++] = e.getValue();
        }

        char[] result = new char[a.length];
        permuteUtils(str, result, level, index, len);
    }

    private static void permuteUtils(char[] str, char[] result, int level, int[] index, int len) {
        if (level == len) {
            System.out.println(result);
        }
        for (int i = 0; i < str.length; i++) {
            if (index[i] == 0)
                continue;
            result[level] = str[i];
            index[i]--;
            permuteUtils(str, result, level + 1, index, len);
            index[i]++;
        }

    }

    public static void main(String arg[]) {
        char a[] = {'A', 'B', 'C'};
        permuteIfNoDuplicateChar(a, 0, a.length - 1);
        System.out.println("***********************************");
        permute(a, 0, a.length);
        int m= (3+2147483647) >>>1;
        System.out.println(m);
    }
}
