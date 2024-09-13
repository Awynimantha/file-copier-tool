package java.main.copier.models;

import java.io.FileNotFoundException;
import java.util.ArrayList;

class File {
    private String location;
    private String name;
    private ArrayList<Integer> content;

    public File(String location, String sourceName, ArrayList<Integer> content) {
        this.location = location;
        this.name = name;
        this.content = 
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

    public ArrayList<Integer> readContent() throws  FileNotFoundException{
        
    }
    

    

}