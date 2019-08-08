package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Item.Container
 */
@java.lang.SuppressWarnings({"WeakerAccess", "ClassExplicitlyExtendsObject"})
public class Utils extends java.lang.Object
{
    @java.lang.SuppressWarnings({"WeakerAccess"})
    public static int nonNegativePosition(final int position)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IndexOutOfBoundsException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        else
            return position;
    }

    @java.lang.SuppressWarnings({"WeakerAccess"}) public static boolean canMoveUp(
    final org.wheatgenetics.javalib.mstrdtl.Item.Container container, final int position)
    { return null != container && position > 0; }

    @java.lang.SuppressWarnings({"WeakerAccess"}) public static boolean canMoveDown(
    final org.wheatgenetics.javalib.mstrdtl.Item.Container container, final int position)
    {
        // noinspection SimplifiableConditionalExpression
        return null == container ? false : container.canMoveDown(position);
    }

    @java.lang.SuppressWarnings({"WeakerAccess"})
    public static boolean canMoveDown(final int position, final int size)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            return false;
        else
            if (size <= 0)
                return false;
            else
            {
                final int lastPosition = size - 1;
                return position < lastPosition;
            }
    }
}