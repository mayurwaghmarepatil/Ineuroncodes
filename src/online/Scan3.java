package online;

import java.util.Scanner;

public class Scan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][][] arr3 = new int[2][3][3];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    System.out.println("enter the number of college " + i + "classes " + j + "student" + k);
                    arr3[i][j][k] = scan.nextInt();
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    System.out.print(arr3[i][j][j]+" ");
                }
                System.out.println();
            }
        }
    }
}