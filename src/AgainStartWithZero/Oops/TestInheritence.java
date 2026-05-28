package AgainStartWithZero.Oops;

public class TestInheritence {
    static void main() {
        Animal a = new Animal();
        a.eat();
        a.sound();
        a.fly();

        Dog  d = new Dog();
        d.eat();
        d.sound();
        d.fly();

        Cat c = new Cat();
        c.eat();
        c.sound();
    }
}
