package Day12_OOPS;

abstract class Animal {
    Animal(){
        System.out.println("Animal");
    }
    abstract void eat();
    abstract void drink();// abstract method can not have body
}
class Cat extends Animal {
    Cat(){
        super();
        System.out.println("Cat");
    }
    public void eat() {
        System.out.println("kha lo bhai");
    }
    public void drink() {
        System.out.println("pi lo bhaai");
    }
}
public class Abstraction {
    public static void main() {
//        Animal obj1 = new Animal();   // not use for abstract class
        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
    }
}
