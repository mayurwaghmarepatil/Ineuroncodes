package online;

public class patt {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0 && i<=(n-1)/2 ||j==1 && i>0 && i<=(n-1)/2 || j==2 && i>1 && i<=(n-1)/2 || j==3 && i>2 && i<=(n-1)/2)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
