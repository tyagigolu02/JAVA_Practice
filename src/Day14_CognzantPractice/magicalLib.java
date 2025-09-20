package Day14_CognzantPractice;

import java.util.Scanner;

public class magicalLib {
    static int MagicalRows(int [][]arr){
        int magR = 0;
        for(int i=0;i<arr.length;i++){
            int oddSum = 0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2!=0){
                    oddSum+=arr[i][j];
                }
            }
            if(oddSum % 2 == 0){
                magR++;
            }
        }
        return magR;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int r = sc.nextInt();
        System.out.print("Enter columns : ");
        int c = sc.nextInt();

        int [][]arr = new int[r][c];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            System.out.print("[");
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println("]");
        }

        System.out.println(MagicalRows(arr));


    }
}
