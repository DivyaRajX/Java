public class prefixSum {
    static void print(int[] arr){
        for(int i: arr) System.out.print(i+" ");
        System.out.println();
    }
    static void preSum(int[] arr){
        for(int i=1; i<arr.length; i++) arr[i] += arr[i-1];
        print(arr);
    }

    static void suffSum(int[] arr){
        for(int i=arr.length-1; i>0; i--) arr[i-1] += arr[i];
        print(arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7};
        int[] arr2 = arr.clone();
        preSum(arr);
        suffSum(arr2);
    }
}
