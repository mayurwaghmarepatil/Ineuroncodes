package online;

public class min {
    public static void main(String[] args) {
        int [] ar={27,64,10,45,98};
        int max=ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max) {
                max = ar[i];
            }
        }
        System.out.println("the maximum value is "+max);

        int min =ar[0];
        for (int j=0;j<ar.length;j++){
            if (ar[j]<min){
                min=ar[j];
            }
        }
        System.out.println("the minimum value is "+min);
    }
}
