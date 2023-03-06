package online;

import java.util.Scanner;

public class scan1 {
    public static void main(String[] args) {
        int [] array1=new int[10];
        Scanner scan=new Scanner(System.in);
        for (int i=0;i<array1.length;i++){
            System.out.println("marks of student "+i);
            array1[i]=scan.nextInt();
        }
        System.out.println("the mark of all student is");
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
    }
}
