package online;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int[] ar = {10, 20, 60, 80, 75, 90, 100, 50, 60};
        Scanner scan = new Scanner(System.in);
        System.out.println("pleasse enter the value");
        int key = scan.nextInt();
        boolean flag = false;

        for (int i = 0; i < ar.length; i++) {
            if (key == ar[i]) {
                System.out.println("the index of key element is " + i);
                flag=true;
                break;
            }
        }
        if (flag==false) {
            System.out.println("not found");
        }
    }
    }

