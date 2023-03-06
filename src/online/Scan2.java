package online;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("the number of class is " + i + "and the student is " + j);
                arr[i][j] = sc1.nextInt();
            }
            System.out.println();
        }
        System.out.println("all the value of array is ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }


    }
}