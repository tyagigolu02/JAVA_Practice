package AgainStartWithZero.Collection.List;


import java.util.*;

public class ArrayList {

    static void main() {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("List is : " + list);
        list.remove(0);
        System.out.println("List is : " + list);
        list.clear();
        System.out.println("List is : " + list);

    }
}
