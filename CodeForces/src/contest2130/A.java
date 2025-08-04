package contest2130;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    static int Add(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    static int MaxSum(int[] arr) {
        Arrays.sort(arr);
        if (arr[0] != 0) return Add(arr);
        else {
            int sum = 0, val = 0, sum1 =0, sum2=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0) {
                    sum1+=1;
                    sum2 += 1;
                }
                if (arr[i+1] - arr[i] == 1) {
                    sum += arr[i];
                    sum2+= arr[i];
                }
                else val = arr[i] + 1;
                sum = Math.max(sum, val);
                sum = Math.max(sum, sum1);
                sum = Math.max(sum, sum2);
                sum += arr[i];
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int l = sc.nextInt();
            int[] arr = new int[l];
            for (int i = 0; i < l; i++) arr[i] = sc.nextInt();
            System.out.println(MaxSum(arr));
        }
    }
}
