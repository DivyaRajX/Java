public class sumOfInteger {
    static int printSum(int n, int ans){
        if(n == 0) return ans;
        return printSum(n/10, ans+n%10);
    }
    public static void main(String[] args) {
        System.out.println(printSum(354, 0));
    }
}
