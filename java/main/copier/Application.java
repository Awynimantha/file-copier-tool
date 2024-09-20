import files.*;
import java.io.IOException;



public class Application {
    public static void main(String[] args) {
        try{
            File file = new File("/home/yasiru/Desktop/test.c","");
            System.out.println(file.getSize());
        } catch (IOException e) {
            System.out.println(e);
        }
    }    
}
