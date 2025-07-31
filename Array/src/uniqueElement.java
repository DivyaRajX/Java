public class uniqueElement {
    static void findUnique(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }
            if((count == 0 )&& (arr[i] != -1)) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,4,2,3,3,1,2};
        int n = 7;
        findUnique(arr);
    }
}
