package org.wheatgenetics.javalib;

public class Dir extends java.lang.Object
{
    protected final java.io.File     path               ;
    private   final java.lang.String blankHiddenFileName;

    @java.lang.SuppressWarnings("SimplifiableConditionalExpression")
    private static boolean createNewDir(final java.io.File parent, final java.lang.String child)
    {
        if (null == parent)
            return false;
        else
        {
            java.io.File dir;
            if (null == child) dir = parent; else dir = new java.io.File(parent, child);
            return dir.exists() ? false : dir.mkdirs();
        }
    }

    // region Public Methods
    public Dir(final java.io.File parent, final java.lang.String child,
    final java.lang.String blankHiddenFileName)
    {
        super();

        this.path                = new java.io.File(parent, child);
        this.blankHiddenFileName = blankHiddenFileName            ;
    }

    public java.io.File createIfMissing() throws java.io.IOException
    {
        if (org.wheatgenetics.javalib.Dir.createNewDir(this.path, null))
        {
            final java.io.File blankHiddenFile =
                new java.io.File(this.path, this.blankHiddenFileName);

            if (blankHiddenFile.getParentFile().mkdirs())         // Wasn't this already done above?
            {
                blankHiddenFile.createNewFile();                  // throws java.io.IOException
                return blankHiddenFile;
            }
            else throw new java.io.IOException();
        }
        else return null;
    }

    public java.io.File createNewFile(final java.lang.String fileName) throws java.io.IOException
    {
        final java.io.File file = new java.io.File(this.path, fileName);
        file.createNewFile();                                          // throws java.io.IOException
        return file;
    }

    public void createNewDir(final java.lang.String dirName)
    { org.wheatgenetics.javalib.Dir.createNewDir(this.path, dirName); }
    // endregion
}