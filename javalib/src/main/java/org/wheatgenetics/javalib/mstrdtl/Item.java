package org.wheatgenetics.javalib.mstrdtl;

@java.lang.SuppressWarnings({"UnnecessaryInterfaceModifier"})
public interface Item
{
    // region Constants
    public static final int              MIN_POSITION = 0;
    public static final java.lang.String
        TOO_SMALL_POSITION_MESSAGE = "position must be non-negative";
    // endregion

    // region Public Methods
    public java.lang.String getTitle           ();
    public java.lang.String getContent         ();
    public java.lang.String getPositionAsString();
    // endregion
}