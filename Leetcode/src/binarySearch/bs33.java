package binarySearch;

public class bs33 {
    static int rotatedSorted(int[] arr, int target){
        int i=0, j = arr.length-1;
        while(i <= j){
            int mid = (i+j)/2;
            if(arr[mid] == target) return mid;
            if(arr[mid] > target){
                if(arr[i] <= target && target <= arr[mid]) {
                    j = mid - 1;
                }
            }
        }return 1;
    }
    public static void main(String[] args) {

    }
}
