package Cognizant_Practice;


public class penSystem {
    static int count(int [] arr){
        int len = arr.length;
        int count = 0;
        for(int i=0;i<len-1;i++){
            if(arr[i] % 2 != 0 && arr[i+1] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    static void main() {
        int [] arr = {1,2,1,6,10,9};
        int result = count(arr);
        System.out.println(result);
    }
}
