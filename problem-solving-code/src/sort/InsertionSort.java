package sort;

public class InsertionSort {
    private static void sort(int a[]) {
        if (a.length == 0)
            return;
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int j = i;
            while (j > 0 && temp < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
        }
    }

    public static void main(String args[]) {
        int a[] = {7, 1, 0, 2, -100, 6};
        sort(a);
        for (int i : a) {
            System.out.println(i + ", ");
        }

    }
}
