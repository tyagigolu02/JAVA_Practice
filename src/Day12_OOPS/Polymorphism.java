package Day12_OOPS;

class AB{
    int age;
    String name;
    void show(int age){
        System.out.println(age);
    }
}
class BA extends AB{
    void show(int age, String name){
        System.out.println(name + " "+ age);
    }
}

public class Polymorphism {

    public static void main() {

        BA obj2 = new BA();
        obj2.show(12);
        obj2.show(13,"golu");
    }
}
