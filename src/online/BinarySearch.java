package online;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        Scanner scan = new Scanner(System.in);
        System.out.println("enter key");
        int key = scan.nextInt();

        int low = 0;
        int high = array.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == array[mid]) {
                System.out.println("key " + key + " found at the index of " + mid);
                break;
            } else if (key < array[mid])
            {
                high = mid - 1;
            } else if (key > array[mid])
            {
                low = mid + 1;
            }
        }
            if (low > high) {
                System.out.println("key not found");
            }
        }
    }
