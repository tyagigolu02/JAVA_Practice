package Day11_String;

import java.util.Arrays;

public class Basics {
    static void substr(){
        String str1 = "Deepanshu";
        for(int i=0;i<str1.length();i++){
            for(int j=i;j<str1.length();j++){
                System.out.print(str1.substring(i,j+1) + " ");
            }
            System.out.println();
        }
    }

    static void sumOfString(){
        int sum =0;
        String str = "123";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String sub = str.substring(i,j+1);
                sum += Integer.parseInt(sub);
            }
        }
        System.out.println(sum);
    }

    //StringBuilder
    static void stringBuilder(){
        StringBuilder sb = new StringBuilder("Deepanshu"); // naam ki jgh capacity bhi de skte hai
        System.out.println(sb);
        sb.append(" Tyagi"); //piche se add krna
        System.out.println(sb);
        System.out.println(sb.length() +" "+ sb.capacity());
        sb.setCharAt(0,'G');
        System.out.println(sb);
        String t = sb.toString();
        System.out.println(t);
        sb.delete(0,9);
        System.out.println(sb);
    }

    static void reverse(String s){
        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
        int i=0, j=sb.length()-1;
        while(i<=j){
           char temp1 = sb.charAt(i);
           char temp2 = sb.charAt(j);
           sb.setCharAt(i,temp2);
           sb.setCharAt(j,temp1);
           i++;
           j--;
        }
        System.out.println(sb);
    }

    static void change(String s){
        StringBuilder sb = new StringBuilder(s);
//        sb.deleteCharAt(1);
//        sb.insert(1,'i');
        sb.delete(0,2);
        sb.insert(0,'J');
        sb.insert(1,'e');
        System.out.println(sb);
    }

    static boolean areAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    static char mostFreqChar(String s1){ //brute force
        int n =  s1.length();
        int maxfreq = -1;
        char ans = s1.charAt(0);
        for(int i=0;i<n;i++){
            int freq = 1;
            char ch = s1.charAt(i);
            for(int j=i+1;j<n;j++){
                if(s1.charAt(j) == ch){
                    freq ++;
                }
                if(freq >= maxfreq){
                    maxfreq = freq;
                    ans = ch;
                }
                else if(freq == maxfreq && ch <ans){
                    ans = ch;
                }
            }
        }
        return ans;
    }

    static void mostFreqCharSorting(String s1){ // use sorting --sliding window
        char [] ch1 = s1.toCharArray();
        Arrays.sort(ch1);

        int n = s1.length();
        int maxFreq = -1;
        char ans = s1.charAt(0);

        int i =0, j=0;
        while(j<n){
            if(ch1[i] == ch1[j]){
                j++;
            }
            else{
                int freq = j-i;
                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = ch1[i];
                }
                i = j;
            }
        }
        int freq = j-i;
        if(freq > maxFreq){
            maxFreq = freq;
            ans = ch1[i];
        }
    }


    static boolean palindrome(String s){
        int j = s.length()-1;
        int i = 0;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    



    public static void main(String[] args) {
//        char []ch = {'G','O','L','U'};
//        for(char c:ch){
//            System.out.print(c);
//        }
//        substr();
//        sumOfString();
//        stringBuilder();
//        String s = "Deep";
//        reverse();
        String s1 = "anagram";
        String s2 = "nagaram";
        String str = "markram";
//        change(s);
//        System.out.println(areAnagram(s1,s2));
//        System.out.println("Most Freq Char " + mostFreqChar(s1));
//        System.out.println(palindrome(str));

        mostFreqCharSorting(s1);
    }
}
