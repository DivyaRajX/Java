package contest456;

public class alternatingDigitSum_2544 {
    static int alternatingSum(int n, int k ){
        if(n == 0) return 0;
        return alternatingSum(n/10, k+1) +(int) Math.pow(-1, k)*n%10;
    }
    public static void main(String[] args) {
        System.out.println(alternatingSum(231, 0));
    }
}
