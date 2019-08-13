package org.wheatgenetics.javalib.mstrdtl;

@java.lang.SuppressWarnings({"UnnecessaryInterfaceModifier"}) public interface Item
{
    interface Container
    {
        public boolean canMoveDown(int position);

        @java.lang.SuppressWarnings({"unused"}) public void moveUp  (int position);
        @java.lang.SuppressWarnings({"unused"}) public void moveDown(int position);
    }

    // region Constants
    public static final int              MIN_POSITION               = 0;
    public static final java.lang.String TOO_SMALL_POSITION_MESSAGE =
        "position must be non-negative";
    // endregion

    // region Public Methods
    public void setPosition(final int position);

    public int              getPosition        ();
    public java.lang.String getPositionAsString();
    public java.lang.String getTitle           ();
    public java.lang.String getContent         ();

    public boolean canMoveUp(); public boolean canMoveDown();
    // endregion
}