package online;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] ar1 = new int[4];
        for (int elem : ar1) {
            System.out.print(elem);
        }
        System.out.println();
        Arrays.fill(ar1, 6);
        for (int elem : ar1) {
            System.out.print(elem);
        }
        System.out.println();
        int[] ar2 = {1, 2, 0, 0, 0, 4, 5};
        Arrays.fill(ar2, 2, 5, 10);
        for (int elem : ar2) {
            System.out.print(elem + " ");
        }
        System.out.println();
        int[] ar3 = {60, 80, 45, 13, 9, 87, 26};
        Arrays.sort(ar3);
        for (int elem : ar3)
        {
            System.out.print(elem+" ");
        }
        System.out.println();
        int res=Arrays.binarySearch(ar3,85);
        System.out.println(res);
    }

}