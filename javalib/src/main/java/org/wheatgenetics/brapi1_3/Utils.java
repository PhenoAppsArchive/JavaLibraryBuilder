package org.wheatgenetics.brapi1_3;

/**
 * Uses:
 * org.threeten.bp.OffsetDateTime
 * org.threeten.bp.ZoneOffset
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class Utils extends java.lang.Object
{
    public static org.threeten.bp.OffsetDateTime adjust(
    final org.threeten.bp.OffsetDateTime offsetDateTime)
    {
        if (null == offsetDateTime)
            // noinspection ConstantConditions
            return offsetDateTime;
        else
            if (offsetDateTime.getOffset().getId() == null)
                return org.threeten.bp.OffsetDateTime.of(
                    /* year         => */ offsetDateTime.getYear      (),
                    /* month        => */ offsetDateTime.getMonthValue(),
                    /* dayOfMonth   => */ offsetDateTime.getDayOfMonth(),
                    /* hour         => */ offsetDateTime.getHour      (),
                    /* minute       => */ offsetDateTime.getMinute    (),
                    /* second       => */ offsetDateTime.getSecond    (),
                    /* nanoOfSecond => */ offsetDateTime.getNano      (),
                    /* offset       => */ org.threeten.bp.ZoneOffset.UTC);
            else return offsetDateTime;
    }
}