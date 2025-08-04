public class swappingDigits {
    static void swap(int i, int j){
        int temp = i;
        i = j;
        j = temp;
        System.out.println(i);
        System.out.println(j);
    }

    static void swapSum(int i, int j){
        int sum = i+j;
        i = sum - i;
        j = sum - j;
        System.out.println(i);
        System.out.println(j);
    }
    public static void main(String[] args) {
        int i = 94;
        int j = 43;
        swap(i, j);
        swapSum(i, j);
    }
}
