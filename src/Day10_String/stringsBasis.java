package Day10_String;
import java.util.*;

public class stringsBasis {

    public static void main(String[] args) {
        String str1 = "College main chalo";
        String str2 = "College mein chalo";
//        System.out.println(str1);

        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
//        String s1 = sc.nextLine();
//        System.out.println(s1);
//        int len = str1.length();
//        System.out.println(len);
//        char ch = str1.charAt(3);
//        System.out.println(ch);
        int idx = str1.indexOf("m");
//        System.out.println(idx);
//        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("chalo"));
        System.out.println(str1.startsWith("Coll"));
        System.out.println(str1.endsWith("shu"));
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str1.concat(str2));

    }
}
