public class powerRaisedToQ {
    static int pwer(int p, int q){
        if(q == 1) return p;
        return p*pwer(p, q-1);

    }

    static int alterApproach(int p, int q){
        // O(logn) O(2^n)
        if(q == 0) return 1;
        int smallerPower = alterApproach(p, q/2);
        if(q%2 == 0) return smallerPower*smallerPower;
        else return p*smallerPower*smallerPower;
    }
    public static void main(String[] args) {
        int n = pwer(2, 3);
        System.out.println(n);
        System.out.println(alterApproach(2, 5));
    }
}
