public class Day05ArrayManupulation {
    static int uniqueNum(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 8, 6};
        System.out.println(uniqueNum(arr));
    }
}
