package contest2123;

import java.util.*;

public class b_Tournament {

    static String tournament(int[] arr, int j, int k){
        int n = arr.length;
        int ele = arr[j-1];
        Arrays.sort(arr);
        if(ele >= arr[n-k-1]) return "Yes";
        return "No";

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(tournament(arr, j, k));

        }
    }
}
