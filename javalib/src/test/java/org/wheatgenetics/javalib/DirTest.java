package org.wheatgenetics.javalib;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Before
 * org.junit.Test
 *
 * org.wheatgenetics.javalib.Dir
 * org.wheatgenetics.javalib.Dir.PermissionException
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class DirTest extends java.lang.Object
{
    // region Constants and Fields
    private static final java.io.File TMP_FOLDER =
        new java.io.File(java.lang.System.getProperty("java.io.tmpdir"));
    private final org.wheatgenetics.javalib.Dir tmpDir = new org.wheatgenetics.javalib.Dir(
        /* path => */ org.wheatgenetics.javalib.DirTest.TMP_FOLDER,null);

    private static final java.lang.String TMP_SUB_FOLDER_NAME = "tmpsubdir";
    private static final java.io.File     TMP_SUB_FOLDER      = new java.io.File(
        /* parent => */ org.wheatgenetics.javalib.DirTest.TMP_FOLDER         ,
        /* child  => */ org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER_NAME);
    private final org.wheatgenetics.javalib.Dir tmpSubDir = new org.wheatgenetics.javalib.Dir(
        /* path => */ org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER,null);

    private static final java.lang.String TMP_FILE_NAME = "tmpfile.xml";
    private static final java.io.File     TMP_FILE      = new java.io.File(
        /* parent => */ org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER,
        /* child  => */ org.wheatgenetics.javalib.DirTest.TMP_FILE_NAME );
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

    @org.junit.Test() public void permissionGrantedWorks()
    { org.junit.Assert.assertFalse(this.tmpDir.permissionGranted()); }

    @org.junit.Test() public void requestPermissionDoesNothing()
    { org.junit.Assert.assertFalse(this.tmpDir.requestPermission()); }
    // endregion

    // region Constructor Tests
    // region First Constructor Tests
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void firstConstructorWorks()
    {
        new org.wheatgenetics.javalib.Dir(
            /* path                => */ (java.io.File) null,
            /* blankHiddenFileName => */null);
    }

    @org.junit.Test() public void firstConstructorSucceeds()
    {
        new org.wheatgenetics.javalib.Dir(
            /* path                => */ org.wheatgenetics.javalib.DirTest.TMP_FOLDER,
            /* blankHiddenFileName => */null);
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
            /* child               => */null,
            /* blankHiddenFileName => */null);
    }

    @org.junit.Test() public void secondConstructorSucceeds()
    {
        new org.wheatgenetics.javalib.Dir(
            /* parent              => */ org.wheatgenetics.javalib.DirTest.TMP_FOLDER         ,
            /* child               => */ org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER_NAME,
            /* blankHiddenFileName => */null);
    }
    // endregion

    // region Third Constructor Tests
    @org.junit.Test(expected = java.lang.NullPointerException.class)
    public void nullParentThirdConstructorWorks()
    {
        // noinspection ConstantConditions
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
        // noinspection SimplifiableJUnitAssertion
        org.junit.Assert.assertTrue(this.tmpDir.getPathAsString().equals(
            org.wheatgenetics.javalib.DirTest.TMP_FOLDER.getPath()));
    }

    @org.junit.Test() public void getExistsWorks()
    throws org.wheatgenetics.javalib.Dir.PermissionException
    {
        org.junit.Assert.assertTrue(this.tmpDir.getExists() /* throws PermissionException */);
        org.junit.Assert.assertFalse(new org.wheatgenetics.javalib.Dir(
            /* path => */ new java.io.File("asl;dfjals;fjl"),null)
                .getExists() /* throws PermissionException */);
    }

    // region createIfMissing() Public Method Tests
    @org.junit.Test() public void nullCreateIfMissingWorks()
    throws java.io.IOException, org.wheatgenetics.javalib.Dir.PermissionException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        org.junit.Assert.assertNull(this.tmpSubDir.createIfMissing() /* throws
            java.io.IOException, org.wheatgenetics.javalib.Dir.PermissionException */);
        org.junit.Assert.assertTrue(org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER.exists());
    }

    @org.junit.Test() public void nonNullCreateIfMissingWorks()
    throws java.io.IOException, org.wheatgenetics.javalib.Dir.PermissionException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        {
            final java.io.File blankHiddenFile;
            {
                final org.wheatgenetics.javalib.Dir tmpSubDir = new org.wheatgenetics.javalib.Dir(
                    /* path                => */ org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER,
                    /* blankHiddenFileName => */ org.wheatgenetics.javalib.DirTest.TMP_FILE_NAME );
                blankHiddenFile = tmpSubDir.createIfMissing();  // throws java.io.IOException, org.-
            }                                                   //  wheatgenetics.javalib.Dir.Per-
            org.junit.Assert.assertNotNull(blankHiddenFile);    //  missionException
        }
        org.junit.Assert.assertTrue(org.wheatgenetics.javalib.DirTest.TMP_FILE.exists      ());
        org.junit.Assert.assertTrue(org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER.exists());
    }
    // endregion

    // region makeFile() Public Method Tests
    @org.junit.Test(expected = java.io.IOException.class) public void makeFileWorks()
    throws java.io.IOException, org.wheatgenetics.javalib.Dir.PermissionException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        this.tmpSubDir.makeFile("abc");         // throws java.io.IOException, org.wheatge-
    }                                                    //  netics.javalib.Dir.PermissionException

    @org.junit.Test() public void makeFileSucceeds()
    throws java.io.IOException, org.wheatgenetics.javalib.Dir.PermissionException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        this.tmpSubDir.createIfMissing();                             // throws java.io.IOException,
        this.tmpSubDir.makeFile(                                      //  PermissionException
            org.wheatgenetics.javalib.DirTest.TMP_FILE_NAME);         // throws java.io.IOException,
    }                                                                 //  PermissionException
    // endregion

    @org.junit.Test() public void createNewFileSucceeds()
    throws java.io.IOException, org.wheatgenetics.javalib.Dir.PermissionException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        this.tmpSubDir.createIfMissing();                             // throws java.io.IOException,
        this.tmpSubDir.createNewFile(                                 //  PermissionException
            org.wheatgenetics.javalib.DirTest.TMP_FILE_NAME);         // throws java.io.IOException,
        org.junit.Assert.assertTrue(                                  //  PermissionException
            org.wheatgenetics.javalib.DirTest.TMP_FILE.exists());
    }

    @org.junit.Test() public void createNewDirSucceeds()
    throws java.io.IOException, org.wheatgenetics.javalib.Dir.PermissionException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        this.tmpSubDir.createIfMissing();                // throws java.io.IOException, org.wheatge-
                                                         //  netics.javalib.Dir.PermissionException
        final java.io.File tmpSubSubFolder;
        {
            final java.lang.String tmpSubSubFolderName = "abc";
            tmpSubSubFolder = new java.io.File(
                /* parent => */ org.wheatgenetics.javalib.DirTest.TMP_SUB_FOLDER,
                /* child  => */ tmpSubSubFolderName                             );
            this.tmpSubDir.createNewDir(tmpSubSubFolderName);      // throws org.wheatgenetics.java-
        }                                                          //  lib.Dir.PermissionException
        org.junit.Assert.assertTrue(tmpSubSubFolder.exists());

        // noinspection ResultOfMethodCallIgnored
        tmpSubSubFolder.delete();
    }

    // region list() Public Method Tests
    @org.junit.Test() public void listWorks()
    throws org.wheatgenetics.javalib.Dir.PermissionException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        org.junit.Assert.assertNull(this.tmpSubDir.list() /* throws
            org.wheatgenetics.javalib.Dir.PermissionException */);
    }

    @org.junit.Test() public void listSucceeds()
    throws java.io.IOException, org.wheatgenetics.javalib.Dir.PermissionException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        this.tmpSubDir.createIfMissing();                // throws java.io.IOException, org.wheatge-
                                                         //  netics.javalib.Dir.PermissionException
        final java.lang.String list[] = this.tmpSubDir.list();     // throws org.wheatgenetics.java-
        org.junit.Assert.assertNotNull(list);                      //  lib.Dir.PermissionException
        org.junit.Assert.assertEquals (0, list.length);
    }

    @org.junit.Test() public void regexListSucceeds()
    throws java.io.IOException, org.wheatgenetics.javalib.Dir.PermissionException
    {
        org.wheatgenetics.javalib.DirTest.deleteTmpSubFolder();
        this.tmpSubDir.createIfMissing();                 // throws IOException, PermissionException
        this.tmpSubDir.createNewFile(                     // throws IOException, PermissionException
            org.wheatgenetics.javalib.DirTest.TMP_FILE_NAME);

        {
            final java.lang.String list[] = this.tmpSubDir.list(".+\\.xml"); // throws Permis-
            org.junit.Assert.assertNotNull(list);                                  //  sionException
            org.junit.Assert.assertEquals (1, list.length);
        }

        final java.lang.String list[] = this.tmpSubDir.list(".+\\.abc");    // throws Permis-
        org.junit.Assert.assertNull(list);                                         //  sionException
    }
    // endregion
    // endregion
}