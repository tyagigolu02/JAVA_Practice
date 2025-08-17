import simple.skills.*;

public class appOutside {

    public static void main(String[] args) {
        app obj = new app();
        System.out.println("outside package, non child class : " + obj.str1);
        app3 obj3 = new app3();
        obj3.printFromChildClass();
    }
}
class app3 extends app{  //inheritance
    void printFromChildClass() {
        app3 obj3 = new app3();
        System.out.println("child class se : " +obj3.str1);
    }
}
