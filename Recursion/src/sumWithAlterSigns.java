public class sumWithAlterSigns {
    static int sum(int n){
        if(n == 1) return n;
        System.out.print((int)Math.pow(-1,n-1)*n+" ");
        return (int) (sum(n-1)+ Math.pow(-1,n-1)*n);
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println(sum(5));
    }
}
