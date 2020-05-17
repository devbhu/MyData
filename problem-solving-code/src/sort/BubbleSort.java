package sort;

public class BubbleSort {
    private static void sort(int a[]) {
        if (a.length == 0)
            return;
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            System.out.println("hi");
            if(!flag)
                break;
        }
    }

    public static void main(String args[]) {
        int a[] = {-7, -1, 0,2, 3, 5, 6, 7, 7};
        sort(a);
        for (int i : a) {
            System.out.println(i + ", ");
        }

    }
}
