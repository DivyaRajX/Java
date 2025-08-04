package Contest2122;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(Math.max(m,n) >= 3 && Math.min(m,n) >= 2) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
