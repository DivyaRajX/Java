package contest734;

import java.util.Scanner;

public class A_antonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String win = sc.next();
        int d = 0, a = 0;
        for (int i = 0; i < win.length(); i++) {
            if(win.charAt(i) == 'A') a++;
            else d++;
        }
        System.out.println((a>d) ? "Anton" : (a<d) ? "Danik" : "Friendship");
    }
}
