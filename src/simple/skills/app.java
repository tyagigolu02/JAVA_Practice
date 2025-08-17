package simple.skills;

public class app {
    public String str1 = "billu sandha tumhari jail se faraaar......";

    void printFromClass(){
        System.out.println("within class : "+ str1);
    }

    public static void main(String[] args) {
        app obj = new app();
        obj.printFromClass();
        System.out.println(obj.str1);
        app2 obj1 = new app2();
        obj1.printOutClass();
    }
}
class app2{
    void printOutClass(){
        app obj = new app();
        System.out.println("within package , outside class : "+ obj.str1);
    }
}
