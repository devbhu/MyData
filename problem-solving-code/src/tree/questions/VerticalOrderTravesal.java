package tree.questions;

import java.util.*;


public class VerticalOrderTravesal {

    private void verticalOderUsingPreorder(Node root, int hd, Map<Integer, List<Integer>> m) {
        if (root == null)
            return;
        List<Integer> list = m.get(hd);
        if (Objects.isNull(list)) {
            list = new ArrayList<>();
        }
        list.add(root.data);
        m.put(hd, list);
        verticalOderUsingPreorder(root.left, hd - 1, m);
        verticalOderUsingPreorder(root.right, hd + 1, m);
    }

    private void printVerticalOrderUsingPreorder(Node root) {
        int hd = 1;
        Map<Integer, List<Integer>> map = new TreeMap<>();
        verticalOderUsingPreorder(root, hd, map);

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            List<Integer> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values);
        }

    }

    private  void printVerticalOrderUsingLevelOrder(Node root) {
        if (Objects.isNull(root)) {
            return;
        }
        Pair temp;
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        Pair pair = Pair.of(root, 0);
        q.add(pair);
        while (!q.isEmpty()) {
            Pair p = q.poll();
            List<Integer> list = map.get(p.hd);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(p.node.data);
            map.put(p.hd, list);
            if (p.node.left != null) {
                temp = Pair.of(p.node.left, p.hd - 1);
                q.add(temp);
            }
            if (p.node.right != null) {
                temp = Pair.of(p.node.right, p.hd + 1);
                q.add(temp);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

    }


    public static void main(String arg[]) {
        VerticalOrderTravesal v = new VerticalOrderTravesal();

        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(17);
        root.right.right = new Node(25);
        root.left.left.left = new Node(6);

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        root1.right.left.right = new Node(8);
        root1.right.right.right = new Node(9);
        root1.right.right.left = new Node(10);
        root1.right.right.left.right = new Node(11);
        root1.right.right.left.right.right = new Node(12);
       // v.printVerticalOrderUsingPreorder(root);
       /* System.out.println("***************************");
        v.printVerticalOrderUsingLevelOrder(root);*/
        v.printVerticalOrderUsingPreorder(root1);
        System.out.println("***************************");
        v.printVerticalOrderUsingLevelOrder(root1);
    }
}

