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
    private int              position      ;
    private java.lang.String title, content;
    // endregion

    private int getPosition() { return this.position; }

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override @java.lang.SuppressWarnings({"DefaultLocale"})
    public void setPosition(final int position)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IndexOutOfBoundsException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        else
        {
            this.position = position                                                        ;
            this.title    = java.lang.String.format("Item %d",this.position + 1);

            final java.lang.StringBuilder builder =
                new java.lang.StringBuilder("Content of ").append(this.getTitle()).append(':');
            for (int i = org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION;
            i <= this.position; i++)
                builder.append("\nMore information here.");
            this.content = builder.toString();
        }
    }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }

    @java.lang.Override public java.lang.String getTitle  () { return this.title  ; }
    @java.lang.Override public java.lang.String getContent() { return this.content; }
    // endregion

    @java.lang.SuppressWarnings({"WeakerAccess"})
    public void setContent(final java.lang.String content)
    { this.content = org.wheatgenetics.javalib.Utils.makeEmptyIfNull(content); }
}