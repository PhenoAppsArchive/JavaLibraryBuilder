package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
@java.lang.SuppressWarnings({"UnnecessaryInterfaceModifier"})
public interface Items
{
    public void add(final org.wheatgenetics.javalib.mstrdtl.Item item);

    public int                                    size()                  ;
    public org.wheatgenetics.javalib.mstrdtl.Item get (final int position);
}