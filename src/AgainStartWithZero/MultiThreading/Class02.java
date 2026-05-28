package AgainStartWithZero.MultiThreading;

abstract class MyRunnThread implements Runnable {

    void add(){
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum += i;
        }
        System.out.println("Sum : "+ sum);
    }

    void setName(String what) {
        Thread.currentThread().setName(what);
    }
}

public class Class02 {
    static void main() {
        MyRunnThread t1 = new MyRunnThread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        t1.run();
        t1.add();
        t1.setName("Bander");
        MyRunnThread t2 = new MyRunnThread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        t2.run();
        t2.add();
        t2.setName("Kutta");
    }
}
