package Contest2117;
import java.util.*;
public class falseAlarm {
    static String isAlarm(int [] arr, int k){
        int flag = 0;
        for(int i: arr){
            if(i == 1 && flag == 0) {
                flag++;
            }
            if(i == 1 && k <= 0) return "No";
            if(flag != 0){
                k--;
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int doors = sc.nextInt();
            int buttonS = sc.nextInt();
            int[] arr = new int[doors];
            for(int j=0; j<doors; j++) arr[j] = sc.nextInt();
            System.out.println(isAlarm(arr, buttonS));
        }
    }
}

//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//int t = Integer.parseInt(br.readLine());
//
//while (t-- > 0) {
//StringTokenizer st = new StringTokenizer(br.readLine());
//int n = Integer.parseInt(st.nextToken());
//int x = Integer.parseInt(st.nextToken());
//
//int[] arr = new int[n];
//st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        System.out.println(canReachExit(arr, x) ? "YES" : "NO");
//        }