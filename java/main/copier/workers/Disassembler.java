package workers;

import java.util.ArrayList;
import java.util.HashMap;

import configurations.config;

public class Disassembler {
    
    public ArrayList<Integer> content;
    public int chunks;
    
    public Disassembler(ArrayList<Integer> content){
        content = content;
        chunks = setChunks();
    }

    public int setChunks() {
        int whole_chunks = content.size() / config.CHUNK_SIZE;
        int remainder = content.size() % config.CHUNK_SIZE;
        if (remainder > 0) {
            whole_chunks += 1;
        } 

        return whole_chunks;
    }

    public HashMap<Integer, ArrayList<Integer>> getChunks() {
        
    }

}
