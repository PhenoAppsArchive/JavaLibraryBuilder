package org.wheatgenetics.brapi1_3.studies;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class NewObservationsTableRequestTest extends java.lang.Object
{
    private final org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest
        newObservationsTableRequest =
            new org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest();

    // region headerRow Package Methods
    @org.junit.Test() public void clearHeaderRow()
    {
        this.newObservationsTableRequest.headerRow(null).addHeaderRowItem("test");
        final java.util.List<java.lang.String> headerRow =
            this.newObservationsTableRequest.getHeaderRow();
        org.junit.Assert.assertEquals(1, headerRow.size());

        this.newObservationsTableRequest.clearHeaderRow();
        org.junit.Assert.assertEquals(0, headerRow.size());
    }

    // region setHeaderRow() Package Methods
    // region setHeaderRowFromCSV() Package Methods
    @org.junit.Test() public void nullSetHeaderRowFromCSV()
    {
        this.newObservationsTableRequest.setHeaderRowFromCSV(null);
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getHeaderRow     ());
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getHeaderRowAsCSV());
    }

    @org.junit.Test() public void emptySetHeaderRowFromCSV()
    {
        this.newObservationsTableRequest.setHeaderRowFromCSV("");
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getHeaderRow     ());
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getHeaderRowAsCSV());
    }

    @org.junit.Test() public void spacesSetHeaderRowFromCSV()
    {
        this.newObservationsTableRequest.setHeaderRowFromCSV("  ");
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getHeaderRow     ());
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getHeaderRowAsCSV());
    }

    @org.junit.Test() public void singleFieldSetHeaderRowFromCSV()
    {
        this.newObservationsTableRequest.setHeaderRowFromCSV("\"year\"");

        {
            final java.util.List<java.lang.String> headerRow =
                this.newObservationsTableRequest.getHeaderRow();
            org.junit.Assert.assertNotNull(headerRow);
            org.junit.Assert.assertEquals(1     , headerRow.size());
            org.junit.Assert.assertEquals("year", headerRow.get(0));
        }
        org.junit.Assert.assertEquals("\"year\"",
            this.newObservationsTableRequest.getHeaderRowAsCSV());
    }

    @org.junit.Test() public void embeddedDoubleQuoteSingleFieldSetHeaderRowFromCSV()
    {
        this.newObservationsTableRequest.setHeaderRowFromCSV("\"yea\"\"r\"");

        {
            final java.util.List<java.lang.String> headerRow =
                this.newObservationsTableRequest.getHeaderRow();
            org.junit.Assert.assertNotNull(headerRow);
            org.junit.Assert.assertEquals(1       , headerRow.size());
            org.junit.Assert.assertEquals("yea\"r", headerRow.get(0));
        }
        org.junit.Assert.assertEquals("\"yea\"r\"",
            this.newObservationsTableRequest.getHeaderRowAsCSV());
    }

    @org.junit.Test() public void multipleFieldsSetHeaderRowFromCSV()
    {
        this.newObservationsTableRequest.setHeaderRowFromCSV(
            "\"year\",\"studyDbId\",\"study\"\"Name\"");

        {
            final java.util.List<java.lang.String> headerRow =
                this.newObservationsTableRequest.getHeaderRow();
            org.junit.Assert.assertNotNull(headerRow);
            org.junit.Assert.assertEquals (3            , headerRow.size());
            org.junit.Assert.assertEquals ("year"       , headerRow.get(0));
            org.junit.Assert.assertEquals ("studyDbId"  , headerRow.get(1));
            org.junit.Assert.assertEquals ("study\"Name", headerRow.get(2));
        }
        org.junit.Assert.assertEquals("\"year\",\"studyDbId\",\"study\"Name\"",
            this.newObservationsTableRequest.getHeaderRowAsCSV());
    }
    // endregion

    // region setHeaderRowFromTSV() Package Methods
    @org.junit.Test() public void singleFieldSetHeaderRowFromTSV()
    {
        this.newObservationsTableRequest.setHeaderRowFromTSV("\"year\"");

        {
            final java.util.List<java.lang.String> headerRow =
                this.newObservationsTableRequest.getHeaderRow();
            org.junit.Assert.assertNotNull(headerRow);
            org.junit.Assert.assertEquals (1     , headerRow.size());
            org.junit.Assert.assertEquals ("year", headerRow.get(0));
        }
        org.junit.Assert.assertEquals("\"year\"",
            this.newObservationsTableRequest.getHeaderRowAsTSV());
    }

    @org.junit.Test() public void multipleFieldsSetHeaderRowFromTSV()
    {
        this.newObservationsTableRequest.setHeaderRowFromTSV(
            "\"year\"\t\"studyDbId\"\t\"studyName\"");

        {
            final java.util.List<java.lang.String> headerRow =
                this.newObservationsTableRequest.getHeaderRow();
            org.junit.Assert.assertNotNull(headerRow);
            org.junit.Assert.assertEquals (3          , headerRow.size());
            org.junit.Assert.assertEquals ("year"     , headerRow.get(0));
            org.junit.Assert.assertEquals ("studyDbId", headerRow.get(1));
            org.junit.Assert.assertEquals ("studyName", headerRow.get(2));
        }
        org.junit.Assert.assertEquals("\"year\"\t\"studyDbId\"\t\"studyName\"",
            this.newObservationsTableRequest.getHeaderRowAsTSV());
    }
    // endregion
    // endregion

    // region getHeaderRow() Package Methods
    // region getHeaderRowAsCSV() Package Methods
    @org.junit.Test() public void nullGetHeaderRowAsCSV()
    {
        this.newObservationsTableRequest.setHeaderRow(null);
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getHeaderRowAsCSV());
    }

    @org.junit.Test() public void emptyGetHeaderRowAsCSV()
    {
        // noinspection Convert2Diamond
        this.newObservationsTableRequest.setHeaderRow(new java.util.ArrayList<java.lang.String>());

        org.junit.Assert.assertNull(this.newObservationsTableRequest.getHeaderRowAsCSV());
    }

    @org.junit.Test() public void spacesGetHeaderRowAsCSV()
    {
        this.newObservationsTableRequest.setHeaderRowFromCSV("   ");
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getHeaderRowAsCSV());

        this.newObservationsTableRequest.addHeaderRowItem("  ");
        final java.lang.String headerRow = this.newObservationsTableRequest.getHeaderRowAsCSV();
        org.junit.Assert.assertNotNull(headerRow);
        org.junit.Assert.assertEquals ("\"  \"", headerRow);
    }

    @org.junit.Test() public void singleFieldGetHeaderRowAsCSV()
    {
        this.newObservationsTableRequest.clearHeaderRow();
        this.newObservationsTableRequest.addHeaderRowItem("year");
        org.junit.Assert.assertEquals("\"year\"",
            this.newObservationsTableRequest.getHeaderRowAsCSV());
    }

    @org.junit.Test() public void embeddedDoubleQuoteSingleFieldGetHeaderRowAsCSV()
    {
        this.newObservationsTableRequest.clearHeaderRow();
        this.newObservationsTableRequest.addHeaderRowItem("y\"ear");
        org.junit.Assert.assertEquals("\"y\"ear\"",
            this.newObservationsTableRequest.getHeaderRowAsCSV());

        this.newObservationsTableRequest.setHeaderRowFromCSV("\"y\"\"ear\"");
        org.junit.Assert.assertEquals("\"y\"ear\"",
            this.newObservationsTableRequest.getHeaderRowAsCSV());
    }

    @org.junit.Test() public void multipleFieldsGetHeaderRowAsCSV()
    {
        this.newObservationsTableRequest.clearHeaderRow();
        this.newObservationsTableRequest.addHeaderRowItem("year"     );
        this.newObservationsTableRequest.addHeaderRowItem("studyDbId");
        this.newObservationsTableRequest.addHeaderRowItem("studyName");
        org.junit.Assert.assertEquals("\"year\",\"studyDbId\",\"studyName\"",
            this.newObservationsTableRequest.getHeaderRowAsCSV());

        this.newObservationsTableRequest.setHeaderRowFromCSV(
            "\"year\",\"studyDbId\",\"studyName\"");
        org.junit.Assert.assertEquals("\"year\",\"studyDbId\",\"studyName\"",
            this.newObservationsTableRequest.getHeaderRowAsCSV());
    }
    // endregion

    // region getHeaderRowAsTSV() Package Methods
    @org.junit.Test() public void singleFieldGetHeaderRowAsTSV()
    {
        this.newObservationsTableRequest.clearHeaderRow();
        this.newObservationsTableRequest.addHeaderRowItem("year");
        org.junit.Assert.assertEquals("\"year\"",
            this.newObservationsTableRequest.getHeaderRowAsTSV());
    }

    @org.junit.Test() public void multipleFieldsGetHeaderRowAsTSV()
    {
        this.newObservationsTableRequest.clearHeaderRow();
        this.newObservationsTableRequest.addHeaderRowItem("year"     );
        this.newObservationsTableRequest.addHeaderRowItem("studyDbId");
        this.newObservationsTableRequest.addHeaderRowItem("studyName");
        org.junit.Assert.assertEquals ("\"year\"\t\"studyDbId\"\t\"studyName\"",
            this.newObservationsTableRequest.getHeaderRowAsTSV());

        this.newObservationsTableRequest.setHeaderRowFromTSV(
            "\"year\"\t\"studyDbId\"\t\"studyName\"");
        org.junit.Assert.assertEquals ("\"year\"\t\"studyDbId\"\t\"studyName\"",
            this.newObservationsTableRequest.getHeaderRowAsTSV());
    }
    // endregion
    // endregion
    // endregion

    // region data Package Methods
    @org.junit.Test() public void clearData()
    {
        // noinspection Convert2Diamond
        this.newObservationsTableRequest.data(null).addDataItem(
            new java.util.ArrayList<java.lang.String>(java.util.Collections.singletonList("test")));

        final java.util.List<java.util.List<java.lang.String>> data =
            this.newObservationsTableRequest.getData();
        org.junit.Assert.assertEquals(1, data.size());

        this.newObservationsTableRequest.clearData();
        org.junit.Assert.assertEquals(0, data.size());
    }

    // region setData() Package Methods
    // region setDataFromCSV() Package Methods
    @org.junit.Test() public void nullSetDataFromCSV()
    {
        this.newObservationsTableRequest.setDataFromCSV(null);
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getData     ());
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getDataAsCSV());
    }

    @org.junit.Test() public void emptySetDataFromCSV()
    {
        this.newObservationsTableRequest.setDataFromCSV("");
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getData     ());
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getDataAsCSV());
    }

    @org.junit.Test() public void spacesSetDataFromCSV()
    {
        this.newObservationsTableRequest.setDataFromCSV("   ");
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getData     ());
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getDataAsCSV());
    }

    @org.junit.Test() public void singleFieldSingleLineSetDataFromCSV()
    {
        this.newObservationsTableRequest.setDataFromCSV("\"abc\"");

        {
            final java.util.List<java.lang.String> line;
            {
                final java.util.List<java.util.List<java.lang.String>> data =
                    this.newObservationsTableRequest.getData();
                org.junit.Assert.assertNotNull(data);
                org.junit.Assert.assertEquals (1, data.size());
                line = data.get(0);
            }
            org.junit.Assert.assertNotNull(line);
            org.junit.Assert.assertEquals (1    , line.size());
            org.junit.Assert.assertEquals ("abc", line.get(0));
        }
        org.junit.Assert.assertEquals("\"abc\"",
            this.newObservationsTableRequest.getDataAsCSV());
    }

    @org.junit.Test() public void multipleFieldsSingleLineSetDataFromCSV()
    {
        this.newObservationsTableRequest.setDataFromCSV("\"abc\",\"123\"");

        {
            final java.util.List<java.lang.String> line;
            {
                final java.util.List<java.util.List<java.lang.String>> data =
                    this.newObservationsTableRequest.getData();
                org.junit.Assert.assertNotNull(data);
                org.junit.Assert.assertEquals (1, data.size());
                line = data.get(0);
            }
            org.junit.Assert.assertNotNull(line);
            org.junit.Assert.assertEquals (2    , line.size());
            org.junit.Assert.assertEquals ("abc", line.get(0));
            org.junit.Assert.assertEquals ("123", line.get(1));
        }
        org.junit.Assert.assertEquals("\"abc\",\"123\"",
            this.newObservationsTableRequest.getDataAsCSV());
    }

    @org.junit.Test() public void multipleFieldsMultipleLinesSetDataFromCSV()
    {
        this.newObservationsTableRequest.setDataFromCSV("\"abc\",\"123\"\n\"def\",\"456\"");

        {
            final java.util.List<java.lang.String> line1, line2;
            {
                final java.util.List<java.util.List<java.lang.String>> data =
                    this.newObservationsTableRequest.getData();
                org.junit.Assert.assertNotNull(data);
                org.junit.Assert.assertEquals (2, data.size());
                line1 = data.get(0); line2 = data.get(1);
            }
            org.junit.Assert.assertNotNull(line1);
            org.junit.Assert.assertEquals (2    , line1.size());
            org.junit.Assert.assertEquals ("abc", line1.get(0));
            org.junit.Assert.assertEquals ("123", line1.get(1));

            org.junit.Assert.assertNotNull(line2);
            org.junit.Assert.assertEquals (2    , line2.size());
            org.junit.Assert.assertEquals ("def", line2.get(0));
            org.junit.Assert.assertEquals ("456", line2.get(1));
        }
        org.junit.Assert.assertEquals("\"abc\",\"123\"\n\"def\",\"456\"",
            this.newObservationsTableRequest.getDataAsCSV());
    }
    // endregion

    // region setDataFromTSV() Package Methods
    @org.junit.Test() public void singleFieldSingleLineSetDataFromTSV()
    {
        this.newObservationsTableRequest.setDataFromTSV("\"abc\"");

        {
            final java.util.List<java.lang.String> line;
            {
                final java.util.List<java.util.List<java.lang.String>> data =
                    this.newObservationsTableRequest.getData();
                org.junit.Assert.assertNotNull(data);
                org.junit.Assert.assertEquals (1, data.size());
                line = data.get(0);
            }
            org.junit.Assert.assertNotNull(line);
            org.junit.Assert.assertEquals (1    , line.size());
            org.junit.Assert.assertEquals ("abc", line.get(0));
        }
        org.junit.Assert.assertEquals("\"abc\"",
            this.newObservationsTableRequest.getDataAsTSV());
    }

    @org.junit.Test() public void multipleFieldsSingleLineSetDataFromTSV()
    {
        this.newObservationsTableRequest.setDataFromTSV("\"abc\"\t\"123\"");

        {
            final java.util.List<java.lang.String> line;
            {
                final java.util.List<java.util.List<java.lang.String>> data =
                    this.newObservationsTableRequest.getData();
                org.junit.Assert.assertNotNull(data);
                org.junit.Assert.assertEquals (1, data.size());
                line = data.get(0);
            }
            org.junit.Assert.assertNotNull(line);
            org.junit.Assert.assertEquals (2    , line.size());
            org.junit.Assert.assertEquals ("abc", line.get(0));
            org.junit.Assert.assertEquals ("123", line.get(1));
        }
        org.junit.Assert.assertEquals("\"abc\"\t\"123\"",
            this.newObservationsTableRequest.getDataAsTSV());
    }

    @org.junit.Test() public void multipleFieldsMultipleLinesSetDataFromTSV()
    {
        this.newObservationsTableRequest.setDataFromTSV("\"abc\"\t\"123\"\n\"def\"\t\"456\"");

        {
            final java.util.List<java.lang.String> line1, line2;
            {
                final java.util.List<java.util.List<java.lang.String>> data =
                    this.newObservationsTableRequest.getData();
                org.junit.Assert.assertNotNull(data);
                org.junit.Assert.assertEquals (2, data.size());
                line1 = data.get(0); line2 = data.get(1);
            }
            org.junit.Assert.assertNotNull(line1);
            org.junit.Assert.assertEquals (2    , line1.size());
            org.junit.Assert.assertEquals ("abc", line1.get(0));
            org.junit.Assert.assertEquals ("123", line1.get(1));

            org.junit.Assert.assertNotNull(line2);
            org.junit.Assert.assertEquals (2    , line2.size());
            org.junit.Assert.assertEquals ("def", line2.get(0));
            org.junit.Assert.assertEquals ("456", line2.get(1));
        }
        org.junit.Assert.assertEquals("\"abc\"\t\"123\"\n\"def\"\t\"456\"",
            this.newObservationsTableRequest.getDataAsTSV());
    }
    // endregion
    // endregion

    // region getData() Package Methods
    // region getDataAsCSV() Package Methods
    @org.junit.Test() public void nullGetDataAsCSV()
    {
        this.newObservationsTableRequest.setData(null);
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getDataAsCSV());
    }

    @org.junit.Test() public void emptyGetDataAsCSV()
    {
        this.newObservationsTableRequest.setDataFromCSV("");
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getDataAsCSV());
    }

    @org.junit.Test() public void spacesGetDataAsCSV()
    {
        this.newObservationsTableRequest.setDataFromCSV("   ");
        org.junit.Assert.assertNull(this.newObservationsTableRequest.getDataAsCSV());
    }

    @org.junit.Test() public void singleFieldSingleLineGetDataAsCSV()
    {
        this.newObservationsTableRequest.clearData();

        // noinspection Convert2Diamond
        this.newObservationsTableRequest.addDataItem(new java.util.ArrayList<java.lang.String>(
            java.util.Collections.singletonList("abc")));

        org.junit.Assert.assertEquals("\"abc\"",
            this.newObservationsTableRequest.getDataAsCSV());
    }

    @org.junit.Test() public void multipleFieldsSingleLineGetDataAsCSV()
    {
        this.newObservationsTableRequest.clearData();

        // noinspection Convert2Diamond
        this.newObservationsTableRequest.addDataItem(new java.util.ArrayList<java.lang.String>(
            java.util.Arrays.asList("abc", "123")));

        org.junit.Assert.assertEquals("\"abc\",\"123\"",
            this.newObservationsTableRequest.getDataAsCSV());
    }

    @org.junit.Test() public void multipleFieldsMultipleLinesGetDataAsCSV()
    {
        this.newObservationsTableRequest.clearData();

        // noinspection Convert2Diamond
        this.newObservationsTableRequest.addDataItem(new java.util.ArrayList<java.lang.String>(
            java.util.Arrays.asList("abc", "123")));

        // noinspection Convert2Diamond
        this.newObservationsTableRequest.addDataItem(new java.util.ArrayList<java.lang.String>(
            java.util.Arrays.asList("def", "456")));

        org.junit.Assert.assertEquals("\"abc\",\"123\"\n\"def\",\"456\"",
            this.newObservationsTableRequest.getDataAsCSV());
    }
    // endregion

    // region getDataAsTSV() Package Methods
    @org.junit.Test() public void singleFieldSingleLineGetDataAsTSV()
    {
        this.newObservationsTableRequest.clearData();

        // noinspection Convert2Diamond
        this.newObservationsTableRequest.addDataItem(new java.util.ArrayList<java.lang.String>(
            java.util.Collections.singletonList("abc")));

        org.junit.Assert.assertEquals("\"abc\"",
            this.newObservationsTableRequest.getDataAsTSV());
    }

    @org.junit.Test() public void multipleFieldsSingleLineGetDataAsTSV()
    {
        this.newObservationsTableRequest.clearData();

        // noinspection Convert2Diamond
        this.newObservationsTableRequest.addDataItem(new java.util.ArrayList<java.lang.String>(
            java.util.Arrays.asList("abc", "123")));

        org.junit.Assert.assertEquals("\"abc\"\t\"123\"",
            this.newObservationsTableRequest.getDataAsTSV());
    }

    @org.junit.Test() public void multipleFieldsMultipleLinesGetDataAsTSV()
    {
        this.newObservationsTableRequest.clearData();

        // noinspection Convert2Diamond
        this.newObservationsTableRequest.addDataItem(new java.util.ArrayList<java.lang.String>(
            java.util.Arrays.asList("abc", "123")));

        // noinspection Convert2Diamond
        this.newObservationsTableRequest.addDataItem(new java.util.ArrayList<java.lang.String>(
            java.util.Arrays.asList("def", "456")));

        org.junit.Assert.assertEquals("\"abc\"\t\"123\"\n\"def\"\t\"456\"",
            this.newObservationsTableRequest.getDataAsTSV());
    }
    // endregion
    // endregion
    // endregion
}