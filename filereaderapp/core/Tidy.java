package filereaderapp.core;

import java.util.*;
import java.io.*;

public class Tidy {

    public void analyse(String srcFile) throws FileNotFoundException, IOException {



        Reader reader = new FileReader(srcFile);
        BufferedReader br = new BufferedReader(reader);
        List<String> listList = new LinkedList<>();
        List<String> listListTwo = new LinkedList<>();
        String line = "";

        while(line != null) {
            line = br.readLine();
        }
        
        reader.close();
    

    }
    
}
