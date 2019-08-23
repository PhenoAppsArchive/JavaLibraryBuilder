package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * com.google.gson.Gson
 * com.google.gson.GsonBuilder
 * com.google.gson.reflect.TypeToken
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.TestItem
 * org.wheatgenetics.javalib.mstrdtl.Utils
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class TestItems extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items
{
    // region Fields
    private java.util.List<org.wheatgenetics.javalib.mstrdtl.TestItem> listInstance = null;    // ll
    private com.google.gson.Gson                                       gsonInstance = null;    // ll
    private java.lang.reflect.Type                                     typeInstance = null;    // ll
    // endregion

    // region Private Methods
    private java.util.List<org.wheatgenetics.javalib.mstrdtl.TestItem> list()
    {
        if (null == this.listInstance)
            // noinspection Convert2Diamond
            this.listInstance =
                new java.util.ArrayList<org.wheatgenetics.javalib.mstrdtl.TestItem>();
        return this.listInstance;
    }

    private com.google.gson.Gson gson()
    {
        if (null == this.gsonInstance)
            this.gsonInstance = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
        return this.gsonInstance;
    }

    private java.lang.reflect.Type type()
    {
        if (null == this.typeInstance) this.typeInstance = new com.google.gson.reflect.TypeToken<
            java.util.List<org.wheatgenetics.javalib.mstrdtl.TestItem>>(){}.getType();
        return this.typeInstance;
    }
    // endregion

    // region Constructors
    @java.lang.SuppressWarnings({"WeakerAccess"}) public TestItems() { super(); }

    private TestItems(final java.util.List<org.wheatgenetics.javalib.mstrdtl.TestItem> list)
    {
        this(); this.listInstance = list;
        if (null != this.listInstance)
            for (final org.wheatgenetics.javalib.mstrdtl.TestItem testItem: this.listInstance)
                testItem.setContainer(this);
    }
    // endregion

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

    @java.lang.Override public java.lang.String toJson()
    { return this.gson().toJson(this.listInstance); }

    @java.lang.Override
    public org.wheatgenetics.javalib.mstrdtl.Items fromJson(final java.lang.String json)
    {
        if (null == json)
            return null;
        else
        {
            final java.lang.String trimmedJson = json.trim();
            if (trimmedJson.length() <= 0)
                return null;
            else
            {
                final java.util.List<org.wheatgenetics.javalib.mstrdtl.TestItem> list =
                    this.gson().fromJson(json, type());
                return null == list ? null : new org.wheatgenetics.javalib.mstrdtl.TestItems(list);
            }
        }
    }
    // endregion
}