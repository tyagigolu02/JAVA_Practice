package AgainStartWithZero.Oops;

/*  inheritance
 -----------------------------------------------------------------------
|       Species --> Animal --> Dog ======> multilevel inheritance       |
|                                                                       |
|       Animal --> Dog ======> simple                                   |
|                                                                       |
|       Animal --> Dog, Animal --> Cat  =======> hierarchy inheritance  |
 -----------------------------------------------------------------------
 */

class Species {
    void fly(){
        System.out.println("flying");
    }
}

public class Animal extends Species {
    String bread;
    String name;
    String age;

    void eat(){
        System.out.println("Eating");
    }

    void sound(){
        System.out.println("Sound");
    }

    void fly(){
        System.out.println("not supported");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Making sound bhau bhau.");
    }
}

class Cat extends Animal {
    @Override
    void sound(){
        System.out.println("Making sound meow meow.");
    }
    void eat(){
        System.out.println("not eating");
    }
}
