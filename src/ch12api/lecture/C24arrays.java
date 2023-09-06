package ch12api.lecture;

import java.util.Arrays;

public class C24arrays {
    // Arrays : 배열을 다루는 메소드

    // equals : 배열이 같은지
    // fill : 배열을 특정 값으로 채우기
    // sort : 배열 정렬
    // binarySearch : 특정 원소 위치 찾기
    // toString : 문자열로 전환

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        for(int i = 0; i<arr1.length; i++) {
            arr1[i] = 10;
        }
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1, 5);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {3, -2, 10, 0, -1};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // equals
        int[] arr3 = {3, 4, 5};
        int[] arr4 = {3, 4, 5};
        int[] arr5 = {4, 3, 5};

        System.out.println(arr3 == arr4);
        System.out.println(Arrays.equals(arr3,arr4));
        System.out.println(Arrays.equals(arr3,arr5));

        // sort
        Arrays.sort(arr5);
        System.out.println(Arrays.equals(arr3,arr5));

        // binarySearch 이진탐색
        int[] arr6 = {5, 3, 1, 7, 9};
        int i = Arrays.binarySearch(arr6,3);
        System.out.println(i);

        Arrays.sort(arr6);
        int i1 = Arrays.binarySearch(arr6, 3);
        System.out.println(i1);
        int i2 = Arrays.binarySearch(arr6, 4);
        System.out.println(i2);
    }



}
