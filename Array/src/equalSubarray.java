public class equalSubarray {
    static int sum(int[] arr){
        int sum = 0;
        for(int i: arr) sum+=i;
        System.out.println(sum);
        return sum;
    }

    static boolean isPartition(int[] arr) {
        int n = arr.length, pre = 0;
        int t = sum(arr);
        for (int i : arr) {
            pre += i;
            int suf = t - pre;
            if (pre == suf) {
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isPartition(arr));
    }
}
