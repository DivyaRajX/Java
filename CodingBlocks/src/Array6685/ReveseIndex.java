package Array6685;

public class ReveseIndex {
    public static void main(String[] args){
        int[] arr = {1, 0, 4, 2, 3};
        int[] arr2 = new int[arr.length];
        int k = 0;
        for(int i: arr){
            arr2[i] = k++;
        }
        for(int i: arr2) System.out.print(i+" ");
    }
}
