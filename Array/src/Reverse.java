public class Reverse {
    static void reverseArray(int[] arr){
        int end = arr.length-1;
        int strt = 0;
        int mid = arr.length/2;
        while(strt < end){
            int temp =  arr[strt];
            arr[strt] = arr[end];
            arr[end] = temp;
            strt++;
            end--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5,6,5};
        reverseArray(arr);
    }
}
