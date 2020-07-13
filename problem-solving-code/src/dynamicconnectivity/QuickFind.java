package dynamicconnectivity;

public class QuickFind {
    private int a[];
    private QuickFind(int n){
        a = new int[n];
        for(int i = 0 ; i< n ;i++){
            a[i]=i;
        }
    }
    private boolean isConnected(int p, int q){
        return a[p] == a[q];
    }

    private void uniun(int p, int q){
        int temp = a[p];
        a[p] = a[q];
        for(int i = 0; i< a.length ; i++){
            if(temp == a[i])
                a[i] = a[q];
        }
    }

    public static void main(String ar[]){
        QuickFind quickFind = new QuickFind(9);
        quickFind.uniun(3,4);
        quickFind.uniun(3,8);
        quickFind.uniun(5,6);
        quickFind.uniun(4,6);
        System.out.println(quickFind.isConnected(5,8));
        System.out.println(quickFind.isConnected(0,1));
        for(int i = 0; i< quickFind.a.length;i++) {
            System.out.print(quickFind.a[i]+", ");
        }
    }
}
