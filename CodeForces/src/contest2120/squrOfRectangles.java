package contest2120;

import java.util.Scanner;

public class squrOfRectangles {
    static String isSquare(int[] arr){
        if((arr[0] == arr[2] && arr[2] == arr[4]) && arr[1]+arr[3]+arr[5] == arr[0]) return "yes";
        else if(arr[0]+arr[2] == arr[1] && arr[3]+arr[5] == arr[1]) return "yes";
        else if((arr[1] == arr[3] && arr[3] == arr[5]) && arr[0]+arr[2]+arr[4] == arr[1]) return "yes";
        else if(arr[1]+arr[3] == arr[0] && arr[2]+arr[4] == arr[0]) return "yes";
        return "no";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[] arr = new int[6];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(isSquare(arr));
        }
    }
}
