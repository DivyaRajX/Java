public class rotateKsteps {
    static void print(int[] arr){
        int j = arr.length-1;
        for (int i = 0; i < j+1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void reverse(int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }
//    static void rotateK(int[] arr, int k){
//        int strt = 0, end = arr.length-1;
//        int t = k-1;
//        while(0 <= t) reverse(strt++, t--);
//        while(k <= end) reverse(k++, end--);
//        print(arr);
//
//    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5,6,5};
        int k = 2;
        int i = 0, j = arr.length-1;
        while(j > i){
            reverse(arr[i], arr[j]);
            i++;
            j--;
        }
        print(arr);
//        rotateK(arr, k);
    }
}
