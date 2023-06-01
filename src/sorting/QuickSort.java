package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {3, 5, 4, 2, 8};
        sort(array, 0, array.length);
        System.out.println(Arrays.toString(array));

    }
    static  void sort(int[] nums, int low, int hi){
        if(low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e-s)/2;
        int pivot = nums[m];

        while (s <= e){
            while (nums[s] < pivot){
                s++;
            }
            while (nums[e]>pivot){
                e++;
            }
            //swap
            if (s <= e ){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;

            }
        }
        //sort two halves
        sort(nums, low, e);
        sort(nums, s, hi);
    }
}
