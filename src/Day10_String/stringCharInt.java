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
    static void builder(){
        StringBuilder str = new StringBuilder("Hello");
//        str.append(" Tyagi ");          //append
//        System.out.println(str);
//        str.setCharAt(0, 'M');//set character
//        System.out.println(str);
//        str.append(true);               //append
//        System.out.println(str);
//        str.insert(0,"Hey");  //insert
//        System.out.println(str);
//        str.deleteCharAt(5);      //delete
//        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(0,3);
        System.out.println(str);

    }

    static void toggleU2L(){
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
//        System.out.println(str);
        for(int i=0;i<str.length();i++){
            boolean flag = true;
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            int asci = (int)ch;
            if(asci >= 97){
                flag = false;
            }
            if(flag == true){
                asci += 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
            else{
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
    static void toggleL2U(){
        String str = "GolU";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            boolean flag = true;
            if(ch == ' ') continue;
            int asci = (int)ch;
            if(asci >= 97) flag = false;
            if(flag == true){
                asci += 32;
                char dh = (char)asci;
                str = str.substring(0,i)+dh+str.substring(i+1);
            }
            else{
                asci -= 32;
                char dh = (char)asci;
                str = str.substring(0,i)+dh+str.substring(i+1);
            }
        }
        System.out.println(str);
    }

    static void palindrome(){
        String str1 = "NAMAN";
        String str2 = "DEEP";
        StringBuilder gtr = new StringBuilder(str1);
        String s = gtr + "";
        if(gtr.equals(str1)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("N0t palindrome");
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
//        alSubStr();
//        builder();
//        toggleU2L();
//        toggleL2U();
        palindrome();
    }
}
