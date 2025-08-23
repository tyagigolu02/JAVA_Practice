import java.util.Scanner;

public class Day08 {
    static void preFixSum(int [] arr, int l, int r){
        int n = arr.length;

        for(int i=l;i<r;i++){
            arr[i] = arr[i-1] + arr[i];
        }
    }
    static int[] prefixSum(int [] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,5,7,6,9,2,1,3};
        printArray(arr);
//        System.out.println();
//        System.out.print("Enter starting index : ");
//        int l = sc.nextInt();
//        System.out.print("Enter ending index : ");
//        int r = sc.nextInt();
//        preFixSum(arr,l,r);
//        printArray(arr);
        int [] prefSum = prefixSum(arr);
        System.out.print("Enter the number of queries :");
        int q = sc.nextInt();

        while(q-->0){
            System.out.print("Enter range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefSum[r] - prefSum[l-1];
            System.out.println("Sum is "+ ans);
        }

    }
}
