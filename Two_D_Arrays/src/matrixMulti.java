import java.util.Scanner;

public class matrixMulti {
    public static Scanner sc = new Scanner(System.in);

    static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] multiplication(int[][] arr1, int[][] arr2){
        int n = arr1.length, m = arr2[0].length;
        int[][] ans = new int[n][m];
        if(arr1[0].length != arr2.length){
            System.out.println("Multiplication not possible");
            int[][] arr3 = new int[5][5];
            return arr3;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k <arr1[0].length; k++) {
                    ans[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        return ans;

    }
    static int[][] matrixFormation(int i, int j){
        int[][] arr = new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                arr[k][l] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Tell the dimensions of Matrix 1: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.println();
        System.out.println("Tell the dimensions of Matrix 1: ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();


        int[][] arr1 = matrixFormation(row1, col1);
        int[][] arr2 = matrixFormation(row2, col2);

        int[][] ans = multiplication(arr1, arr2);
        print(arr1);
    }
}
