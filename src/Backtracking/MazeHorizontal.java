package Backtracking;

import java.util.ArrayList;

public class MazeHorizontal {
    public static void main(String[] args) {

    }
    static ArrayList<String> pathReturn (String p, int r, int c){
        //base condition
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //recursion calls
        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
            list.addAll(pathReturn(p + 'D', r - 1, c - 1));
        }

        if(r > 1){
            list.addAll(pathReturn(p + 'V', r - 1, c));
        }

        if(c > 1){
            list.addAll(pathReturn(p + 'H', r, c - 1));
        }
        return list;
    }
}
