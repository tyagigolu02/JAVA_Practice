package Day13_Practice;

import java.util.Scanner;

public class findMaxMin {

    static void MaxMin() {
        int [] arr = {1,2,5,3,7,9,5,2,0,10,11,19};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max + " , " + min);
    }
    public static void main() {
        findMaxMin mm = new findMaxMin();
        mm.MaxMin();
    }
}
