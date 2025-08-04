package arraysRecursion;

import java.util.ArrayList;

public class subsetsOfArray {
    static void printSubSets(int[] arr, ArrayList<Integer> ans, int idx){

        if(idx == arr.length){
            System.out.println(ans);
            return;
        }
        int di = arr[idx];
        printSubSets(arr, ans, idx+1);
        ans.add(di);
        printSubSets(arr, ans, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        ArrayList<Integer> ans = new ArrayList<>();

        printSubSets(arr, ans, 0);
    }
}
