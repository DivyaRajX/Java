package stringsRecursion;

import java.util.Scanner;

public class isPalindrome {
    static boolean isPal(String str, int l, int r){
        if(l >= r) return true;
        return (str.charAt(l) == str.charAt(r) && isPal(str,l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPal(s,0, s.length()-1));
    }
}
