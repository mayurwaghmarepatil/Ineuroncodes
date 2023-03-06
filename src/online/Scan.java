package online;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        int[] ar=new int[5];
        Scanner sc1=new Scanner(System.in);

        for(int i=0;i<ar.length;i++){
            System.out.println("please enter marks of student " + i);
            ar[i]= sc1.nextInt();
        }
        System.out.println("the mark of student as follows");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+ " ");
        }
    }
}
