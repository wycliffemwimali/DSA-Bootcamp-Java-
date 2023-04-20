package Recursion;

public class Oneton {
    public static void main(String[] args) {
        funBoth(6);
    }

    private static void fun(int i) {
        if (i == 0){
            return;
        }
        fun(i-1);
        System.out.println(i);
    }
    static void funBoth(int i){
        if ( i==0 ){
            return;
        }
        System.out.println(i);
        funBoth(i-1);
        System.out.println(i);
    }
}
