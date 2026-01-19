package Cognizant_Practice;

public class libraryExpo {
    static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    static int collectBooks(int limit,int []arr){
        int total = 0;
        for(int i=0;i<=arr.length;i++){
            if(isPrime(i)){
                int avBooks = arr[i-1];
                if(avBooks > limit){
                    total += limit;
                }
                else{
                    total += avBooks;
                }
            }
        }
        return total;
    }
    static void main() {
        int [] arr = {10,2,5,20,1};
        int limit = 3;

        System.out.println(collectBooks(limit,arr));
    }
}
