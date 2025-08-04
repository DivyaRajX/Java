package contest734;

import java.util.Scanner;

public class B_AntonAndDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int twos = sc.nextInt(), threes = sc.nextInt(), fives = sc.nextInt(), sixs = sc.nextInt();
//        int twos = 5, threes = 3, fives = 1, sixs = 4;
        int sum = 0;
        boolean flag = true;
        while(flag){
            if(twos != 0 && fives != 0 && sixs != 0) {
                sum+=256;
                twos--;
                fives--;
                sixs--;
            }
            else if(threes != 0 && twos != 0) {
                sum += 32;
                twos --;
                threes --;
            }
            else flag = false;
        }
        System.out.println(sum);
    }
}
