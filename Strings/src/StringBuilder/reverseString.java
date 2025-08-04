package StringBuilder;

public class reverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        int l = sb.length();
        for(int i=0; i<sb.length()/2; i++){
            char front = sb.charAt(i);
            char back = sb.charAt(l-1-i);

            sb.setCharAt(i,back);
            sb.setCharAt(l-1-i, front);
        }
        System.out.println(sb);
    }
}
