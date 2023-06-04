package Strings;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
    }
    static void dice(String p, int face){
        if(face==0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i <= 6 && i <= face; i++){
            dice(p + i, face - i);
        }
    }
}
