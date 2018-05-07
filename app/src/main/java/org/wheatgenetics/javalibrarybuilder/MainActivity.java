package org.wheatgenetics.javalibrarybuilder;

/**
 * Uses:
 * android.os.Bundle
 * android.support.v7.app.AppCompatActivity
 *
 * org.wheatgenetics.javalibrarybuilder.R
 */
public class MainActivity extends android.support.v7.app.AppCompatActivity
{
    @java.lang.Override protected void onCreate(final android.os.Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(org.wheatgenetics.javalibrarybuilder.R.layout.activity_main);
    }
}