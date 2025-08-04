package contest455;

import java.util.Locale;
import java.util.Scanner;

public class validPalindrome {
    static boolean isPal(String st){

        String str = st.replaceAll("[^a-zA-Z0-9]","");
        String stw = str.toLowerCase();
        System.out.println(stw);
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(isPal(st));
    }
}
