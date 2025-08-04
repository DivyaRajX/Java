package prctc;
public class Main {

    static int[] arr = {1,24,4,9,6,8};
    static int n = arr.length;

    static void display(int[] arr){
        for(int i: arr) System.out.print(i+" ");
    }

    static int[] bubbleSort(int[] arr){
        for(int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }return arr;
    }

    static int[] bubbleSortOcN(int[] arr){
        boolean flag = false;
        for(int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(!flag) return arr;
        }return arr;
    }

    static int[] selectionSort(int[] arr){
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min]){
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }
            }
        }return arr;
    }

    static int[] insertionSort(int[] arr){
        for(int i=n-1; i>=0; i--){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }return arr;
    }

    static void mergeSort(int[] arr, int l, int r){
        //Base Case
        if(l >= r) return;

        //Recursion
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr,mid+1, r);

        //Self Work
        merge(arr, l, mid, r);
    }

    static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] left = new int[n1], right = new int[n2];
        int i,j,k;
        for (i = 0; i < n1; i++) left[i] = arr[i+l];
        for(j = 0; j < n2; j++) right[j] = arr[mid+1+j];
        i = 0;
        j = 0;
        k = l;
        while(n1 > i && n2 > j){
            if(left[i] < right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while(i < n1) arr[k++] = left[i++];
        while(j < n2) arr[k++] = right[j++];

    }
    public static void main(String[] args) {
        System.out.println("Sorting the array using adjacent positions");
        display(bubbleSort(arr));
        System.out.println();

        System.out.println("Sorting the array using bubble Sort with its best case");
        display(bubbleSortOcN(arr));
        System.out.println();

        System.out.println("Sorting the array by the principle of smallest first");
        display(selectionSort(arr));
        System.out.println();

        System.out.println("Sorting in sliding window");
        display(insertionSort(arr));
        System.out.println();

        mergeSort(arr, 0, n-1);
        display(arr);
    }
}
