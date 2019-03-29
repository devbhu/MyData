package java8.lamda;

import java.util.*;

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1<o2 ? -1 : (o1>o2 ? 1 : 0);
    }
}

public class CollectionWithLamda {
    public static void main(String a[]){
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(3);
        list.add(67);
        System.out.println(list);
        Comparator<Integer> comparator = (o1,o2) ->  o1<o2 ? -1 : (o1>o2 ? 1 : 0);
        //Collections.sort(list,new MyComparator());
        Collections.sort(list,comparator);
        System.out.println(list);
    }
}
