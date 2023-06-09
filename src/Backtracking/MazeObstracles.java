package Backtracking;

public class MazeObstracles {
    public static void main(String[] args) {

    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c){
        //base condition
        if(r == maze.length - 1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        //recursion calls
        if(r < maze.length -1){
            pathRestrictions(p, maze, r - 1, c);
        }
    }
}
