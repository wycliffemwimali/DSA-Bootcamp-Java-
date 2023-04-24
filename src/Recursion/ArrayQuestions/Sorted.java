package Recursion.ArrayQuestions;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,5};

        System.out.println(sorted(arr,0));


    }
    static boolean sorted(int[] array, int index){
        if(index== array.length-1){
            return true;
        }
        return array[index] < array[index+1] && sorted(array, index+1);
    }
}
