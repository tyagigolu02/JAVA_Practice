package Cognizant_Practice;
// min sum of products of two array
public class minSum {
    public static void sort(int[] A){
        int n = A.length;
        for(int i=0;i<n;i++){
            for(int k=i+1;k<n;k++){
                if(A[i]>A[k]){
                    int temp = A[i];
                    A[i]=A[k];
                    A[k]=temp;
                }
            }
        }
    }

    public static int mSum(int[] A, int[] B){
        int sum = 0;
        int n = A.length;
        for(int i=0;i<n;i++){
            sum += A[i]*B[n-1-i];
        }
        return sum;
    }

    static void main() {
        minSum obj = new minSum();

        int[] A = {1,3,2};
        int[] B = {3,5,4};
        int result = obj.mSum(A,B);
        System.out.println(result);
        obj.sort(A);
        obj.sort(B);
        int result1 = obj.mSum(A,B);
        System.out.println(result1);

    }
}
