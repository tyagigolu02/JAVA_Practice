package Day10_String;
import java.util.*;

public class stringCharInt {
    static void substring(){
        String str = "abcdefghij";
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(5));
    }
    static void alSubStr(){
        String str = "abcd";
        for(int i =0;i<4;i++){
            for(int j=i+1;j<4;j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
//        String s1 = "abc";
//        s1 = s1 + "xyz";
//        System.out.println(s1);
//        s1 += 113;
//        System.out.println(s1);
//        s1 += 'deep';
//        System.out.println(s1);
//        substring();
        alSubStr();
    }
}
