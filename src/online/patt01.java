package online;

public class patt01 {
    public static void main(String[] args) {
        int n=7;
        for (int i=0;i<=n;i++){
            for (int j=0;j<n;j++){
                if(j==0 && i<=(n-1)/2 || j==1 && i<3 || j==2 && i<2 || j==3 && i<1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
