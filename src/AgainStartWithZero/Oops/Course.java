package AgainStartWithZero.Oops;

public class Course {
    String name;
    int price;
    float duration;
    String teacherName;

    Course (){
        this("Unknown",000,0.00f,"Unknown");
    }
    Course (String naam, int paisa, float samay, String masterJi){
        this.name = naam;
        this.price = paisa;
        this.duration = samay;
        this.teacherName = masterJi;
    }
    void run(Course c){
        System.out.println("Course "+c.name+" price "+c.price+" duration "+c.duration+" mentor "+c.teacherName);
    }

    void hello(){
        System.out.println("hello Course "+name+" price "+price+" duration "+duration+" mentor "+teacherName);
        run(this);
    }

    static void main() {
        Course cs1 = new Course();
        Course cs2 = new Course("Golu",200,2.00f,"Virat Kohli");
        cs1.hello();
        cs2.hello();
    }
}
