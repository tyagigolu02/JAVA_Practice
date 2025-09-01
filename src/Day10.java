import java.util.ArrayList;
import java.util.Collections;

public class Day10 {
    static void rverse(ArrayList<Integer>l1){
        int i =0 , j= l1.size()-1;
        while(i<j){
            Integer temp = Integer.valueOf(l1.get(i));
            l1.set(i, l1.get(j));
            l1.set(j, temp);
            i++;
            j--;
        }
    }
//    static void sortedArray(ArrayList<Integer>l1){
//        Collections.sort(l1);
//        System.out.println("Sorted array : " +  l1);
//    }
    static void sortedArrayString(ArrayList<String>l2){
        Collections.sort(l2);
        System.out.println("Sorted array : " +  l2);
    }

    public static void main(String[] args) {
        //wrapper class
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//        Float f = Float.valueOf(4.5f);
//        System.out.println(f);

        //arraylist class
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(56);
        l1.add(64);
        l1.add(999);
        l1.add(61);
        l1.add(69);


        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("golu");
        l2.add("deepanshu");
        l2.add("tyagi");
        l2.add("sonu");
        l2.add("deepu");
        l2.add("deepak");

//        System.out.println(l1.get(0));
//        for(int i=0;i<l1.size();i++){
//            System.out.print(l1.get(i) + " ");
//        }
        System.out.println(l1);
//
//        l1.add(1,23);
//        System.out.println(l1);
//
//        l1.set(1,100);
//        System.out.println(l1);
//
//        l1.remove(1);
//        System.out.println(l1);
//
//        l1.remove(Integer.valueOf(999));
//        System.out.println(l1);
//
//        System.out.println(l1.remove(Integer.valueOf(999)));
//
//        System.out.println(l1.contains(Integer.valueOf(56)));
//
//        ArrayList l = new ArrayList();
//        l.add("Golu");
//        l.add(76);
//        l.add(true);
//        System.out.println(l);
//        rverse(l1);
//        System.out.println(l1);
//        sortedArray(l1);
        System.out.println(l2);
        sortedArrayString(l2);
    }
}
