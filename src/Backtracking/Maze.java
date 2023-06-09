package Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("", 3, 3);
        System.out.println(pathReturn("", 3, 3));
    }
    static int count(int r, int c){
        if(r == 1|| c == 1){
            return 1;
        }

        int left = count(r - 1, c);
        int right =  count(r, c -1);
        return left + right;
    }

    //method to print the paths
    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        //recursion calls
        if(r > 1){
            path(p + 'D', r - 1, c);
        }
        if(c > 1){
            path(p + 'R', r, c - 1);
        }
    }
    //method to return an array list
    static ArrayList<String> pathReturn (String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //recursion calls
        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(pathReturn(p + 'D', r - 1, c));
        }
        if(c > 1){
            list.addAll(pathReturn(p + 'R', r, c - 1));
        }
        return list;
    }
}
