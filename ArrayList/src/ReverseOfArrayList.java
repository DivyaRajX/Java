import java.util.ArrayList;
import java.util.Collections;
public class ReverseOfArrayList {

    static ArrayList<Integer> reverse(ArrayList<Integer> arr){
        int i = 0, j = arr.size()-1;
        while(i < j){
            /*
            temp = a
            a = b
            b = temp
             */

            Integer temp = Integer.valueOf(arr.get(i));
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<>();
        // Inserting Data in an Arraylist
        n1.add(3);
        n1.add(4);
        n1.add(5);
        n1.add(7);
        n1.add(8);
        System.out.println(n1);
        System.out.println();
        ArrayList<Integer> arr = reverse(n1);
        System.out.println(n1);
        Collections.reverse(n1);

        System.out.println(n1);

    }
}
