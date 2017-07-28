package org.wheatgenetics.javalib;

public class Utils extends java.lang.Object
{
    // region IfNull Methods
    public static java.lang.String replaceIfNull(final java.lang.String s,
    final java.lang.String valueIfNull) { return null == s ? valueIfNull : s; }

    public static java.lang.String makeEmptyIfNull(final java.lang.String s)
    { return org.wheatgenetics.javalib.Utils.replaceIfNull(s, ""); }

    public static java.lang.String adjust(final java.lang.String unadjusted)
    { return org.wheatgenetics.javalib.Utils.makeEmptyIfNull(unadjusted).trim(); }
    // endregion

    public static java.lang.String convert(final byte buffer[], int length)
    {
        if (null == buffer)
            return null;
        else
        {
            length = java.lang.Math.max(0     , length       );          // Handle too small length.
            length = java.lang.Math.min(length, buffer.length);          // Handle too big   length.

            java.lang.String s = "";
            {
                final int              first = 0, last = length - 1;
                      java.lang.String b                           ;
                for (int i = first; i <= last; i++)
                {
                    b = java.lang.Byte.toString(buffer[i]);
                    if (0 == i) s = b; else s += "," + b;
                }
            }
            return s;
        }
    }

    // region stringArray() Methods
    public static java.lang.String[] stringArray(final java.lang.String element)
    { return new java.lang.String[] {element}; }

    public java.lang.String[] stringArray(final int element)
    { return org.wheatgenetics.javalib.Utils.stringArray(java.lang.String.valueOf(element)); }
    // endregion
}