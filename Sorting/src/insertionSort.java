public class insertionSort {
    static int[] sort(int[] arr){
        int n = arr.length;
        for (int i = n-1; i > 0; i--) {
            int j = i;
            while(j < n && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                System.out.println('n');
                j++;
            }
//            for (int i = 0; i <= n - 1; i++) {
//                int j = i;
//                while (j > 0 && arr[j - 1] > arr[j]) {
//                    int temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                    j--;
//                }
       }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = sort(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
