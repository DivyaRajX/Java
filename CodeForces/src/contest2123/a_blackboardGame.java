package contest2123;

import java.util.*;

public class a_blackboardGame {
    static String winningPerson(int n){
        int i = 0;
        int j = n-1;
        int temp = 0;
        int k = 0;
        while(i < j && n%2 == 0){
            if((i+j-3)%4 == 0){
                i++;
                j--;
                k = temp;
            }
            else{
                return "Alice";
            }
        }
        if(n%2 != 0) return "Alice";
        return "Bob";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(winningPerson(n));
        }
    }
}
