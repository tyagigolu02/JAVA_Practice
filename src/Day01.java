import java.util.Scanner;

public class Day01 {
    void countDigits() {
        int num = 12346;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
    void sumDigits(){
        int num = 123456;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /=10;
        }
        System.out.println(sum);
    }
    void numRever(){
        int n = 123;
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n /=10;
        }
        System.out.println(rev);
    }
    void sumSer(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for(int i = 0;i<=n;i++){
            if(i%2==0){
                ans -= i;
            }
            else{
                ans +=i;
            }
        }
        System.out.println(ans);
    }
    void fac(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
            System.out.print(fact + " ");
        }
    }
    void poOf(){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        int ans = 1;
        for(int i=1;i<=b;i++){
            ans = a*a;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Day01 obj = new Day01();
//        obj.countDigits();
//        obj.sumDigits();
//        obj.numRever();
//        obj.sumSer();
//        obj.fac();
        obj.poOf();
    }
}
