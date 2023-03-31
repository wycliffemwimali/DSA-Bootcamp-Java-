import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is an even number");
        }
        else{
            System.out.println(number + " is an odd number");
        }
    }
}
