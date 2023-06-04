package Strings;

import java.util.ArrayList;

public class DiceArrayList {
    public static void main(String[] args) {
        System.out.println(diceRet("", 4));
    }
    static ArrayList<String> diceRet(String p, int face){
        if(face==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i <= 6 && i <= face; i++){
           list.addAll(diceRet(p + i, face - i));
        }
        return list;
    }
}
