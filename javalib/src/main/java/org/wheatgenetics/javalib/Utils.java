package org.wheatgenetics.javalib;

public class Utils extends java.lang.Object
{
    private static java.text.SimpleDateFormat SIMPLE_DATE_FORMAT = null;

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

            final java.lang.StringBuilder result = new java.lang.StringBuilder();
            {
                final int first = 0, last = length - 1;
                for (int i = first; i <= last; i++)
                {
                    final java.lang.String s = java.lang.Integer.toString(buffer[i] & 0x000000FF);
                    if (0 == i) result.append(s); else result.append(",").append(s);
                }
            }
            return result.toString();
        }
    }

    // region stringArray() Methods
    public static java.lang.String[] stringArray(final java.lang.String element)
    { return new java.lang.String[] { element }; }

    public static java.lang.String[] stringArray(final int element)
    { return org.wheatgenetics.javalib.Utils.stringArray(java.lang.String.valueOf(element)); }

    public static java.lang.String[] stringArray(final long element)
    { return org.wheatgenetics.javalib.Utils.stringArray(java.lang.String.valueOf(element)); }
    // endregion

    public static java.lang.String getDateTime()
    {
        if (null == org.wheatgenetics.javalib.Utils.SIMPLE_DATE_FORMAT)
            org.wheatgenetics.javalib.Utils.SIMPLE_DATE_FORMAT = new java.text.SimpleDateFormat(
                "yyyy-MM-dd-hh-mm-ss", java.util.Locale.getDefault());
        return org.wheatgenetics.javalib.Utils.SIMPLE_DATE_FORMAT.format(
            java.util.Calendar.getInstance().getTime());
    }
}