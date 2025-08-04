package arraysRecursion;

public class sumOfSubsets {
    static void sumOfSub(int[] arr, int sum, int idx){
        // base case
        if(idx == arr.length){
            System.out.println(sum);
            return ;
        }

        int digit = arr[idx];
        sumOfSub(arr, sum+digit, idx+1);
        sumOfSub(arr, sum, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        sumOfSub(arr, 0, 0);

    }
}
