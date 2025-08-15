import java.util.Scanner;

public class Day02 {
    void trianglePatt(){
        int n = 6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void revTriPatt(){
        int n = 4;
        for(int i=n;i>0;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void recPatt(){
        int n = 3;
        int m = 6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void boxPatt(){
        int n = 4;
        int m = 8;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i == 1 || i == n || j==1 || j == m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void pyramidPatt(){
        int r=4;
        int c=7;
        for(int i =1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void numPatt(){
        int r = 7;
        int c =7;
        for(int i =1;i<=r;i++){
            for(int j=i;j<=c;j++){
                System.out.print(j);
            }
            for(int j =1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void newNumPatt(){
        int r = 4;
        int c = 6;
        for(int i =1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void holNumPatt(){
        int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = i; j < r; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Day02 obj = new Day02();
//        obj.trianglePatt();
//        obj.recPatt();
//        obj.boxPatt();
//        obj.revTriPatt();
//        obj.pyramidPatt();
//        obj.numPatt();
//        obj.newNumPatt();
        obj.holNumPatt();
    }
}
