package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
@java.lang.SuppressWarnings({"UnnecessaryInterfaceModifier"})
public interface Items extends org.wheatgenetics.javalib.mstrdtl.Item.Container
{
    public boolean canMoveDown(int position);

    @java.lang.SuppressWarnings({"unused"}) public void moveUp  (int position);
    @java.lang.SuppressWarnings({"unused"}) public void moveDown(int position);
    @java.lang.SuppressWarnings({"unused"}) public void delete  (int position);

    public void append(org.wheatgenetics.javalib.mstrdtl.Item item); public void append();

    public int                                    size()            ;
    public org.wheatgenetics.javalib.mstrdtl.Item get (int position);

    public java.lang.String                        toJson  ()                     ;
    public org.wheatgenetics.javalib.mstrdtl.Items fromJson(java.lang.String json);
}