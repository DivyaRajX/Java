import java.util.*;
public class gcd {
    static int  div(int n, int m){

        // Euclidean Method
        if(n%m == 0){
            return m;
        }
        return div(m, n%m);
    }
    public static void main(String[] args) {

        System.out.println(div(45, 60));
        System.out.println("lmc: "+(45*60)/div(45,60));
    }
}
