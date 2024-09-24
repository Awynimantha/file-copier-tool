package workers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import configurations.config;

public class Disassembler {
    
    public ArrayList<Integer> content;
    public int chunks;
    
    public Disassembler(ArrayList<Integer> content){
        this.content = content;
        this.chunks = setChunks();
    }

    public int setChunks() {
        int whole_chunks = content.size() / config.CHUNK_SIZE;
        int remainder = content.size() % config.CHUNK_SIZE;
        if (remainder > 0) {
            whole_chunks += 1;
        } 

        return whole_chunks;
    }

    public HashMap<Integer, List<Integer>> getChunks() {
       int l_boundary = 0;
       int size = content.size();
       HashMap<Integer, List<Integer>> chunks = new HashMap<Integer, List<Integer>>();
       int i = 0;
       for( i = 0; i!=this.chunks-1; i++) {
            chunks.put(i, content.subList(l_boundary, l_boundary + config.CHUNK_SIZE));
            l_boundary = l_boundary + config.CHUNK_SIZE;
       }
       chunks.put(i, content.subList(l_boundary, size));
       return chunks;
    }

}
