package Recursion.ArrayQuestions;

public class Find {
    public static void main(String[] args) {
        int[] arr = {12,2,3,5,45};
        System.out.println(findIndex(arr,45,0));

    }
    static int findIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return  -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }
}
