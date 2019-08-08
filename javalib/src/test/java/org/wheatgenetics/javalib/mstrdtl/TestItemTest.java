package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.wheatgenetics.javalib.mstrdtl.TestItem
 * org.wheatgenetics.javalib.mstrdtl.TestItem.Container
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class TestItemTest extends java.lang.Object
{
    private org.wheatgenetics.javalib.mstrdtl.TestItem.Container
        falseContainerInstance = null, trueContainerInstance;                          // lazy loads

    // region Private Methods
    private org.wheatgenetics.javalib.mstrdtl.TestItem.Container falseContainer()
    {
        if (null == this.falseContainerInstance)
            // noinspection Convert2Lambda
            this.falseContainerInstance = new org.wheatgenetics.javalib.mstrdtl.TestItem.Container()
                {
                    @java.lang.Override public boolean canMoveDown(final int position)
                    { return false; }
                };
        return this.falseContainerInstance;
    }

    private org.wheatgenetics.javalib.mstrdtl.TestItem.Container trueContainer()
    {
        if (null == this.trueContainerInstance)
            // noinspection Convert2Lambda
            this.trueContainerInstance = new org.wheatgenetics.javalib.mstrdtl.TestItem.Container()
                {
                    @java.lang.Override public boolean canMoveDown(final int position)
                    { return true; }
                };
        return this.trueContainerInstance;
    }
    // endregion

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

    @org.junit.Test() public void setPositionWorks()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            new org.wheatgenetics.javalib.mstrdtl.TestItem();
        testItem.setPosition(0);
        org.junit.Assert.assertEquals("0", testItem.getPositionAsString());

        testItem.setPosition(2);
        org.junit.Assert.assertEquals("2", testItem.getPositionAsString());
    }
    // endregion

    // region canMoveUp() Tests
    @org.junit.Test() public void nullContainerCanMoveUpIsFalse()
    { org.junit.Assert.assertFalse(new org.wheatgenetics.javalib.mstrdtl.TestItem().canMoveUp()); }

    @org.junit.Test() public void zeroPositionCanMoveUpIsFalse()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            new org.wheatgenetics.javalib.mstrdtl.TestItem();
        testItem.setPosition(0); testItem.setContainer(this.trueContainer());
        org.junit.Assert.assertFalse(testItem.canMoveUp());
    }

    @org.junit.Test() public void nonZeroPositionCanMoveUpIsFalse()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            new org.wheatgenetics.javalib.mstrdtl.TestItem();
        testItem.setPosition(55); testItem.setContainer(this.trueContainer());
        org.junit.Assert.assertTrue(testItem.canMoveUp());
    }
    // endregion

    // region canMoveDown() Tests
    @org.junit.Test() public void nullContainerCanMoveDownIsFalse()
    {
        org.junit.Assert.assertFalse(
            new org.wheatgenetics.javalib.mstrdtl.TestItem().canMoveDown());
    }

    @org.junit.Test() public void falseContainerCanMoveDownIsFalse()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            new org.wheatgenetics.javalib.mstrdtl.TestItem();
        testItem.setContainer(this.falseContainer());
        org.junit.Assert.assertFalse(testItem.canMoveDown());
    }

    @org.junit.Test() public void trueContainerCanMoveDownIsTrue()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            new org.wheatgenetics.javalib.mstrdtl.TestItem();
        testItem.setContainer(this.trueContainer());
        org.junit.Assert.assertTrue(testItem.canMoveDown());
    }
    // endregion

    @org.junit.Test() public void setTitleAndContentWorks()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
            new org.wheatgenetics.javalib.mstrdtl.TestItem();
        testItem.setPosition(0); testItem.setTitleAndContent();
        org.junit.Assert.assertEquals("Item 1", testItem.getTitle           ());
        org.junit.Assert.assertEquals("Content of Item 1:\nMore information here.",
            testItem.getContent());

        testItem.setPosition(2); testItem.setTitleAndContent();
        org.junit.Assert.assertEquals("Item 3", testItem.getTitle           ());
        org.junit.Assert.assertEquals("Content of Item 3:" +
                "\nMore information here.\nMore information here.\nMore information here.",
            testItem.getContent());
    }

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