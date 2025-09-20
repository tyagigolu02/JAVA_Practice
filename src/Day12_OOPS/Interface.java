package Day12_OOPS;

interface A{
    int number = 25; // final , static
    String name = "Golu";
    void show();  // public , abstract
    void output();
    default void names(){
        System.out.println("Names");
    };
}

interface C extends A{
    void add();

}

class B implements A,C{  // use implements for interface
    public void show(){
        System.out.println("SHOW B");
    }
    public void output(){
        System.out.println("OUTPUT B");
    }
    public void add(){
        System.out.println("ADD B");
    }
}
public class Interface {
    public static void main() {
//        A obj1 = new A(); // not create object of interface
        B obj = new B();
        obj.show();
        obj.output();
        obj.add();
        System.out.println(A.number);
        System.out.println(C.number);
        obj.names();
    }
}
