package com.sujay;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;



public class FileReaderSourceTest {
    @Test
    public void testFileReaderSource() throws Exception{
        File file = new File("src/test/resources/samplefile.txt");
        assertTrue(file.exists());
        ReaderSource reader = new FileReaderSource(file);
        String line;
        int lineNumber = 1;
        while((line = reader.getLine(lineNumber++, new Janitor())) != null){
            assertNotNull(line);
            System.out.println(line);

        }

    }
}
