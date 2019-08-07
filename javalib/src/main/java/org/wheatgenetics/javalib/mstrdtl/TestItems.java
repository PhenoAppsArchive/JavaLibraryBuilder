package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.TestItem
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class TestItems extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items
{
    private java.util.List<org.wheatgenetics.javalib.mstrdtl.TestItem>
        testItemsInstance = null;                                                       // lazy load

    private java.util.List<org.wheatgenetics.javalib.mstrdtl.TestItem> testItems()
    {
        if (null == this.testItemsInstance)
            // noinspection Convert2Diamond
            this.testItemsInstance =
                new java.util.ArrayList<org.wheatgenetics.javalib.mstrdtl.TestItem>();
        return this.testItemsInstance;
    }

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (null != item) item.setPosition(this.size());
        this.testItems().add((org.wheatgenetics.javalib.mstrdtl.TestItem) item);
    }

    @java.lang.Override public void append()
    { this.append(new org.wheatgenetics.javalib.mstrdtl.TestItem()); }

    @java.lang.Override public int size()
    { return null == this.testItemsInstance ? 0 : this.testItemsInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IndexOutOfBoundsException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        return null == this.testItemsInstance ? null : this.testItemsInstance.get(position);
    }
    // endregion
}