package io;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterTest {
    @Test
    void should_write_in_a_file() {
        try(FileOutputStream fileOutputStream = new FileOutputStream("test.txt")) {
            fileOutputStream.write("Hello world".getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            System.out.println("there is a problem with test.txt file");
            e.printStackTrace();
        }

        /*
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream = new FileOutputStream("test.txt");
            fileOutputStream.write("Hello world".getBytes(StandardCharsets.UTF_8));

        } catch (FileNotFoundException e) {
            System.out.println("the file test.txt dose not exist");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                //assert fileOutputStream != null;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */
    }
}
