package com.sujay;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringReaderSourceTest {

    @Test
    public void testStringReaderSource() throws Exception{
        final String someText = "The quick brown fox jumps over the lazy dog\n"+
                "The quick brown fox jumps over the lazy dog\n" +
                "The quick brown fox jumps over the lazy dog\n";

        ReaderSource reader = new StringReaderSource(someText);
        String line;
        int lineNumber = 1;
        while((line = reader.getLine(lineNumber++, new Janitor())) != null){
            assertNotNull(line);
            System.out.println(line);

        }

    }
}
