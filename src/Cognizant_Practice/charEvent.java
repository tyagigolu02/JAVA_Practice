package Cognizant_Practice;

import java.util.Scanner;

public class charEvent {
    static int sum(int n){
        long mod = 1000000007L;
        long normal = ((long)n*(n+1))/2;
        long bonus = (n/5)*4;
        long total = (normal + bonus)%mod;

        return (int)total;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println(result);
    }
}
