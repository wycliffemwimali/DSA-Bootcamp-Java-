package Backtracking;

public class MazeObstracles {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c){
        //base condition
        if(r == maze.length - 1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        //recursion calls
        if(r < maze.length -1){
            pathRestrictions(p + 'D', maze, r + 1, c);
        }
        if(c < maze[0].length - 1){
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
        //obstacle condiion
        if(!maze[r][c]){
            return;
        }
    }
}
