package org.wheatgenetics.javalibrarybuilder;

/**
 * Uses:
 * android.os.Bundle
 * android.support.v7.app.AppCompatActivity
 * android.widget.TextView
 *
 * org.wheatgenetics.javalib.Utils
 * org.wheatgenetics.javalibrarybuilder.BuildConfig
 * org.wheatgenetics.javalibrarybuilder.R
 */

public class MainActivity extends android.support.v7.app.AppCompatActivity
{
    @java.lang.Override
    protected void onCreate(final android.os.Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(org.wheatgenetics.javalibrarybuilder.R.layout.activity_main);

        final int                     number   = 2;
        final android.widget.TextView textView = (android.widget.TextView)
            this.findViewById(org.wheatgenetics.javalibrarybuilder.R.id.textView);
        if (org.wheatgenetics.javalibrarybuilder.BuildConfig.DEBUG && null == textView)
            throw new java.lang.AssertionError();
        textView.setText(java.lang.String.format("double(%d) is %d",
            number, org.wheatgenetics.javalib.Utils.doubleOf(number)));
    }
}