import java.util.Scanner;
//code to add sum of two numbers ten times
public class Main {

    public static void main(String[] args) {

        sum();
    }
    static void sum() {
        Scanner input = new Scanner(System.in);
        int number1, number2, sum;
        System.out.print("enter your first number: ");
        number1 = input.nextInt();
        System.out.print("enter your second number: ");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.println("the sum is " + sum);
    }

}
