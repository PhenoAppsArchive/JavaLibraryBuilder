package org.wheatgenetics.javalib;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Before
 * org.junit.Test
 *
 * org.wheatgenetics.javalib.Dir
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class DirTest extends java.lang.Object
{
    // region Fields
    private static final java.io.File TMP_FOLDER =
        new java.io.File(java.lang.System.getProperty("java.io.tmpdir"));
    private final org.wheatgenetics.javalib.Dir tmpDir = new org.wheatgenetics.javalib.Dir(
        org.wheatgenetics.javalib.DirTest.TMP_FOLDER,null);

    private static final java.lang.String TMP_SUB_FOLDER_NAME = "tmpsubdir";
    private static final java.io.File     TMP_SUB_FOLDER      = new java.io.File(
        org.wheatgenetics.javalib.DirTest.TMP_FOLDER         ,
        org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER_NAME);
    private final org.wheatgenetics.javalib.Dir tmpSubDir = new org.wheatgenetics.javalib.Dir(
        org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER,null);

    private static final java.lang.String TMP_FILE_NAME = "tmpfile.xml";
    private static final java.io.File     TMP_FILE      = new java.io.File(
        org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER,
        org.wheatgenetics.javalib.DirTest.TMP_FILE_NAME );
    // endregion

    // region Private Methods
    private static void deleteTmpFile()
    {
        if (org.wheatgenetics.javalib.DirTest.TMP_FILE.exists())
            // noinspection ResultOfMethodCallIgnored
            org.wheatgenetics.javalib.DirTest.TMP_FILE.delete();
    }

    private static void deleteTmpSubFolder()
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpFile();

        if (org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER.exists())
        {
            final java.lang.String list[] = org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER.list();
            if (null != list) org.junit.Assert.assertTrue(list.length <= 0);

            // noinspection ResultOfMethodCallIgnored
            org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER.delete();
        }
    }
    // endregion

    @org.junit.Before() public void setUp()
    { org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder(); }

    // region Protected Method Tests
    @org.junit.Test() public void getPathSucceeds()
    {
        org.junit.Assert.assertSame(
            org.wheatgenetics.javalib.DirTest.TMP_FOLDER, this.tmpDir.getPath());
    }

    @org.junit.Test() public void permissionGrantedSucceeds()
    { org.junit.Assert.assertFalse(this.tmpDir.permissionGranted()); }

    @org.junit.Test() public void requestPermissionDoesNothing()
    {
        org.junit.Assert.assertFalse(this.tmpDir.permissionGranted());
        this.tmpDir.requestPermission();
        org.junit.Assert.assertFalse(this.tmpDir.permissionGranted());
    }
    // endregion

    // region Constructor Tests
    // region First Constructor Tests
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void firstConstructorWorks()
    {
        new org.wheatgenetics.javalib.Dir(
            /* path                => */ (java.io.File)    null,
            /* blankHiddenFileName => */null);
    }

    @org.junit.Test() public void firstConstructorSucceeds()
    {
        new org.wheatgenetics.javalib.Dir(
            /* path                => */ org.wheatgenetics.javalib.DirTest.TMP_FOLDER,
            /* blankHiddenFileName => */null                  );
    }
    // endregion

    // region Second Constructor Tests
    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void nullParentSecondConstructorWorks()
    { new org.wheatgenetics.javalib.Dir(null,null,null); }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void nullChildSecondConstructorWorks()
    {
        new org.wheatgenetics.javalib.Dir(
            /* parent              => */ org.wheatgenetics.javalib.DirTest.TMP_FOLDER,
            /* child               => */null                                   ,
            /* blankHiddenFileName => */null                       );
    }

    @org.junit.Test() public void secondConstructorSucceeds()
    {
        new org.wheatgenetics.javalib.Dir(
            /* parent              => */ org.wheatgenetics.javalib.DirTest.TMP_FOLDER         ,
            /* child               => */ org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER_NAME,
            /* blankHiddenFileName => */null                                );
    }
    // endregion

    // region Third Constructor Tests
    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void nullParentThirdConstructorWorks()
    {
        new org.wheatgenetics.javalib.Dir(
            /* parent => */ (org.wheatgenetics.javalib.Dir) null, /* child => */null);
    }

    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void nullChildThirdConstructorWorks()
    {
        new org.wheatgenetics.javalib.Dir(
            /* parent => */ new org.wheatgenetics.javalib.Dir(
                org.wheatgenetics.javalib.DirTest.TMP_FOLDER,null),
            /* child => */null);
    }

    @org.junit.Test() public void thirdConstructorSucceeds()
    {
        new org.wheatgenetics.javalib.Dir(
            /* parent => */ new org.wheatgenetics.javalib.Dir(
                org.wheatgenetics.javalib.DirTest.TMP_FOLDER,null),
            /* child => */ org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER_NAME);
    }
    // endregion
    // endregion

    // region Public Method Tests
    @org.junit.Test() public void getPathAsStringSucceeds()
    {
        org.junit.Assert.assertTrue(this.tmpDir.getPathAsString().equals(
            org.wheatgenetics.javalib.DirTest.TMP_FOLDER.getPath()));
    }

    @org.junit.Test() public void getExistsWorks()
    {
        org.junit.Assert.assertTrue (this.tmpDir.getExists());
        org.junit.Assert.assertFalse(new org.wheatgenetics.javalib.Dir(
            new java.io.File("asl;dfjals;fjl"),null).getExists());
    }

    // region createIfMissiong() Public Method Tests
    @org.junit.Test() public void nullCreateIfMissingWorks() throws java.io.IOException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        org.junit.Assert.assertNull(
            this.tmpSubDir.createIfMissing() /* throws java.io.IOException */);
        org.junit.Assert.assertTrue(org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER.exists());
    }

    @org.junit.Test() public void nonNullCreateIfMissingWorks() throws java.io.IOException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        {
            final java.io.File blankHiddenFile;
            {
                final org.wheatgenetics.javalib.Dir tmpSubDir = new org.wheatgenetics.javalib.Dir(
                    org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER,
                    org.wheatgenetics.javalib.DirTest.TMP_FILE_NAME );
                blankHiddenFile = tmpSubDir.createIfMissing();         // throws java.io.IOException
            }
            org.junit.Assert.assertNotNull(blankHiddenFile);
        }
        org.junit.Assert.assertTrue(org.wheatgenetics.javalib.DirTest.TMP_FILE.exists      ());
        org.junit.Assert.assertTrue(org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER.exists());
    }
    // endregion

    // region makeFile() Public Method Tests
    @org.junit.Test(expected = java.io.IOException.class)
    public void makeFileWorks() throws java.io.IOException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        this.tmpSubDir.makeFile("abc");                       // throws java.io.IOException
    }

    @org.junit.Test() public void makeFileSucceeds() throws java.io.IOException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        this.tmpSubDir.createIfMissing();                              // throws java.io.IOException
        this.tmpSubDir.makeFile(org.wheatgenetics.javalib.DirTest.TMP_FILE_NAME);   // throws java.-
    }                                                                               //  io.IOExcep-
    // endregion                                                                    //  tion

    @org.junit.Test() public void createNewFileSucceeds() throws java.io.IOException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        this.tmpSubDir.createIfMissing();                              // throws java.io.IOException
        this.tmpSubDir.createNewFile(org.wheatgenetics.javalib.DirTest.TMP_FILE_NAME);    // throws
        org.junit.Assert.assertTrue(org.wheatgenetics.javalib.DirTest.TMP_FILE.exists()); //  java.-
    }                                                                                     //  io.IO-
                                                                                          //  Excep-
    @org.junit.Test() public void createNewDirSucceeds() throws java.io.IOException         //  tion
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        this.tmpSubDir.createIfMissing();                              // throws java.io.IOException

        final java.io.File tmpSubSubFolder;
        {
            final java.lang.String tmpSubSubFolderName = "abc";
            tmpSubSubFolder = new java.io.File(
                org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER, tmpSubSubFolderName);
            this.tmpSubDir.createNewDir(tmpSubSubFolderName);
        }
        org.junit.Assert.assertTrue(tmpSubSubFolder.exists());

        // noinspection ResultOfMethodCallIgnored
        tmpSubSubFolder.delete();
    }

    // region list() Public Method Tests
    @org.junit.Test() public void listWorks()
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        org.junit.Assert.assertNull(this.tmpSubDir.list());
    }

    @org.junit.Test() public void listSucceeds() throws java.io.IOException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        this.tmpSubDir.createIfMissing();                              // throws java.io.IOException

        final java.lang.String list[] = this.tmpSubDir.list();
        org.junit.Assert.assertNotNull(list                     );
        org.junit.Assert.assertTrue   (list.length == 0);
    }

    @org.junit.Test() public void regexListSucceeds() throws java.io.IOException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        this.tmpSubDir.createIfMissing();                              // throws java.io.IOException
        this.tmpSubDir.createNewFile(org.wheatgenetics.javalib.DirTest.TMP_FILE_NAME);  // throws
                                                                                        //  java.io-
        final java.lang.String list[] = this.tmpSubDir.list(".+\\.xml");         //  .IOExcep-
        org.junit.Assert.assertNotNull(list                     );                      //  tion
        org.junit.Assert.assertTrue   (list.length == 1);
    }
    // endregion
    // endregion
}