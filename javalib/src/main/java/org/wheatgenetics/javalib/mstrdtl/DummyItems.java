package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.wheatgenetics.javalib.mstrdtl.DummyItem
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class DummyItems extends java.lang.Object
implements org.wheatgenetics.javalib.mstrdtl.Items
{
    private java.util.List<org.wheatgenetics.javalib.mstrdtl.DummyItem> dummyItems = null;  // lazy
                                                                                            //  load
    @java.lang.SuppressWarnings("Convert2Diamond")
    private java.util.List<org.wheatgenetics.javalib.mstrdtl.DummyItem> dummyItems()
    {
        if (null == this.dummyItems) this.dummyItems =
            new java.util.ArrayList<org.wheatgenetics.javalib.mstrdtl.DummyItem>();
        return this.dummyItems;
    }

    // region Overridden Methods
    @java.lang.Override public void add(final org.wheatgenetics.javalib.mstrdtl.Item item)
    { this.dummyItems().add((org.wheatgenetics.javalib.mstrdtl.DummyItem) item); }

    @java.lang.Override public int size()
    { return null == this.dummyItems ? 0 : this.dummyItems.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IllegalArgumentException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        return null == this.dummyItems ? null : this.dummyItems.get(position);
    }
    // endregion
}