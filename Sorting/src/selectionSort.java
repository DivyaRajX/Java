public class selectionSort {
    // Worst Case ---> O(n^2)
    // Avg Case ---> O(n^2)
    // Best Case ---> oo(n^2)
    static int[] sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for (int j = i; j < n; j++) {
                if(arr[min] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }
            }
        }return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,0,2,6,9};
        int[] arr1 = sort(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
