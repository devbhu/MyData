package sort;

public class MergeSort {
    private static void sort(int a[], int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            sort(a, l, mid);
            sort(a, mid + 1, h);
            merge(a, l, mid, h);
        }
    }

    private static void merge(int a[], int l, int mid, int h) {
        int n1 = mid + 1 - l;
        int n2 = h - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = a[i + l];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = a[mid + 1 + i];
        }
        int i = 0, j = 0, k = l;
        //System.out.println(i+", "+j+", "+k);
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) {
        int a[] = {-7, -1, 0, 2, 3, 5, 89};
        sort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.println(i + ", ");
        }

    }
}
