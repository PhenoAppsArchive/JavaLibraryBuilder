package org.wheatgenetics.javalib;

@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class Dir extends java.lang.Object
{
    // region Fields
    private final java.io.File     path               ;
    private final java.lang.String blankHiddenFileName;

    private boolean exists, existsHasBeenSet = false, permissionRequired;
    // endregion

    // region Private Methods
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

    private void setExists()
    {
        this.checkPermission();
        assert null != this.path; this.exists = this.path.exists(); this.existsHasBeenSet = true;
    }

    private void setPermissionRequired(final boolean permissionRequired)
    { this.permissionRequired = permissionRequired; }

    private void checkPermission()
    {
        if (this.permissionRequired) if (!this.permissionGranted()) if (!this.requestPermission())
            throw new java.security.AccessControlException(
                "Permission is required but has not been granted");
    }
    // endregion

    void setPermissionRequiredToTrue() { this.setPermissionRequired(true); }

    // region Protected Methods
    protected java.io.File getPath          () { return this.path; }
    protected boolean      permissionGranted() { return false    ; }

    /**
     * The purpose of this method is to request permission.  In this class the method doesn't do its
     * job (because it can't -- this must be done at the Android (not the Java) layer).  Since it
     * doesn't do its job it returns the value false.  When this method is overridden the subclass
     * that makes this method do its job should return the value true.
     */
    protected boolean requestPermission()
    {
        // noinspection UnnecessaryLocalVariable
        final boolean permissionRequested = false; return permissionRequested;
    }
    // endregion

    // region Constructors
    public Dir(final java.io.File path, final java.lang.String blankHiddenFileName)
    {
        super();

        if (null == path) throw new java.lang.IllegalArgumentException("path must not be null");
        this.path = path; this.blankHiddenFileName = blankHiddenFileName;
        this.setPermissionRequired(false);
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

    public boolean getExists() { if (!this.existsHasBeenSet) this.setExists(); return this.exists; }

    public java.io.File createIfMissing() throws java.io.IOException
    {
        if (!this.getExists())
        {
            this.checkPermission();
            org.wheatgenetics.javalib.Dir.createNewDir(this.path,null);
            this.setExists();
        }

        if (!this.getExists())
            throw new java.io.IOException(this.getPathAsString() + " does not exist");
        else
            if (null == this.blankHiddenFileName)
                return null;
            else
                if (this.blankHiddenFileName.trim().length() <= 0)
                    return null;
                else
                {
                    final java.io.File blankHiddenFile =
                        new java.io.File(this.path, this.blankHiddenFileName);

                    this.checkPermission();

                    // noinspection ResultOfMethodCallIgnored
                    blankHiddenFile.createNewFile();                   // throws java.io.IOException

                    return blankHiddenFile;
                }
    }

    public java.io.File makeFile(final java.lang.String fileName) throws java.io.IOException
    {
        if (this.getExists())
            return new java.io.File(this.path, fileName);
        else
            throw new java.io.IOException(this.getPathAsString() + " does not exist");
    }

    public java.io.File createNewFile(final java.lang.String fileName) throws java.io.IOException
    {
        final java.io.File file = this.makeFile(fileName);             // throws java.io.IOException

        this.checkPermission();

        assert null != file;
        // noinspection ResultOfMethodCallIgnored
        file.createNewFile();

        return file;
    }

    public void createNewDir(final java.lang.String dirName)
    { this.checkPermission(); org.wheatgenetics.javalib.Dir.createNewDir(this.path, dirName); }

    public java.lang.String[] list()
    {
        if (null == this.path)
            return null;
        else
            if (this.getExists())
            {
                this.checkPermission();
                return this.path.isDirectory() ? this.path.list() : null;
            }
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