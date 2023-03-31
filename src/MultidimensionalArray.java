import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num = new int[3][3];
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                num[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                System.out.println(num[row][col] + " ");
            }
            System.out.println();
        }
    }
}