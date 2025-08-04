import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<>();
        // Inserting Data in an Arraylist
        n1.add(3);
        n1.add(4);
        n1.add(5);
        n1.add(7);
        n1.add(8);

        // Printing ArrayList
        System.out.println(n1);

        // Inserting data at random index
        n1.add(1, 42);
        System.out.println(n1);


        // Modifying element at any index
        n1.set(2, 34);
        System.out.println(n1);

        //Removing data at any index
        n1.remove(Integer.valueOf(34));
        System.out.println(n1);

        // Check if element exist in Arraylist
        System.out.println(n1.contains(42));

        // Taking data through index
        System.out.println("Element at index 2 :"+ n1.get(2));

        //Size of an ArrayList
        System.out.println(n1.size());
    }
}
