package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.TestItem
 * org.wheatgenetics.javalib.mstrdtl.Utils
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class TestItems extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items
{
    private java.util.List<org.wheatgenetics.javalib.mstrdtl.TestItem> listInstance = null; // lazy
                                                                                            //  load
    private java.util.List<org.wheatgenetics.javalib.mstrdtl.TestItem> list()
    {
        if (null == this.listInstance)
            // noinspection Convert2Diamond
            this.listInstance =
                new java.util.ArrayList<org.wheatgenetics.javalib.mstrdtl.TestItem>();
        return this.listInstance;
    }

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public boolean canMoveDown(final int position)
    { return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()); }

    @java.lang.Override public void moveUp(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.listInstance, position,position - 1);
    }

    @java.lang.Override public void moveDown(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.listInstance, position,position + 1);
    }

    @java.lang.Override public void delete(final int position)
    { org.wheatgenetics.javalib.mstrdtl.Utils.delete(this.listInstance, position); }

    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (item instanceof org.wheatgenetics.javalib.mstrdtl.TestItem)
        {
            final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
                (org.wheatgenetics.javalib.mstrdtl.TestItem) item;
            if (testItem.containersAreTheSame(this))
            {
                testItem.setPosition(this.size()); testItem.setTitleAndContent();
                this.list().add(testItem);
            }
        }
    }

    @java.lang.Override public void append()
    { this.append(new org.wheatgenetics.javalib.mstrdtl.TestItem(this)); }

    @java.lang.Override public int size()
    { return null == this.listInstance ? 0 : this.listInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.listInstance ? null : this.listInstance.get(nonNegativePosition);
    }
    // endregion
}