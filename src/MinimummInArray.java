public class MinimummInArray {
    public static void main(String[] args) {
        int[] arr = {12, 23, 1, 23, 234};
        System.out.println(min(arr));

    }
    static  int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
