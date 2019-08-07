package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.wheatgenetics.javalib.mstrdtl.TestItem
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class TestItemTest extends java.lang.Object
{
    @org.junit.Test() public void constructorSucceeds()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            new org.wheatgenetics.javalib.mstrdtl.TestItem();
        testItem.setPosition(2);
        org.junit.Assert.assertEquals("2"     , testItem.getPositionAsString());
        org.junit.Assert.assertEquals("Item 3", testItem.getTitle           ());
        org.junit.Assert.assertEquals("Content of Item 3:" +
                "\nMore information here.\nMore information here.\nMore information here.",
            testItem.getContent());
    }

    // region setPosition() Tests
    @org.junit.Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void tooSmallPositionSetPositionThrows()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            new org.wheatgenetics.javalib.mstrdtl.TestItem();
        testItem.setPosition(-2);
    }

    @org.junit.Test() public void tooSmallPositionSetPositionHasCorrectMessage()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            new org.wheatgenetics.javalib.mstrdtl.TestItem();
        try { testItem.setPosition(-5); }
        catch (final java.lang.IndexOutOfBoundsException e)
        {
            org.junit.Assert.assertEquals(
                org.wheatgenetics.javalib.mstrdtl.TestItem.TOO_SMALL_POSITION_MESSAGE,
                e.getMessage()                                                       );
        }
    }

    @org.junit.Test public void setPositionAlsoSetsTitleAndContent()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            new org.wheatgenetics.javalib.mstrdtl.TestItem();
        testItem.setPosition(0);
        org.junit.Assert.assertEquals("0"     , testItem.getPositionAsString());
        org.junit.Assert.assertEquals("Item 1", testItem.getTitle           ());
        org.junit.Assert.assertEquals("Content of Item 1:\nMore information here.",
            testItem.getContent());

        testItem.setPosition(2);
        org.junit.Assert.assertEquals("2"     , testItem.getPositionAsString());
        org.junit.Assert.assertEquals("Item 3", testItem.getTitle           ());
        org.junit.Assert.assertEquals("Content of Item 3:" +
                "\nMore information here.\nMore information here.\nMore information here.",
            testItem.getContent());
    }
    // endregion

    // region setContent() Tests
    @org.junit.Test() public void nullSetContentWorks()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            new org.wheatgenetics.javalib.mstrdtl.TestItem();
        testItem.setContent(null);
        org.junit.Assert.assertNotNull(testItem.getContent());
    }

    @org.junit.Test() public void setContentWorks()
    {
        final java.lang.String                           testContent = "testContent";
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem    =
            new org.wheatgenetics.javalib.mstrdtl.TestItem();
        testItem.setContent(testContent);
        org.junit.Assert.assertEquals(testContent, testItem.getContent());
    }
    // endregion
}