package AgainStartWithZero.MultiThreading;

class Mythread extends Thread{
    @Override
	public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("Mythread run" + i);
        }
    }
}

public class Class01 {
    static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("Main Thread"+ i);
        }
    }
}
