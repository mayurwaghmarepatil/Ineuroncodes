package online;
import java.util.Scanner;

public class launchPalindrom {

    //Palindrom
    public static class LaunchPalindrom {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("USER PLEASE ENTER THE STRING VALUE");
            String s1=scan.next();
            String s2="";

            for(int i=s1.length()-1;i>=0;i--)
            {
                s2+=s1.charAt(i);
            }
            System.out.println(s2);
            if (s1.equalsIgnoreCase(s2))
            {
                System.out.println("the string is palindrom");
            }else
            {
                System.out.println("the string is not palindrom");
            }
        }
    }

}
