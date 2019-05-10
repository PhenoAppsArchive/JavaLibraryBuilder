package org.wheatgenetics.changelog;

@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
class ChangeLog extends java.lang.Object
{
    @java.lang.SuppressWarnings({"UnnecessaryInterfaceModifier"}) interface LineHandler
    {
        public abstract void handleBlankLine();
        public abstract void handleVersionLine(final java.lang.String version);
        public abstract void handleContentLine(final java.lang.String content);
    }

    // region Fields
    private final java.io.InputStreamReader                         inputStreamReader;
    private final org.wheatgenetics.changelog.ChangeLog.LineHandler lineHandler      ;

    private java.lang.String lines[] = null;
    // endregion

    @java.lang.SuppressWarnings({"unused"}) ChangeLog(
    final java.io.InputStreamReader                         inputStreamReader,
    final org.wheatgenetics.changelog.ChangeLog.LineHandler lineHandler      )
    { super(); this.inputStreamReader = inputStreamReader; this.lineHandler = lineHandler; }

    @java.lang.SuppressWarnings({"unused"}) void iterate() throws java.io.IOException
    {
        if (null == this.lines)
        {
            @java.lang.SuppressWarnings({"Convert2Diamond"})
            final java.util.ArrayList<java.lang.String> arrayList =
                new java.util.ArrayList<java.lang.String>();
            {
                final java.io.BufferedReader bufferedReader =
                    new java.io.BufferedReader(this.inputStreamReader,8192);
                java.lang.String line;
                while (null != (line = bufferedReader.readLine()))     // throws java.io.IOException
                    arrayList.add(line);
            }
            this.lines = new java.lang.String[arrayList.size()];
            this.lines = arrayList.toArray(this.lines)         ;
        }

        java.lang.String version = null;
        assert null != this.lineHandler;
        for (final java.lang.String line: this.lines)
            if (0 == line.length())
            {
                version = null;
                this.lineHandler.handleBlankLine();
            }
            else
                if (null == version)
                {
                    {
                        final java.lang.String splitLine[] = line.split("/");
                        version = splitLine[1];
                    }
                    this.lineHandler.handleVersionLine(version);
                }
                else this.lineHandler.handleContentLine("•  " + line);
    }
}