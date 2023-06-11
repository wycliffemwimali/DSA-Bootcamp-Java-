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
        if(!maze[r][c]){
            return;
        }
        //recursion calls
        if(r < maze.length - 1){
            allPaths(p + 'D', maze, r + 1, c);
        }
        if(c < maze[0].length - 1){
            allPaths(p + 'R', maze, r, c + 1);
        }
        if(r > 0){
            allPaths(p + 'U', maze, r - 1, c);
        }
    }
}
