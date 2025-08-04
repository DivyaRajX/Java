import java.util.Scanner;

public class targetSum {

    static void findNoPair(int[] arr, int tar){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int rem = tar-arr[i];
            for(int j = i+1; j < n; j++) {
                if(rem == arr[j]) System.out.println(arr[i]+", "+ arr[j]);
            }
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int[] arr = {4,6,3,5,8,2};
        int n = 7;
        findNoPair(arr, n);
    }
}
