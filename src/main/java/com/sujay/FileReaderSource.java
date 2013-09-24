package com.sujay;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderSource extends AbstractReaderSource{
    private File file;


    public FileReaderSource(final File file){
        this.file = file;
    }

    @Override
    public Reader getReader() {
        try {
            return new FileReader(this.file);
        }catch(IOException ioe){
            throw new RuntimeException(ioe);
        }

    }
}
