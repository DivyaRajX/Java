import java.util.ArrayList;
import java.util.Arrays;

public class overlappingIntervals {
    static ArrayList<int[]> findingIntervals(int[][] arr){
        ArrayList<int[]> ans = new ArrayList<>();
        int large = arr[0][1];
        int small = arr[0][0];

        for (int i = 1; i < arr.length; i++) {
            int[] smallAns = new int[2];
            int temp1 = arr[i][0];
            int temp2 = arr[i][1];

            if(temp1 < large) large = Math.max(large, temp2);
            if(small > temp1) small = temp1;

            if(temp1 > large){
                smallAns[0] = small;
                smallAns[1] = large;
                small = temp1;
                large = temp2;
                ans.add(smallAns);
            }

        }
        int[] arr1 = {small, large};
        ans.add(arr1);
        return ans;
    }
    static void print(int[][] arr){
        ArrayList<int[]> ans = findingIntervals(arr);
        for (int[] an : ans) {
            for (int i : an) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{4,8},{1,12},{9,11},{13,17}};
        print(arr);
        Arrays.sort(arr);
    }
}
