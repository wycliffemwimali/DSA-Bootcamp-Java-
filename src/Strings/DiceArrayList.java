package Strings;

import java.util.ArrayList;

public class DiceArrayList {
    public static void main(String[] args) {

    }
    static ArrayList<String> diceRet(String p, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i <= 6 && i <= target; i++){
           list.addAll(diceRet(p + i, target - i));
        }
        return list;
    }
}
