package AgainStartWithZero.ExceptionHandling;

import java.io.File;
import java.io.FileReader;

public class Class02 {
    static void main() {
        try{
            FileReader file = new FileReader("text.txt");
        }
        catch (Exception e){
            System.out.println("Exception caught : " + e.getMessage());
        }
    }
}
