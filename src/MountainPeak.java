public class MountainPeak {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 45, 34, 23,4};
        System.out.println(peakIndex(nums));

    }
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                //you are in the decreasing part of the array
                end = mid;
            }else{
                //you are in the ascending part
                start = mid + 1;
            }
        }
        //start == end ; largest array
        return start; //or return end
    }
}
