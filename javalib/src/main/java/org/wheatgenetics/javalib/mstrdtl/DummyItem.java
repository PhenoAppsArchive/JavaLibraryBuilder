package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
class DummyItem extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Item
{
    // region Fields
    private final int              position      ;
    private final java.lang.String title, content;
    // endregion

    private int getPosition() { return this.position; }

    @java.lang.SuppressWarnings({"DefaultLocale"}) DummyItem(final int position)
    {
        super();

        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IllegalArgumentException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        this.position = position;
        this.title    = java.lang.String.format("Item %d",position + 1);

        final java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append("Content of ").append(this.getTitle()).append(':');
        for (int i = org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION; i <= position; i++)
            builder.append("\nMore information here.");
        this.content = builder.toString();
    }

    // region Overridden Methods
    @java.lang.Override public java.lang.String getTitle  () { return this.title  ; }
    @java.lang.Override public java.lang.String getContent() { return this.content; }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }
    // endregion
}