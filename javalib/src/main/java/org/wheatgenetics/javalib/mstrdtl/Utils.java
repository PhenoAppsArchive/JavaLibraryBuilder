package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Item.Container
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class Utils extends java.lang.Object
{
    private static boolean canMoveUp(final int position)
    { return position > org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION; }

    // region Public Methods
    public static int nonNegativePosition(final int position)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IndexOutOfBoundsException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        else
            return position;
    }

    public static boolean canMoveUp(
    final org.wheatgenetics.javalib.mstrdtl.Item.Container container, final int position)
    { return null != container && org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(position); }

    public static boolean canMoveDown(
    final org.wheatgenetics.javalib.mstrdtl.Item.Container container, final int position)
    {
        // noinspection SimplifiableConditionalExpression
        return null == container ? false : container.canMoveDown(position);
    }

    public static boolean canMoveUp(final int position, final int size)
    {
        // noinspection SimplifiableConditionalExpression
        return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(position) ? size > 0 : false;
    }

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

    @java.lang.SuppressWarnings({"TypeParameterExplicitlyExtendsObject"})
    public static <T extends java.lang.Object> void swap(
    final java.util.List<T> list, final int positionA, final int positionB)
    {
        if (null != list)
        {
            final org.wheatgenetics.javalib.mstrdtl.Item
                itemA = (org.wheatgenetics.javalib.mstrdtl.Item) list.get(positionA),
                itemB = (org.wheatgenetics.javalib.mstrdtl.Item) list.get(positionB);
            java.util.Collections.swap(list, positionA, positionB);
            itemA.setPosition(positionB); itemB.setPosition(positionA);
        }
    }

    @java.lang.SuppressWarnings({"TypeParameterExplicitlyExtendsObject"}) public static<
    T extends java.lang.Object> void delete(final java.util.List<T> list, final int position)
    {
        if (null != list)
        {
            list.remove(position);

            // noinspection UnnecessaryLocalVariable
            final int firstPosition = position, lastPosition = list.size() - 1;
            for (int i = firstPosition; i <= lastPosition; i++)
                ((org.wheatgenetics.javalib.mstrdtl.Item) list.get(i)).setPosition(i);
        }
    }
    // endregion
}