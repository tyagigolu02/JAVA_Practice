import java.util.Scanner;

class Algebra{

    Algebra(){
        System.out.println("bandar ha tu..........");
    }
    int add(int a, int b){
        int ans = a+b;
        return ans;
    }
}


public class Day04 {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.print("Sum : ");
//        int ans = obj.add(a, b);
//        System.out.println(ans);

        System.out.println(Math.sqrt(89));
        System.out.println(Math.max(5, 45));
        System.out.println(Math.min(5.5, 5.6));
        System.out.println(Math.absExact(5));

    }
}
