package arraysRecursion;

public class mxValue {
    static int max(int[] arr, int idx, int ans){
        if(idx == arr.length) return ans;
        return max(arr, idx+1, Math.max(arr[idx], ans));
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,224,5,6};
        System.out.println(max(arr, 0, 0));
    }
}
