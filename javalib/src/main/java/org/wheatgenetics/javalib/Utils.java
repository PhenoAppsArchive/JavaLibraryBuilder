package org.wheatgenetics.javalib;

@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
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

    // region convert() Methods
    /** See <a href="https://stackoverflow.com/questions/4266756/can-we-make-unsigned-byte-in-java">https://stackoverflow.com/questions/4266756/can-we-make-unsigned-byte-in-java</a>. */
    public static int interpretAsUnsigned(final byte signedByte) { return signedByte & 0x000000FF; }

    public static java.lang.String convert(final byte buffer[], int length)
    {
        if (null == buffer)
            return null;
        else
        {
            length = java.lang.Math.max(0     , length       );          // Handle too small length.
            length = java.lang.Math.min(length, buffer.length);          // Handle too big   length.

            final java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
            {
                final int first = 0, last = length - 1;
                for (int i = first; i <= last; i++)
                {
                    final java.lang.String s = java.lang.Integer.toString(
                        org.wheatgenetics.javalib.Utils.interpretAsUnsigned(buffer[i]));
                    if (i >= 1) stringBuilder.append(",");
                    stringBuilder.append(s);
                }
            }
            return stringBuilder.toString();
        }
    }

    public static int convert(final java.lang.String s)
    {
        try                                             { return java.lang.Integer.parseInt(s); }
        catch (final java.lang.NumberFormatException e) { return                            -1; }
    }
    // endregion

    // region stringArray() Methods
    public static java.lang.String[] stringArray(final java.lang.String element)
    { return new java.lang.String[] {element}; }

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