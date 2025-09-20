package Day13_Practice;

public class SecondLargest {
    static int secoLarg(){
        int [] arr = {1,2,5,3,7,9,5,2,0,10,11,19};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && smax != max){
                smax = arr[i];
            }
        }
        return smax;
    }

    static void main() {
        SecondLargest obj = new SecondLargest();
        System.out.println(obj.secoLarg());
    }
}
