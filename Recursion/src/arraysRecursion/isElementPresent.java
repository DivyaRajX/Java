package arraysRecursion;

public class isElementPresent {
    static boolean isPresent(int[] arr, int idx, int tar){
        if(idx == arr.length) return false;
        if(arr[idx] == tar) return true;
        return isPresent(arr, idx+1, tar);
    }
    public static void main(String[] args) {
        int[] arr = {1,24,4,6,3,2,4};
        System.out.println(isPresent(arr, 0, 5));
    }
}
