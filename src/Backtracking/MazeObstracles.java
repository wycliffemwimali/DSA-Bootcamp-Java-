package Backtracking;

import java.util.ArrayList;

public class MazeObstracles {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("", board, 0, 0);
        System.out.println(pathRestrictionRet("", board,0, 0));
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c){
        //base condition
        if(r == maze.length - 1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        //obstacle condiion
        if(!maze[r][c]){
            return;
        }
        //recursion calls
        if(r < maze.length -1){
            pathRestrictions(p + 'D', maze, r + 1, c);
        }
        if(c < maze[0].length - 1){
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }

    //method to return a list
    static ArrayList<String> pathRestrictionRet(String p, boolean[][] maze, int r, int c){
        //base condition
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return  list;
        }
        ArrayList<String> list = new ArrayList<>();
        //obstacle condition
        if(!maze[r][c]){
            return list;
        }
        //recursion calls
        if(r < maze.length - 1){
            list.addAll(pathRestrictionRet(p + 'D', maze, r + 1, c));
            return  list;
        }

        if(c < maze[0].length - 1){
            list.addAll(pathRestrictionRet(p + 'R', maze, r, c + 1));
            return  list;
        }
        return list;
    }
}
