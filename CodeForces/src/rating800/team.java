package rating800;

import java.util.Scanner;

public class team {
    static int count(int[] arr){
        int count = 0;
        for(int i :arr) count+=i;
        if(count>1) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0 ;
        while(t-- > 0){
            int[] arr = new int[3];
            for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
            count += count(arr);
        }
        System.out.println(count);
    }
}