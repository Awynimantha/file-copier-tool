import files.*;
import workers.Disassembler;

import java.io.IOException;



public class Application {
    public static void main(String[] args) {
        try{
            File file = new File("/home/yasiru/Downloads/1.mp4","");
            System.out.println(file.getContent());
            Disassembler disassembler = new Disassembler(file.getContent());
            System.out.println(disassembler.getChunks());
        } catch (IOException e) {
            System.out.println(e);
        }
    }    
}
