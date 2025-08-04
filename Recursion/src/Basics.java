public class Basics {
    static void printInc(int n){
        // Base Case
        if(n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    public static void main(String[] args) {
        printInc(5);
        printDec(6);
    }
}
