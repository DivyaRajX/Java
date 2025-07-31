public class twoPointer {
    static void print(int[] arr){
        for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1,0,0,1};
        int i = 0, j = arr.length-1;
        while(i < j ){
            if(arr[i] == 1 && arr[j] == 0){
                swap(arr,i,j);
                i++;
                j--;
            }
            else if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
        }
        print(arr);
    }
}
