public class bubbleSort {
    // Worst Case ---> O(n^2)
    // Avg Case ---> O(n^2)
    // Best Case ---> oo(n^2)


    static int[] sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean flag = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                    System.out.println('r');
                }
            } if(!flag) return arr;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,0,2,6,9};
        int[] arr1 = sort(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
