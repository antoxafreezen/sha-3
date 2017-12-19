package com.theromus.sha;

/**
 * The parameters defining the standard FIPS 202
 */
public enum Parameters {

    SHA3_224 (1152, 28, "06"),
    SHA3_256 (1088, 32, "06"),
    SHA3_384 (832, 48, "06"),
    SHA3_512 (576, 64, "06");

    private final int r;

    /**
     * Output length (bytes)
     */
    private final int outputLength;

    private final String d;


    Parameters(int r, int outputLength, String d) {
        this.r = r;
        this.outputLength = outputLength;
        this.d = d;
    }

    public int getR() {
        return r;
    }

    public int getOutputLength() {
        return outputLength;
    }

    public String getD() {
        return d;
    }
}
