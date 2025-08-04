package stringsRecursion;
import java.util.ArrayList;
import java.util.Scanner;

public class isSubsequences {

    static void print(String que, String ans){
        if(que.isEmpty()){
            System.out.println(ans+" ");
            return;
        }
        char ch = que.charAt(0);
        print(que.substring(1), ans );
        print(que.substring(1), ans+ch);
    }

    static ArrayList<String> printSSQ(String str){
        ArrayList<String> arr = new ArrayList<>();
        if(str.isEmpty()) {
            arr.add("");
            return arr;
        }
        char chr = str.charAt(0);
        ArrayList<String> smallAns = printSSQ(str.substring(1));

        for(String ssr : smallAns){
            arr.add(ssr);
            arr.add(chr+ssr);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        print(str, "");
        System.out.println();
        System.out.println(printSSQ(str));
    }
}
