package org.wheatgenetics.javalib;

public class Utils extends java.lang.Object
{
    public static java.lang.String makeEmptyIfNull(final java.lang.String s)
    { return null == s ? "" : s; }

    public static java.lang.String adjust(final java.lang.String unadjusted)
    { return null == unadjusted ? "" : unadjusted.trim(); }
}