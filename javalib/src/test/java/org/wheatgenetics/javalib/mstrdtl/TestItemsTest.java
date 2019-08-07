package org.wheatgenetics.javalib.mstrdtl;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.wheatgenetics.javalib.mstrdtl.TestItem
 * org.wheatgenetics.javalib.mstrdtl.TestItems
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class TestItemsTest extends java.lang.Object
{
    @org.junit.Test() public void nullSizeIsZero()
    {
        org.junit.Assert.assertEquals(0,
            new org.wheatgenetics.javalib.mstrdtl.TestItems().size());
    }

    @org.junit.Test() public void sizeAndAppendAndGetWork()
    {
        final org.wheatgenetics.javalib.mstrdtl.TestItems testItems =
            new org.wheatgenetics.javalib.mstrdtl.TestItems();
        testItems.append(); org.junit.Assert.assertEquals(1, testItems.size());

        {
            final org.wheatgenetics.javalib.mstrdtl.TestItem testItem =
                new org.wheatgenetics.javalib.mstrdtl.TestItem();
            testItem.setPosition(27); testItems.append(testItem);
        }
        org.junit.Assert.assertEquals(2  , testItems.size());
        org.junit.Assert.assertEquals("1", testItems.get(1).getPositionAsString());
    }
}