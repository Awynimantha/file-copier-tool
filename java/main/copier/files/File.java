package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class File {
    private String location;
    private String name;
    private ArrayList<Character> content;

    public File(String location, String sourceName) throws IOException {
        this.location = location;
        this.name = sourceName;
        this.content =  readContent();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Character> getContent() {
        return content;
    }

    public void setContent(ArrayList<Character> content) {
        this.content = content;
    }

    public ArrayList<Character> readContent() throws  IOException {
        try{
            FileReader fileReader = new FileReader(location);
            FileInputStream stream = fileReader.getStreamReader();
            char i = (char) -1;
            ArrayList<Character> characters = new ArrayList<Character>();
            do {
                i = (char)stream.read();
                System.out.println(i);
                characters.add(i);
            } while(i != (char)-1);

            return characters;

        } catch(IOException e) {
            throw e;
        }
        
    }
    

    

}