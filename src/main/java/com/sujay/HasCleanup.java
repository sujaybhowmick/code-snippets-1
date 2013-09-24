package com.sujay;

/**
 * All Reader implementation should implement this
 * for caching the reader handle and clean up reading
 * the source.
 */
public interface HasCleanup {
    void cleanup();
}
