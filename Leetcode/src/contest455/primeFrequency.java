package contest455;

import java.util.ArrayList;

public class primeFrequency {

    static boolean isPrime(int x){
        if(x == 1) return false;
        if(x == 2) return true;
        for (int i = 2; i <= x/2; i++) {
            if(x % i == 0) return false;
        }
        return true;
    }
    static boolean isPrimeFrequency(int[] arr){
        ArrayList<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j] && arr[j] >= 0) {
                    count++;
                    arr[j] = -1;
                }
            }
            ans.add(isPrime(count));
        }
        for(boolean an: ans){
            if(an) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,3,6,3,3};
        System.out.println(isPrimeFrequency(arr));
    }
}
