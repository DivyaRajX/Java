public class countSort {
    static void display(int[] arr){
        for(int i: arr) System.out.print(i+" ");
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    static void sort(int[] arr){

        /* give the complexity of
            O(N^2)

            Disadvantages

            stability error
            object error
         */
        int max = findMax(arr);
        int[] newArr = new int[max+1];
        for(int i=0; i<arr.length; i++){
            newArr[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i]; j++) {
                arr[k++] = i;
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {1,3,0,2,6,9,9,9};
        sort(arr);
        display(arr);
    }
}
