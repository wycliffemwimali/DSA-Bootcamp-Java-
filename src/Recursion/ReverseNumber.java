package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        rev(12345);

    }
    static void rev(int n){
        if(n<10){
            System.out.println(n);
        }
        else {
            System.out.println(n%10);
            rev(n/10);
        }
    }
}
