import java.util.Scanner;

public class Day06 {
    static void swapWithTemp(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+" b = "+b);
    }
    static void swap(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+a+" b = "+b);
    }
    static int [] reverseArray(int [] arr, int i, int j){
        int n = arr.length;
        int [] ans = new int[n];
//        for(int i=n-1;i>=0;i--){
//            ans[j++] = arr[i];
//        }
        while(i>=0){
            ans[j++] = arr[i--];
        }
        return ans;
    }
    static void swapInArray(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArrayUsingArray(int [] arr, int i, int j){

        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
//    static int[] rotateArray(int [] arr,int k){
//        int n = arr.length;
//        k = k%n;
//        int [] ans = new int[n];
//        int j =0;
//        for(int i=n-k;i<n;i++){
//            ans[j++] = arr[i];
//        }
//        for(int i=0;i<n-k;i++){
//            ans[j++] = arr[i];
//        }
//        return ans;
//    }
    static void rotateArray(int [] arr, int k){
        int n = arr.length;
        k = k%n;
        reverseArrayUsingArray(arr,0,n-k-1);
        reverseArrayUsingArray(arr,n-k,n-1);
        reverseArrayUsingArray(arr, 0, n-1);
    }

    static int[] makeFreqArray(int [] arr){
        int [] freq = new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }

//    static int [] searchElement(int [] arr, int num){
//        //using frequency array
//
//    }

    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first number : ");
//        int a = sc.nextInt();
//        System.out.print("Enter second number : ");
//        int b = sc.nextInt();
//
        int [] arr = {1,4,7,6,9};
//        swapWithTemp(a, b);
//        swap(a,b);
//        int [] ans = reverseArray(arr);
//        reverseArrayUsingArray(arr);
//        printArray(arr);
//        System.out.print("Enter steps : ");
//        int k = sc.nextInt();
//        int [] ans = rotateArray(arr,k);
//        rotateArray(arr,k);
//        printArray(arr);
        int [] freq = makeFreqArray(arr);
        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();
        while(q>0){
            System.out.print("Enter number to be search : ");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }
    }
}
