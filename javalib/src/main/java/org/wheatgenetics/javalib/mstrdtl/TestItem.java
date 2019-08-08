package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.wheatgenetics.javalib.Utils
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class TestItem extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Item
{
    // region Fields
    private final org.wheatgenetics.javalib.mstrdtl.TestItem.Container container;

    private int              position           ;
    private java.lang.String title, content = "";
    // endregion

    private int getPosition() { return this.position; }

    TestItem(final org.wheatgenetics.javalib.mstrdtl.TestItem.Container container)
    { super(); this.container = container; }

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public void setPosition(final int position)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IndexOutOfBoundsException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        else
            this.position = position;
    }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }

    @java.lang.Override public java.lang.String getTitle  () { return this.title  ; }
    @java.lang.Override public java.lang.String getContent() { return this.content; }

    @java.lang.Override public boolean canMoveUp()
    { return null != this.container && this.getPosition() > 0; }

    @java.lang.Override public boolean canMoveDown()
    {
        // noinspection SimplifiableConditionalExpression
        return null == this.container ? false : this.container.canMoveDown(this.getPosition());
    }
    // endregion

    @java.lang.SuppressWarnings({"DefaultLocale"}) void setTitleAndContent()
    {
        this.title = java.lang.String.format("Item %d",this.getPosition() + 1);

        final java.lang.StringBuilder builder =
            new java.lang.StringBuilder("Content of ").append(this.getTitle()).append(':');
        for (int i = org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION;
        i <= this.getPosition(); i++)
            builder.append("\nMore information here.");
        this.content = builder.toString();
    }

    @java.lang.SuppressWarnings({"WeakerAccess"})
    public void setContent(final java.lang.String content)
    { this.content = org.wheatgenetics.javalib.Utils.makeEmptyIfNull(content); }
}