package Questions;

public class displacingZeroes {

    //Bubble Sort wali baad main kr liyo
    static int[] displace(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == 0){
                int temp = arr[i];
                int j = i+1;
                while(j < arr.length){
                    int temp2 = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp2;
                    j++;
                }
                arr[arr.length-1] = temp;
            }
        }return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,5,0,3,4,2};
        int[] arr2 = displace(arr);
        for(int i: arr) System.out.print(i+" ");
    }
}
