package day4app.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.io.InputStream;
import java.io.OutputStream;

// java IOMain <src> <dest>

public class IOMain {

    public static void main(String[] args) {

        String srcFile = args[0];
        String dstFile = args[1];

        // 1K byte buffer
        byte[] buff = new byte[1024];
        int size =0;

        try {
            InputStream is = new FileInputStream(srcFile);
            System.out.printf("%s file opened", srcFile);

            OutputStream os = new FileOutputStream(dstFile);
            
            while (size >= 0) {
                size = is.read(buff);
                System.out.printf("read:%d\n)");
            }

            is.close();

            os.flush();
            os.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.printf("Error: %s\n", ex.getMessage());
        }

    }
    
}
