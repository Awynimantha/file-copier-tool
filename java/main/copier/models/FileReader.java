package java.main.copier.models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {
    private FileInputStream reader;
    private String sourceName;
    
    public FileReader(String sourceName) throws FileNotFoundException{
        try{
            this.reader = new FileInputStream(sourceName);
        } catch(FileNotFoundException e) {
            System.out.println("Failed to read the file: "+sourceName);
        }
        this.sourceName  = sourceName;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName() {
        this.sourceName = sourceName;
    }

    public FileInputStream getStreamReader() {
        return reader;
    }
    
}
