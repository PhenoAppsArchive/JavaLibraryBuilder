package org.wheatgenetics.javalib;

public class Dir extends java.lang.Object
{
    // region Fields
    protected final java.io.File     path               ;
    private   final java.lang.String blankHiddenFileName;

    private boolean exists;
    // endregion

    @java.lang.SuppressWarnings("SimplifiableConditionalExpression")
    private static boolean createNewDir(final java.io.File parent, final java.lang.String child)
    {
        if (null == parent)
            return false;
        else
        {
            final java.io.File dir = null == child ? parent : new java.io.File(parent, child);
            return dir.exists() ? false : dir.mkdirs();
        }
    }

    public Dir(final java.io.File parent, final java.lang.String child,
    final java.lang.String blankHiddenFileName)
    {
        super();

        this.path                = new java.io.File(parent, child);
        this.blankHiddenFileName = blankHiddenFileName            ;

        this.exists = this.path.exists();
    }

    // region Public Methods
    public boolean getExists() { return this.exists; }

    public java.io.File createIfMissing() throws java.io.IOException
    {
        if (!this.exists)
        {
            org.wheatgenetics.javalib.Dir.createNewDir(this.path, null);
            assert null != this.path; this.exists = this.path.exists();
        }

        if (this.exists)
        {
            final java.io.File blankHiddenFile =
                new java.io.File(this.path, this.blankHiddenFileName);
            if (blankHiddenFile.createNewFile())
                return blankHiddenFile;
            else
                throw new java.io.IOException("Couldn't create " + blankHiddenFile.getName());
        }
        else throw new java.io.IOException(this.path.getPath() + " does not exist");
    }

    public java.io.File createNewFile(final java.lang.String fileName) throws java.io.IOException
    {
        if (this.exists)
        {
            final java.io.File file = new java.io.File(this.path, fileName);
            file.createNewFile();                                      // throws java.io.IOException
            return file;
        }
        else throw new java.io.IOException(this.path.getPath() + " does not exist");
    }

    public void createNewDir(final java.lang.String dirName)
    { org.wheatgenetics.javalib.Dir.createNewDir(this.path, dirName); }
    // endregion
}