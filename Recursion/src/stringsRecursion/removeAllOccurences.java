package stringsRecursion;
import java.util.Scanner;
//o(n^2)
public class removeAllOccurences{
     static String removeII(String str, char ch){
         if(str.isEmpty()) return "";
         String smallAns = removeII(str.substring(1), ch);
         char chr = str.charAt(0);
         if(chr != ch) return chr+smallAns;
         else return smallAns;
     }
    static String removed(String str, int idx, char ch, String ans){
        if(idx == str.length()) return ans;
        if(str.charAt(idx) != ch) ans += str.charAt(idx);
        return removed(str, idx+1, ch, ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(removed(s.toLowerCase(), 0, ch, ""));
        System.out.println(removeII(s, ch));
        
    }
}
