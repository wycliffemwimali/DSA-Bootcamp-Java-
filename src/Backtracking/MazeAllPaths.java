package Backtracking;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPaths("", board, 0, 0);
    }

    //backtracking
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

        maze[r][c] = false;


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
        if(c > 0){
            allPaths(p + 'L', maze, r, c - 1);
        }

        maze[r][c] = true;
    }


    static void allPathsPrint(String p, boolean[][] maze, int r, int c){
        //base condition
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        //obstacle condition
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;


        //recursion calls
        if(r < maze.length - 1){
            allPathsPrint(p + 'D', maze, r + 1, c);
        }
        if(c < maze[0].length - 1){
            allPaths(p + 'R', maze, r, c + 1);
        }
        if(r > 0){
            allPaths(p + 'U', maze, r - 1, c);
        }
        if(c > 0){
            allPaths(p + 'L', maze, r, c - 1);
        }

        maze[r][c] = true;
    }
}
