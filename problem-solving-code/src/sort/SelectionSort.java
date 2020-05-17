package sort;

public class SelectionSort {
    private static void sort(int a[]) {
        if (a.length == 0)
            return;
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public static void main(String args[]) {
        int a[] = {7, -1, 0, 2, -100, 6};
        sort(a);
        for (int i : a) {
            System.out.println(i + ", ");
        }

    }
}
