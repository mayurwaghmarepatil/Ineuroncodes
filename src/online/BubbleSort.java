package online;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {7, 5, 3, 2, 1, 4, 6};

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - 1; j++) {
                if (a[i] < a[j - i]) {
                    int tempVar = a[i];
                    a[i]=a[j-1];
                    a[j-1]=tempVar;
                }
            }
            System.out.println();
        }
    }
}