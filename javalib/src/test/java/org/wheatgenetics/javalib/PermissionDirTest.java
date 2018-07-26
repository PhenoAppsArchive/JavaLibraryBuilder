package org.wheatgenetics.javalib;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.wheatgenetics.javalib.PermissionDir
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class PermissionDirTest extends java.lang.Object
{
    private static class PermissionDir extends org.wheatgenetics.javalib.PermissionDir
    {
        private PermissionDir()
        {
            super(
                /* path => */ new java.io.File(java.lang.System.getProperty("java.io.tmpdir")),
                /* blankHiddenFileName => */null);
        }
    }

    private final org.wheatgenetics.javalib.PermissionDirTest.PermissionDir tmpPermissionDir =
        new org.wheatgenetics.javalib.PermissionDirTest.PermissionDir();

    // region Public Method Tests
    @org.junit.Test(expected = java.security.AccessControlException.class)
    public void getExistsWorks() { org.junit.Assert.assertTrue(this.tmpPermissionDir.getExists()); }

    @org.junit.Test(expected = java.security.AccessControlException.class)
    public void createIfMissingWorks() throws java.io.IOException
    { this.tmpPermissionDir.createIfMissing() /* throws java.io.IOException */; }

    @org.junit.Test(expected = java.security.AccessControlException.class)
    public void makeFileWorks() throws java.io.IOException
    { this.tmpPermissionDir.makeFile("abc") /* throws java.io.IOException */; }

    @org.junit.Test(expected = java.security.AccessControlException.class)
    public void createNewFileWorks() throws java.io.IOException
    { this.tmpPermissionDir.createNewFile("abc") /* throws java.io.IOException */;}

    @org.junit.Test(expected = java.security.AccessControlException.class)
    public void createNewDirWorks() { this.tmpPermissionDir.createNewDir("abc"); }

    @org.junit.Test(expected = java.security.AccessControlException.class)
    public void listWorks() { this.tmpPermissionDir.list(); }
    // endregion
}