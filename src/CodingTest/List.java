package CodingTest;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        java.util.List<java.util.List<Integer>> list = new ArrayList<>();
        java.util.List<Integer> row1 = new ArrayList<>();
        java.util.List<Integer> row2 = new ArrayList<>();

        row1.add(9);
        row1.add(7);
        row1.add(5);

        row2.add(10);
        row2.add(20);

        list.add(row1);
        list.add(row2);

        System.out.println("list.get(0).get(0) = " + list.get(0).get(0));
        System.out.println("list.get(0).get(0) = " + list.get(0).get(1));
        System.out.println("list.get(0).get(0) = " + list.get(0).get(2));

        System.out.println("list.get(1).get(0) = " + list.get(1).get(0));
        System.out.println("list.get(1).get(0) = " + list.get(1).get(1));

        // 배열 추가
        list.add(row1);
        System.out.println("list.get(0).get(0) = " + list.get(2).get(0));
        System.out.println("list.get(0).get(0) = " + list.get(2).get(1));
        System.out.println("list.get(0).get(0) = " + list.get(2).get(2));

        // 값 교체
        list.get(0).set(1, 99);
        System.out.println("list.get(0).get(0) = " + list.get(0).get(0));
        System.out.println("list.get(0).get(0) = " + list.get(0).get(1));
        System.out.println("list.get(0).get(0) = " + list.get(2).get(0));

//        list2.add(list.of(9,8,7));
//        list2.add(list.of(10,20,30));
//        list2.add(list.of(3,4,5));
    }
}
