package Backtracking;

public class MazeAllPaths {
    public static void main(String[] args) {

    }
    static void allPaths(String p, boolean[][] maze, int r, int c){
        //base condition
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        //obstacle condition

    }
}
