package org.wheatgenetics.javalib;

/**
 * Uses:
 * com.csvreader.CsvWriter
 */
public class CsvWriter extends com.csvreader.CsvWriter
{
    public CsvWriter(final java.io.File file) throws java.io.IOException
    {
        super(
            /* outputStream => */ new java.io.FileWriter(file, false), // throws java.io.IOException
            /* delimiter    => */ ','                                );
    }

    // region Public Methods
    public void write() throws java.io.IOException { this.write(""); }

    public void write(final int content) throws java.io.IOException
    { this.write(java.lang.String.valueOf(content));}

    public void write(final java.lang.String format, final java.lang.Object... args)
    throws java.io.IOException
    { this.write(java.lang.String.format(format, args)); /* throws java.io.IOException */ }
    // endregion
}