package online;
//method overloading with numeric type promotion
class calculator {
    void add(float a,int b){
        float res=a+b;
        System.out.println(res);
    }
    void add(int a,int b,float c){
        float res=a+b+c;
        System.out.println(res);
    }

    }
    public class Overloading {
    public static void main(String[] args) {
calculator calc=new calculator();
calc.add(10,20,13.5f);
    }
        }
