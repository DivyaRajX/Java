package contest2124;

import java.util.*;

public class derangedDeletion {
    static void print(int[] arr){
        int l = 0;
        for(int i: arr) if(i != -1) l++;
        System.out.println(l);
        for(int i: arr) {
            if(i != -1){
                System.out.print(i+" ");
            }
        }
    }
    static void set(int[] arr){
        int[] b = arr.clone();
        Arrays.sort(b);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == b[i]) arr[i] = -1;
        }
        for(int i: arr) {
            if(i != -1) {
                System.out.println("Yes");
                print(arr);
                return;
            }
        }
        System.out.println("No");
    }
    static void isderanged(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                set(arr);
                System.out.println();
                return;
            }
        }
        System.out.println("No");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int l = sc.nextInt();
            int[] arr = new int[l];
            for (int i = 0; i < l; i++) arr[i] = sc.nextInt();
            isderanged(arr);
        }
    }
}
