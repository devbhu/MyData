package array.questions;

public class ArrayRotationCount {
    private static int getRotationCount(int a[], int l, int h) {
        int mid = 0;
        if (l > h)
            return 0;
        if (l == h)
            return 0;
        mid = (l + h) / 2;
        if (mid < h && a[mid] > a[mid + 1])
            return mid + 1;
        if (mid > l && a[mid] < a[mid - 1])
            return mid;
        if (a[mid] < a[h])
            return getRotationCount(a, l, mid - 1);
        return getRotationCount(a, mid + 1, h);

    }

    private static int getRotationCountIterative(int a[], int l, int h) {
        int mid = 0;

        if (l == h)
            return 0;
        while (l <= h) {
            mid = (l + h) / 2;
            if (mid < h && a[mid] > a[mid + 1])
                return mid + 1;
            if (mid > l && a[mid] < a[mid - 1])
                return mid;
            if (a[mid] < a[h])
                h = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    public static void main(String arg[]) {
        int arr[] = {15, 18, 19, 20, 21, 2, 3, 6, 12};
        int arr1[] = {7, 9, 11, 12, 1, 2, 3, 5};
        System.out.println("Rotation count : " + getRotationCount(arr, 0, 5));
        System.out.println("Rotation count : " + getRotationCount(arr1, 0, 4));

        System.out.println("Rotation count : " + getRotationCountIterative(arr, 0, 5));
        System.out.println("Rotation count : " + getRotationCountIterative(arr1, 0, 4));
    }
}
