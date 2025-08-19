import java.util.Scanner;

public class Day05 {
    static int PairSum(int []arr, int target){
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]+arr[j] == target){
                    ans++;
                    System.out.println("{"+arr[i]+", "+arr[j]+"}");
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum : ");
        int target = sc.nextInt();

        System.out.println(PairSum(arr, target));
    }
}
