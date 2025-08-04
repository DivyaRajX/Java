package arraysRecursion;

public class sumOfArray {
    static int sum(int[] arr, int idx, int sum){
        if(idx == arr.length) return sum;
        return sum(arr,idx+1, sum+arr[idx]);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        System.out.println(sum(arr, 0, 0));
    }
}
