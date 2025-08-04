package Questions;

// Using selection sort only
public class lexographicalFruits {
    static String[] sort(String[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j].charAt(0) < arr[min].charAt(0)) {
                    String temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        String[] fruits = {"banana", "apple", "watermelon", "guava"};
        String[] ans = sort(fruits);
        for(String str: fruits) System.out.print(str+ " ");
    }
}
