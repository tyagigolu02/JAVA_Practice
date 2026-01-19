package Cognizant_Practice;

import java.util.Scanner;

public class magicalLib {
    static int magLib(int [][] arr){
        int magR = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] % 2 != 0){
                    sum += arr[i][j];
                }
            }
            if(sum % 2 == 0){
                magR++;
            }
        }
        return magR;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int [][] arr = new int[a][b];
        System.out.println("Enter elements : ");

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(magLib(arr));
    }
}
