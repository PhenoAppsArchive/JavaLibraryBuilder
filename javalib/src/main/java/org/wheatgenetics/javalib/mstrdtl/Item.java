package org.wheatgenetics.javalib.mstrdtl;

@java.lang.SuppressWarnings({"UnnecessaryInterfaceModifier"}) public interface Item
{
    // region Constants
    @java.lang.SuppressWarnings({"unused"}) public static final int              MIN_POSITION = 0;
    @java.lang.SuppressWarnings({"unused"}) public static final java.lang.String
        TOO_SMALL_POSITION_MESSAGE = "position must be non-negative";
    // endregion

    // region Public Methods
    @java.lang.SuppressWarnings({"unused"}) public java.lang.String getTitle           ();
    @java.lang.SuppressWarnings({"unused"}) public java.lang.String getContent         ();
    @java.lang.SuppressWarnings({"unused"}) public java.lang.String getPositionAsString();
    // endregion
}