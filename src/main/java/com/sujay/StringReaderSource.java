package com.sujay;

import java.io.Reader;
import java.io.StringReader;

/**
 * StringReaderSource reads from a String line by line.
 */
public class StringReaderSource extends AbstractReaderSource {
    final String string;

    public StringReaderSource(final String string){
        this.string = string;
    }

    @Override
    public Reader getReader() {
        return new StringReader(this.string);
    }
}
