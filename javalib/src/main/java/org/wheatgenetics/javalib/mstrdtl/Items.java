package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Item.Container
 */
@java.lang.SuppressWarnings({"UnnecessaryInterfaceModifier"})
public interface Items extends org.wheatgenetics.javalib.mstrdtl.Item.Container
{
    // region Overridden Methods
    @java.lang.Override public boolean canMoveDown(int position);

    @java.lang.Override public void moveUp  (int position);
    @java.lang.Override public void moveDown(int position);
    @java.lang.Override public void delete  (int position);
    // endregion

    // region Public Methods
    public void append(org.wheatgenetics.javalib.mstrdtl.Item item); public void append();

    public int                                    size()            ;
    public org.wheatgenetics.javalib.mstrdtl.Item get (int position);

    public java.lang.String toJson();

    public org.wheatgenetics.javalib.mstrdtl.Items fromJson(java.lang.String json);
    // endregion
}