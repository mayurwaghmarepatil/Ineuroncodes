package online;

public class Array2 {
    public static void main(String[] args) {
        int [][] ar={{10,20},{10,20,30},{50,60,70,40}};
        for(int []a:ar) {
            for (int mayur : a) {
                System.out.print(mayur + " ");
            }
            System.out.println();
        }
    }
}
