package org.wheatgenetics.javalib;

@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class Utils extends java.lang.Object
{
    private static java.text.SimpleDateFormat SIMPLE_DATE_FORMAT = null;

    public static class Response extends java.lang.Object
    {
        private final java.lang.String contentTypeInstance,
            contentEncodingInstance, contentInstance;

        private Response(final java.lang.String contentType,
        final java.lang.String contentEncoding, final java.lang.String content)
        {
            super();

            this.contentTypeInstance     = contentType    ;
            this.contentEncodingInstance = contentEncoding;
            this.contentInstance         = content        ;
        }

        public java.lang.String contentType    () { return this.contentTypeInstance    ; }
        public java.lang.String contentEncoding() { return this.contentEncodingInstance; }
        public java.lang.String content        () { return this.contentInstance        ; }
    }

    // region IfNull Methods
    @java.lang.SuppressWarnings({"WeakerAccess"}) public static java.lang.String replaceIfNull(
    final java.lang.String s, final java.lang.String valueIfNull)
    { return null == s ? valueIfNull : s; }

    public static java.lang.String makeEmptyIfNull(final java.lang.String s)
    { return org.wheatgenetics.javalib.Utils.replaceIfNull(s,""); }

    public static java.lang.String adjust(final java.lang.String unadjusted)
    { return org.wheatgenetics.javalib.Utils.makeEmptyIfNull(unadjusted).trim(); }
    // endregion

    // region convert() Methods
    /** See <a href="https://stackoverflow.com/questions/4266756/can-we-make-unsigned-byte-in-java">https://stackoverflow.com/questions/4266756/can-we-make-unsigned-byte-in-java</a>. */
    @java.lang.SuppressWarnings({"WeakerAccess"})
    public static int interpretAsUnsigned(final byte signedByte) { return signedByte & 0x000000FF; }

    @java.lang.SuppressWarnings({"unused"}) public static java.lang.String convert(
    @java.lang.SuppressWarnings({"CStyleArrayDeclaration"}) final byte buffer[], int length)
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
                    if (i >= 1) stringBuilder.append(","); stringBuilder.append(s);
                }
            }
            return stringBuilder.toString();
        }
    }

    @java.lang.SuppressWarnings({"unused"}) public static int convert(final java.lang.String s)
    {
        try                                             { return java.lang.Integer.parseInt(s); }
        catch (final java.lang.NumberFormatException e) { return                            -1; }
    }
    // endregion

    // region stringArray() Methods
    @java.lang.SuppressWarnings({"WeakerAccess"})
    public static java.lang.String[] stringArray(final java.lang.String element)
    { return new java.lang.String[] {element}; }

    @java.lang.SuppressWarnings({"unused"})
    public static java.lang.String[] stringArray(final int element)
    { return org.wheatgenetics.javalib.Utils.stringArray(java.lang.String.valueOf(element)); }

    @java.lang.SuppressWarnings({"unused"})
    public static java.lang.String[] stringArray(final long element)
    { return org.wheatgenetics.javalib.Utils.stringArray(java.lang.String.valueOf(element)); }
    // endregion

    @java.lang.SuppressWarnings({"unused"}) public static java.lang.String getDateTime()
    {
        if (null == org.wheatgenetics.javalib.Utils.SIMPLE_DATE_FORMAT)
            org.wheatgenetics.javalib.Utils.SIMPLE_DATE_FORMAT = new java.text.SimpleDateFormat(
                "yyyy-MM-dd-hh-mm-ss", java.util.Locale.getDefault());
        return org.wheatgenetics.javalib.Utils.SIMPLE_DATE_FORMAT.format(
            java.util.Calendar.getInstance().getTime());
    }

    // region get() Methods
    private static java.net.HttpURLConnection makeHttpURLConnection(final java.net.URL url)
    throws java.io.IOException
    {
        if (null == url)
            return null;
        else
            return (java.net.HttpURLConnection) url.openConnection();  // throws java.io.IOException
    }

    private static org.wheatgenetics.javalib.Utils.Response get(
    final java.net.HttpURLConnection httpURLConnection) throws java.io.IOException
    {
        try { httpURLConnection.connect() /* throws java.io.IOException */; }
        catch (final java.net.SocketTimeoutException e)
        {
            return new org.wheatgenetics.javalib.Utils.Response(
                null,null,"timeout");
        }

        final int responseCode = httpURLConnection.getResponseCode();  // throws java.io.IOException
        if (responseCode != java.net.HttpURLConnection.HTTP_OK)
            throw new java.io.IOException(java.lang.String.format("Response code is %d, not %d",
                responseCode, java.net.HttpURLConnection.HTTP_OK));
        else
        {
            final java.io.InputStream inputStream = httpURLConnection.getInputStream(); // throws
            if (null == inputStream)                                                    //  java.io-
                return null;                                                            //  .IOEx-
            else                                                                        //  ception
                try
                {
                    final java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                    {
                        class InputStreamReader extends java.lang.Object
                        {
                            private final java.io.InputStreamReader inputStreamReader;

                            private InputStreamReader(final java.io.InputStream inputStream)
                            {
                                super();
                                this.inputStreamReader = new java.io.InputStreamReader(inputStream);
                            }

                            private java.lang.String read()
                            {
                                final int length = 1024;

                                @java.lang.SuppressWarnings({"CStyleArrayDeclaration"})
                                final char cbuf[] = new char[length];
                                try
                                {
                                    final int numberOfCharactersRead =
                                        this.inputStreamReader.read(cbuf,0, length);// throws ja-
                                    if (-1 == numberOfCharactersRead)                  //  va.io.IO-
                                        return null;                                   //  Exception
                                    else
                                        return new java.lang.String(
                                            cbuf,0, numberOfCharactersRead);
                                }
                                catch (final java.io.IOException e) { return null; }
                            }
                        }
                        final InputStreamReader inputStreamReader =
                            new InputStreamReader(inputStream);
                        java.lang.String chunk;
                        while (null != (chunk = inputStreamReader.read()))
                            stringBuilder.append(chunk);
                    }
                    return new org.wheatgenetics.javalib.Utils.Response(
                        httpURLConnection.getContentType    (),
                        httpURLConnection.getContentEncoding(),
                        stringBuilder.toString              ());
                }
                finally { inputStream.close() /* throws java.io.IOException */; }
        }
    }

    @java.lang.SuppressWarnings({"WeakerAccess", "RedundantSuppression"})
    public static org.wheatgenetics.javalib.Utils.Response get(final java.net.URL url)
    throws java.io.IOException
    {
        final java.net.HttpURLConnection httpURLConnection =
            org.wheatgenetics.javalib.Utils.makeHttpURLConnection(url);
        return null == httpURLConnection ? null :
            org.wheatgenetics.javalib.Utils.get(httpURLConnection);
    }

    @java.lang.SuppressWarnings({"WeakerAccess", "RedundantSuppression"})
    public static org.wheatgenetics.javalib.Utils.Response get(
    final java.net.URL url, final int timeout) throws java.io.IOException
    {
        final java.net.HttpURLConnection httpURLConnection =
            org.wheatgenetics.javalib.Utils.makeHttpURLConnection(url);
        if (null == httpURLConnection)
            return null;
        else
        {
            httpURLConnection.setConnectTimeout(timeout);
            return org.wheatgenetics.javalib.Utils.get(httpURLConnection);
        }
    }

    // region threadedGet() Methods
    private abstract static class BaseThread extends java.lang.Thread
    {
        // region Fields
        private final java.net.URL                             url            ;
        private       org.wheatgenetics.javalib.Utils.Response response = null;
        // endregion

        // region Package Methods
        java.net.URL getUrl() { return this.url; }

        void setResponse(final org.wheatgenetics.javalib.Utils.Response response)
        { this.response = response; }
        // endregion

        private BaseThread(final java.net.URL url) { super(); this.url = url; }

        org.wheatgenetics.javalib.Utils.Response getResponse() { return this.response; }
    }

    private static class DefaultTimeoutThread extends org.wheatgenetics.javalib.Utils.BaseThread
    {
        DefaultTimeoutThread(final java.net.URL url) { super(url); }

        @java.lang.Override public void run()
        {
            try
            { this.setResponse(org.wheatgenetics.javalib.Utils.get(this.getUrl()) /* throws */); }
            catch (final java.io.IOException e) { this.setResponse(null); }
        }
    }

    private static class CustomTimeoutThread extends org.wheatgenetics.javalib.Utils.BaseThread
    {
        final int timeout;

        CustomTimeoutThread(final java.net.URL url, final int timeout)
        { super(url); this.timeout = timeout; }

        @java.lang.Override public void run()
        {
            try
            {
                this.setResponse(org.wheatgenetics.javalib.Utils.get(
                    this.getUrl(), this.timeout) /* throws */);
            }
            catch (final java.io.IOException e) { this.setResponse(null); }
        }
    }

    private static org.wheatgenetics.javalib.Utils.Response threadedGet(
    final org.wheatgenetics.javalib.Utils.BaseThread thread)
    {
        if (null == thread)
            return null;
        else
        {
            thread.start();
            try { thread.join(); } catch (final java.lang.InterruptedException e) { return null; }

            return thread.getResponse();
        }
    }

    @java.lang.SuppressWarnings({"unused"})
    public static org.wheatgenetics.javalib.Utils.Response threadedGet(final java.net.URL url)
    {
        return org.wheatgenetics.javalib.Utils.threadedGet(
            new org.wheatgenetics.javalib.Utils.DefaultTimeoutThread(url));
    }

    public static org.wheatgenetics.javalib.Utils.Response threadedGet(
    final java.net.URL url, final int timeout)
    {
        return org.wheatgenetics.javalib.Utils.threadedGet(
            new org.wheatgenetics.javalib.Utils.CustomTimeoutThread(url, timeout));
    }
    // endregion
    // endregion
}