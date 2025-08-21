import java.util.Arrays;

public class Day07 {
    static void sortZerosAndOnes(int [] arr){
        int n = arr.length;
        int zeros = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeros){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
    }
    static void sortArrayWithTwoPointer(int [] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    swapInArray(arr,i,j);
                }
            }
        }
    }

    static void sortEvenOdd(int [] arr){
        int n = arr.length;
        int left = 0,right=n-1;
        while(left<right){
            if(arr[left] % 2 == 1 && arr[right] % 2 ==0){
                swapInArray(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }

    static void sortSqaure(int [] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
    }

    static void swapInArray(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
//        int [] arr = {1,0,1,0,1,0,1,0,1,1,0,0,0,0,0};
//        int [] arr = {1,2,5,7,9,3,6,4,2,1,5,5};
        int [] arr = {-10,2,5,4,-5,-10,12};
//        System.out.print("Original Array : ");
//        printArray(arr);
//        System.out.println(" ");
//        sortZerosAndOnes(arr);
//        sortArrayWithTwoPointer(arr);
//        sortEvenOdd(arr);
        sortSqaure(arr);
        System.out.print("Sorted Array : ");
        printArray(arr);
    }
}
