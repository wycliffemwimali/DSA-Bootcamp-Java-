package Backtracking;

public class NQueens {
    public static void main(String[] args) {

    }
    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }
    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean element : row){
                if(element){
                    System.out.println("Q ");
                }else {
                    System.out.println("X");
                }
            }
            System.out.println();
        }

    }
}
