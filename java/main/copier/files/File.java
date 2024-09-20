package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class File {
    private String location;
    private String name;
    private ArrayList<Integer> content;

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

    public ArrayList<Integer> getContent() {
        return content;
    }

    public void setContent(ArrayList<Integer> content) {
        this.content = content;
    }

    public float getSize() {
        float val = content.size();
        return val;
    }

    public ArrayList<Integer> readContent() throws  IOException {
        try{
            FileReader fileReader = new FileReader(location);
            FileInputStream stream = fileReader.getStreamReader();
            int i = -1;
            ArrayList<Integer> bytes = new ArrayList<Integer>();
            do {
                i = stream.read();
                bytes.add(i);
            } while(i != -1);

            return bytes;

        } catch(IOException e) {
            throw e;
        }
        
    }
    

    

}