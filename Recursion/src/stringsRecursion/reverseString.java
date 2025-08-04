package stringsRecursion;

public class reverseString {
    static String reverse(String str){
        if(str.isEmpty()) return "";
        String small = reverse(str.substring(1));
        char ch = str.charAt(0);
        return small+ch;
    }
    public static void main(String[] args) {
        System.out.println(reverse("Abnbm"));
    }
}
