package AgainStartWithZero.ExceptionHandling;

public class Class01 {
    static void main() {
        try{
            int a = 10/0;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally always working");
        }
    }
}
