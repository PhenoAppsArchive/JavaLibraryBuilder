package org.wheatgenetics.javalib;

@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class Dir extends java.lang.Object
{
    // region Fields
    private final java.io.File     path               ;
    private final java.lang.String blankHiddenFileName;

    private boolean exists;
    // endregion

    @java.lang.SuppressWarnings({"SimplifiableConditionalExpression"})
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

    protected java.io.File getPath() { return this.path; }

    // region Constructors
    public Dir(final java.io.File path, final java.lang.String blankHiddenFileName)
    {
        super();
        this.path = path; this.blankHiddenFileName = blankHiddenFileName;
        assert null != this.path; this.exists = this.path.exists();
    }

    public Dir(final java.io.File parent, final java.lang.String child,
    final java.lang.String blankHiddenFileName)
    { this(new java.io.File(parent, child), blankHiddenFileName); }

    public Dir(final org.wheatgenetics.javalib.Dir parent, final java.lang.String child)
    { this(parent.path, child, parent.blankHiddenFileName); }
    // endregion

    // region Public Methods
    public java.lang.String getPathAsString()
    { return null == this.path ? null : this.path.getPath(); }

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
        else throw new java.io.IOException(this.getPathAsString() + " does not exist");
    }

    public java.io.File makeFile(final java.lang.String fileName) throws java.io.IOException
    {
        if (this.exists)
            return new java.io.File(this.path, fileName);
        else
            throw new java.io.IOException(this.getPathAsString() + " does not exist");
    }

    @java.lang.SuppressWarnings({"ResultOfMethodCallIgnored"})
    public java.io.File createNewFile(final java.lang.String fileName) throws java.io.IOException
    {
        final java.io.File file = this.makeFile(fileName);         // throws java.io.IOException
        assert null != file; file.createNewFile();
        return file;
    }

    public void createNewDir(final java.lang.String dirName)
    { org.wheatgenetics.javalib.Dir.createNewDir(this.path, dirName); }

    public java.lang.String[] list()
    {
        if (null == this.path)
            return null;
        else
            if (this.exists)
                return this.path.isDirectory() ? this.path.list() : null;
            else
                return null;
    }

    public java.lang.String[] list(final java.lang.String regex)
    {
        final java.lang.String unfilteredList[] = this.list();
        if (null == unfilteredList)
            return null;
        else
            if (unfilteredList.length < 1)
                return unfilteredList;
            else
            {
                final java.util.ArrayList<java.lang.String> arrayList =
                    new java.util.ArrayList<java.lang.String>();
                {
                    final java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
                    for (final java.lang.String l: unfilteredList)
                        if (pattern.matcher(l).matches()) arrayList.add(l);
                }
                final java.lang.String filteredList[] = new java.lang.String[arrayList.size()];
                return arrayList.toArray(filteredList);
            }
    }
    // endregion
}