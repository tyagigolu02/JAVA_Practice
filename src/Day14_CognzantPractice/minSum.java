package Day14_CognzantPractice;
import java.util.Scanner;

public class minSum {

    static int calculateSum(int[] A, int[] B) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[i];
        }
        return sum;
    }

    static int findMinSum(int[] A, int[] B) {
        int n = A.length;
        int minSum = calculateSum(A, B);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;

                int temp1 = B[i];
                B[i] = B[j];
                B[j] = temp1;

                int newSum = calculateSum(A, B);
                minSum = Math.min(minSum, newSum);

                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        System.out.println("Enter array A elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter array B elements:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        int result = findMinSum(A, B);
        System.out.println("Minimum Sum = " + result);

    }
}
