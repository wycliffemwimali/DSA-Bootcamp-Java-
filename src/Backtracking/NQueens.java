package Backtracking;

public class NQueens {
    public static void main(String[] args) {

    }
    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }
        int count = 0;
        //placing the queen and checking for every row and col
        for(int col = 0; col < board.length; col++){
            //place the queen if safe
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row + 1);
            }
        }
        return count;
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
