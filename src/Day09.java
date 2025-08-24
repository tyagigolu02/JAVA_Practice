import java.util.Scanner;

public class Day09 {
    static void printArray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    static void mul(int [][] arr1, int r1, int c1,int [][] arr2, int r2, int c2){
        if(c1 != r2){
            System.out.println("Pls enter valid data.");
            return;
        }
        int [][] result = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                result [i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        printArray(result);
    }

    static void sum(int [][] arr1, int r1, int c1,int [][] arr2, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Pls enter valid data.");
            return;
        }

        int[][] result = new int[r1][c1];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println(" ");
        }
        printArray(result);
    }

//    static int [][] transpose(int [][] arr,int r,int c){
//        int [][] ans = new int[c][r];
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                ans[i][j] = arr[j][i];
//            }
//        }
//        return ans;
//    }
    static void transpose(int [][] arr1, int r, int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }
        printArray(arr1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of rows : ");
//        int r = sc.nextInt();
//        System.out.print("Enter the number of column : ");
//        int c = sc.nextInt();
//        int [][] arr = new int[r][c];
//        System.out.println("Enter " + r*c + " elements of Array : ");
//
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.print("Row of first array : ");
//        int r1 = sc.nextInt();
//        System.out.print("Column of first array : ");
//        int c1 = sc.nextInt();
//
//        int [][] arr1 = new int[r1][c1];
//        System.out.print("Enter " + r1*c1 +" element of first array : ");
//        for (int i = 0; i < r1; i++) {
//            for (int j = 0; j < c1; j++) {
//                arr1[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.print("Row of Second array : ");
//        int r2 = sc.nextInt();
//        System.out.print("Column of second array : ");
//        int c2 = sc.nextInt();
//
//        int [][] arr2 = new int[r2][c2];
//        System.out.print("Enter " + r2*c2 +" element of second array : ");
//        for (int i = 0; i < r2; i++) {
//            for (int j = 0; j < c2; j++) {
//                arr2[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Original Array.");
//        printArray(arr);

        int[][] arr1 = {
                {1, 2},
                {3, 4}
        };
        int[][] arr2 = {
                {5, 6},
                {7, 8}
        };

//        System.out.println("A : ");
//        printArray(arr1);
//        System.out.println("B : ");
//        printArray(arr2);
//        System.out.print("Sum of two arrays : ");
//        sum(arr1,2,2,arr2,2,2);
//        mul(arr1,2,2,arr2,2,2);
//        int [][] ans = transpose(arr1,2,2);
//        printArray(ans);
        transpose(arr1,2,2);

    }
}
