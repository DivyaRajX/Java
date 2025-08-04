package Array6685;
import java.util.*;

public class howMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[3];
        int count1 = 0;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<3; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] == 1) count++;
            }
            if(count > 1) count1++;
        }
        System.out.println(count1);
    }
}
