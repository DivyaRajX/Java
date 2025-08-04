public class mergeSort {
    static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int i,j,k;
        int[] right = new int[n2], left = new int[n1];
        for (i = 0; i < n1; i++) {
            left[i] = arr[i+l];
        }
        for (i = 0; i < n2; i++) {
            right[i] = arr[i+mid+1];
        }
        i=0;
        j=0;
        k=l;
        while(i < n1 && j<n2){
            if(left[i] < right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while(i < n1) arr[k++] = left[i++];
        while(j < n2) arr[k++] = right[j++];
    }
    static void sort(int[] arr, int l, int r){
        // Base Case
        if(l >= r) return;

        //Small Problem
        int mid = (l+r)/2;
        sort(arr, l, mid);
        sort(arr, mid+1, r);

        //Self Work
        merge(arr, l, mid, r);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,0,2,6,9};
        sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
