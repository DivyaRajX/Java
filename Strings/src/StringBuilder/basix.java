package StringBuilder;
import java.util.*;


public class basix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //  Declaration
        StringBuilder sb = new StringBuilder(str);

        //Get a Charcter form idx
        System.out.println(sb.charAt(3));

        //Set a character at idx
        sb.setCharAt(3, 'f');
        System.out.println(sb);

        //insert character at some idx
        sb.insert(3,'i');
        System.out.println(sb);

        //delete a charcter at some idx
        sb.delete(2,5);
        System.out.println(sb);

        //append a charter
        sb.append('d');
        System.out.println(sb);

        //printing the length of  string
        System.out.println(sb.length());


    }
}
