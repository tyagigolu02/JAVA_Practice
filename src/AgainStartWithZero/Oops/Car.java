package AgainStartWithZero.Oops;

public class Car {
    String brand;
    String name;
    int speed;
    int price;

    public void run(){
        System.out.println(name + " which is made by " +brand+ " ,are running at speed "+speed+" km/h");
    }

    static void main() {
        Car car1 = new Car();
        car1.speed = 5;
        car1.price = 100;
        car1.name = "Lambo";
        car1.brand = "Ford";
        car1.run();

    }
}
