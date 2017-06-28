package org.wheatgenetics.javalib;

public class Utils extends java.lang.Object
{
    public static java.lang.String makeEmptyIfNull(final java.lang.String s)
    { return null == s ? "" : s; }

    public static java.lang.String adjust(final java.lang.String unadjusted)
    { return org.wheatgenetics.javalib.Utils.makeEmptyIfNull(unadjusted).trim(); }

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
                final int              last = length - 1;
                      java.lang.String b                ;
                for (int i = 0; i <= last; i++)
                {
                    b = java.lang.Byte.toString(buffer[i]);
                    if (0 == i) s = b; else s += "," + b;
                }
            }
            return s;
        }
    }
}