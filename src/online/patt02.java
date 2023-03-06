package online;

public class patt02 {
    public static void main(String[] args) {
        int n = 4;
        int m=1;
        char ch='A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++)
                {
                    System.out.print(ch);
                }
                System.out.println();
                 m++;
                 ch++;
            }
        }
    }

