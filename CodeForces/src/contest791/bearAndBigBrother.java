package contest791;
import java.util.Scanner;


public class bearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();

        int years = 0;
        while(limak <= bob){
            years++;
            limak *= 3;
            bob *= 2;
        }
        System.out.println(years);
    }
}
