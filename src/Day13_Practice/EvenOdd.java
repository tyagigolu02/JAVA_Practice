package Day13_Practice;

public class EvenOdd {
    static void evenOdd(){
        int e = 0;
        int o = 0;
        int [] arr = {1,2,5,3,7,9,5,2,0,10,11,19};
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                e++;
            }
            else if(arr[i] % 2 == 1){
                o++;
            }
        }
        System.out.println("Number of even numbers is "+ e +" & Number of odd numbers is "+ o +" .");
    }
    static void main() {
        EvenOdd eo = new EvenOdd();
        eo.evenOdd();
    }
}
