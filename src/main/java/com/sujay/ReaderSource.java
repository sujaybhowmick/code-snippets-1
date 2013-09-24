package com.sujay;

import java.io.Reader;

public interface ReaderSource extends HasCleanup {
    public String getLine(int lineNumber, final Janitor janitor);

    public void cleanup();

    public Reader getReader();
}
