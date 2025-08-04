package arraysRecursion;

import java.util.ArrayList;

public class allIndicesOfTarget {
    static void indicsOfTarget(int[] arr, int idx, int tar){
        if(idx == arr.length) return;
        if(arr[idx] == tar) System.out.print(idx + " ");
        indicsOfTarget(arr, idx+1, tar);
    }

    static ArrayList<Integer> indicesTarget(int[] arr, int idx, int tar, ArrayList<Integer> ar ){
        if(idx == arr.length) return ar;
        if(arr[idx] == tar) {
            System.out.println(ar);
            ar.add(idx);
        }
        return indicesTarget(arr, idx+1, tar, ar);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,6,2,3};
        ArrayList<Integer> ar= new ArrayList<>();
        indicsOfTarget(arr, 0, 2);
        System.out.println();
        System.out.println(indicesTarget(arr, 0, 3, ar));
    }
}


