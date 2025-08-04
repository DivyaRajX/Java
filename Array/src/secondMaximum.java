public class secondMaximum {
    static void secondMax(int[] arr){
        int lar = Integer.MIN_VALUE, sec_lar = 0;
        for(int i: arr){
            if(i > lar) {
                int temp = lar;
                lar = i;
                sec_lar = temp;
            }
            else if(i<lar && i > sec_lar) sec_lar = i;
        }
        System.out.println(sec_lar);
    }
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};
        secondMax(arr);
    }
}
