package online;

public class Swich1case {
    public static void main(String[] args) {
        int num=200;

        switch (num){
            case 100:
                System.out.println("1st case");
                break;
            case 200:
                System.out.println("2nd case");
                break;
            case 175:
                System.out.println("3rd case");
                break;
            case 205:
                System.out.println("4th case pass");
                break;
            default:
                System.out.println("no cases pass");
        }
    }
}
