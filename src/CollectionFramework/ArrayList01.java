package CollectionFramework;

import java.util.ArrayList;

public class ArrayList01 {
    void arrayList(){
        //create arrayList
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        System.out.println(cars);
        //add
        cars.add("BMW");
        System.out.println(cars);
        //remove
        cars.remove("BMW");
        System.out.println(cars);
        //size
        System.out.println(cars.size());
//        // iterator
//        System.out.println(cars.iterator());
        // list specific methods
        System.out.println(cars.get(1));  // get
        cars.set(2,"Omini");  // set  --> replace
        System.out.println(cars);
        cars.add("Ford");
        cars.add("Toyota");
        System.out.println(cars);
        System.out.println(cars.indexOf("Toyota"));  // indexOf  --> find first index of element
        System.out.println(cars.subList(2,3));

    }
    static void main(String[] args) {
        ArrayList01 obj = new ArrayList01();
        obj.arrayList();
    }
}
