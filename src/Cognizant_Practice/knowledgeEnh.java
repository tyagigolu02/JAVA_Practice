package Cognizant_Practice;
import java.util.Arrays;
public class knowledgeEnh {
    static int count(int [] arr,int hours){
        int n = arr.length;
        int co = 0;
        int time = 0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(time + arr[i] <= hours){
                time += arr[i];
                co ++;
            }
            else{
                break;
            }
        }
        return co;
    }
    static void main() {
        int [] arr = {4,2,3,1};
        int hours = 5;
        int result = count(arr,hours);
        System.out.println(result);

    }
}
