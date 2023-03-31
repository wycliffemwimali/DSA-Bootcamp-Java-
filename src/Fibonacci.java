import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        int number3;
        System.out.println("maximum number of fibonacci to print");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        System.out.println(number1+"/n"+number2);
        for(int i = 2; i < count; ++i){
            number3 = number1 + number2;
            System.out.println(""+number3);
            number1=number2;
            number2=number3;
        }
    }
}
