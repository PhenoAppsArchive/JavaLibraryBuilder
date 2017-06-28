package org.wheatgenetics.javalib;

public class Utils extends java.lang.Object
{
    public static java.lang.String makeEmptyIfNull(final java.lang.String s)
    { return null == s ? "" : s; }

    public static java.lang.String adjust(final java.lang.String unadjusted)
    { return org.wheatgenetics.javalib.Utils.makeEmptyIfNull(unadjusted).trim(); }

    public static java.lang.String convert(final byte buffer[])
    {
        if (null == buffer)
            return null;
        else
        {
            java.lang.String s = "";

            final int              last = buffer.length - 1;
                  java.lang.String b                       ;
            for (int i = 0; i <= last; i++)
            {
                b = java.lang.Byte.toString(buffer[i]);
                if (0 == i) s = b; else s += "," + b;
            }

            return s;
        }
    }
}