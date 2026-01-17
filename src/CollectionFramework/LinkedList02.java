package CollectionFramework;

import java.util.LinkedList;

public class LinkedList02 {
    static void main() {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Bander");
        list.addLast("Kutta");
        list.addFirst("saannd");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(1));
    }
}
