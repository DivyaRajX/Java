package Contest2122;
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long zeroNeed = 0;
            long oneNeed = 0;

            for (int i = 0; i < n; i++) {
                long a = sc.nextLong(); // initial zeros
                long b = sc.nextLong(); // initial ones
                long c = sc.nextLong(); // target zeros
                long d = sc.nextLong(); // target ones

                if (c > a) zeroNeed += (c - a);
                if (d > b) oneNeed += (d - b);
            }

            System.out.println(Math.max(zeroNeed, oneNeed));
        }

        sc.close();
    }
}