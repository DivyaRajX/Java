public class squareOfNonDecreasing {
    static void print(int[] arr){
        for(int i: arr) System.out.print(i+" ");
        System.out.println();
    }
    static void square(int[] arr){
        int[] arr2 = new int[arr.length];
        int left = 0, right = arr.length-1, i = 0;
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                arr2[i++] = arr[left]*arr[left];
                left++;
            }
            else{
                arr2[i++] = arr[right]*arr[right];
                right--;
            }
        }
    print(arr2);
    }
//    static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
    public static void main(String[] args) {
        int[] arr = {-10, -3, -1, 0, 1, 4, 30};
        print(arr);
        square(arr);
    }
}
