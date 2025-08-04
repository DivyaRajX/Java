package contest677;
import java.util.*;

public class vanyaAndFence {
    static int space(int x, int h){
        return (x <= h) ? 1 : 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxHeight = sc.nextInt();
        int spc = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            spc += space(x, maxHeight);
        }
        System.out.println(spc);
    }
}
