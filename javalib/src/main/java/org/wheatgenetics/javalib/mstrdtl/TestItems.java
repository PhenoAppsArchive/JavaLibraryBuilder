package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Item.Container
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.TestItem
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class TestItems extends java.lang.Object
implements org.wheatgenetics.javalib.mstrdtl.Items, org.wheatgenetics.javalib.mstrdtl.Item.Container

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

    // region Overridden Methods
    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (null != item) item.setPosition(this.size());

        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            (org.wheatgenetics.javalib.mstrdtl.TestItem) item;
        if (null != testItem) { testItem.setContainer(this); testItem.setTitleAndContent(); }

        this.testItems().add(testItem);
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

    // region org.wheatgenetics.javalib.mstrdtl.Item.Container Overridden Method
    @java.lang.Override public boolean canMoveDown(final int position)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            return false;
        else
        {
            final int size = this.size();
            if (size <= 0)
                return false;
            else
            {
                final int lastPosition = size - 1;
                return position < lastPosition;
            }
        }
    }
    // endregion
    // endregion
}