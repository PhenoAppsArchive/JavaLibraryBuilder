package org.wheatgenetics.javalib;

/**
 * Uses:
 * org.wheatgenetics.javalib.Dir
 */
public abstract class PermissionDir extends org.wheatgenetics.javalib.Dir
{
    // region Constructors
    public PermissionDir(final java.io.File path, final java.lang.String blankHiddenFileName)
    { super(path, blankHiddenFileName); this.setPermissionRequiredToTrue(); }

    public PermissionDir(final java.io.File parent, final java.lang.String child,
    final java.lang.String blankHiddenFileName)
    { super(parent, child, blankHiddenFileName); this.setPermissionRequiredToTrue(); }

    public PermissionDir(final org.wheatgenetics.javalib.Dir parent, final java.lang.String child)
    { super(parent, child); this.setPermissionRequiredToTrue(); }
    // endregion
}