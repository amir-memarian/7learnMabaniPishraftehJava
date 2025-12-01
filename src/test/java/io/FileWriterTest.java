package io;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterTest {

    public static final String FILENAME = "test.txt";
    public static final String SENTENCE = "Hello World";

    @Test
    void should_write_in_a_file() {
        try(FileOutputStream fileOutputStream = new FileOutputStream(FILENAME);
            FileInputStream fileInputStream = new FileInputStream(FILENAME)) {

            fileOutputStream.write(SENTENCE.getBytes(StandardCharsets.UTF_8));

            int read;
            StringBuilder helloWorld = new StringBuilder();
            while ((read =fileInputStream.read()) != -1){
            //    System.out.print((char) read);
                 helloWorld.append((char) read);
            }

            Assertions.assertThat(helloWorld.toString()).isEqualTo("Hello World");

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
