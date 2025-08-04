public class kMultiplesOfN {
    static void printKmultiples(int n, int k){
        // base case

        if(k == 1){
            System.out.println(n);
            return;
        }

        // recursive case
        printKmultiples(n, k-1);

        // base case
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        printKmultiples(5, 4);
    }
}
