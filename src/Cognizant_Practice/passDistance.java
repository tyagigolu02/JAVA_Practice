package Cognizant_Practice;

import java.util.Scanner;

public class passDistance {
    static int distance(String s){
        int n = s.length();
        if(n<=1) return 0;
        int fDist = 0;
        int lDist = 0;
        char f = s.charAt(0);
        for(int i=n-1;i>0;i--){
            if(s.charAt(i) != f){
                fDist = i;
                break;
            }
        }

        char l = s.charAt(n-1);
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) != l){
                lDist = n-1-i;
                if(fDist<lDist){
                    fDist = lDist;
                }
                break;
            }
        }
        return fDist;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int result =  distance(s);
        System.out.println(result);
    }
}
