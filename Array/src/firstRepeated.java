public class firstRepeated {

    static void repeated(int[] arr) {
        int n = arr.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                    System.out.println(ans);
                    return;
                }
            }
        }
        System.out.println(ans);
    }
        public static void main (String[]args){
            int[] arr = {4, 6, 3, 5, 8, 2};
            repeated(arr);

        }

    }