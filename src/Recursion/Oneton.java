package Recursion;

public class Oneton {
    public static void main(String[] args) {
        fun(6);
    }

    private static void fun(int i) {
        if (i == 0){
            return;
        }
        fun(i-1);
        System.out.println(i);
    }
}
