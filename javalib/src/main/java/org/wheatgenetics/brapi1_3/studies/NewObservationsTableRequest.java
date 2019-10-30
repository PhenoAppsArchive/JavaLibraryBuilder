package org.wheatgenetics.brapi1_3.studies;

/**
 * Uses:
 * com.csvreader.CsvReader
 *
 * io.swagger.client.model.NewObservationsTableRequest
 */
public class NewObservationsTableRequest extends io.swagger.client.model.NewObservationsTableRequest
{
    // region Private Methods
    // region GeneralPrivate Methods
    private static void clearStringList(final java.util.List<java.lang.String> stringList)
    { if (null != stringList) stringList.clear(); }

    private static java.util.List<java.lang.String> toStringList(
    final java.lang.String delimitedString, final java.lang.Character delimiter)
    {
        if (null == delimitedString)
            return null;
        else
            if (delimitedString.trim().equals(""))
                return null;
            else
            {
                final java.util.List<java.lang.String> list;
                {
                    // noinspection CStyleArrayDeclaration
                    java.lang.String values[];

                    {
                        final com.csvreader.CsvReader csvReader =
                            com.csvreader.CsvReader.parse(delimitedString);
                        csvReader.setDelimiter(delimiter);
                        try
                        {
                            if (csvReader.readRecord())                // throws java.io.IOException
                                values = csvReader.getValues();        // throws java.io.IOException
                            else
                                values = null;
                        }
                        catch (final java.io.IOException e) { values = null; }
                    }

                    // noinspection Convert2Diamond
                    list = null == values ? null :
                        new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(values));
                }
                return list;
            }
    }

    private static java.lang.String toDelimitedString(
    final java.util.List<java.lang.String> stringList, final java.lang.Character delimiter)
    {
        if (null == stringList)
            return null;
        else
            if (stringList.size() <= 0)
                return null;
            else
            {
                final java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                {
                    boolean first = true;
                    for (final java.lang.String string: stringList)
                    {
                        if (first) first = false; else stringBuilder.append(delimiter);
                        stringBuilder.append('"').append(string).append('"');
                    }
                }
                return stringBuilder.toString();
            }
    }

    private static java.util.List<java.util.List<java.lang.String>> list(
    final java.util.List<java.util.List<java.lang.String>> list)
    {
        // noinspection Convert2Diamond
        return null == list ?
            new java.util.ArrayList<java.util.List<java.lang.String>>() : list;
    }

    private static java.util.List<java.util.List<java.lang.String>> toListList(
    final java.lang.String multiLineString, final java.lang.Character delimiter)
    {
        if (null == multiLineString)
            return null;
        else
            if (multiLineString.trim().equals(""))
                return null;
            else
            {
                java.util.List<java.util.List<java.lang.String>> list = null;
                {
                    // noinspection CStyleArrayDeclaration
                    final java.lang.String lines[] = multiLineString.split("\n");
                    for (final java.lang.String line: lines)
                    {
                        final java.util.List<java.lang.String> stringList = org.wheatgenetics
                            .brapi1_3.studies.NewObservationsTableRequest.toStringList(
                                line, delimiter);
                        if (null != stringList) if (stringList.size() > 0)
                        {
                            list =
                                org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.list(
                                    list);
                            list.add(stringList);
                        }
                    }
                }
                return list;
            }
    }

    private static java.lang.String toLines(
    final java.util.List<java.util.List<java.lang.String>> listList ,
    final java.lang.Character                              delimiter)
    {
        if (null == listList)
            return null;
        else
            if (listList.size() <= 0)
                return null;
            else
            {
                final java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                {
                    boolean first = true;
                    for (final java.util.List<java.lang.String> stringList: listList)
                    {
                        if (first) first = false; else stringBuilder.append('\n');
                        stringBuilder.append(org.wheatgenetics.brapi1_3.studies
                            .NewObservationsTableRequest.toDelimitedString(stringList, delimiter));
                    }
                }
                return stringBuilder.toString();
            }
    }
    // endregion

    // region Specific Private Methods
    private static java.util.List<java.lang.String> toStringListFromCSV(final java.lang.String csv)
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toStringList(
            csv,',');
    }

    private static java.util.List<java.lang.String> toStringListFromTSV(final java.lang.String tsv)
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toStringList(
            tsv,'\t');
    }

    private static java.lang.String toCSV(final java.util.List<java.lang.String> stringList)
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toDelimitedString(
            stringList,',');
    }

    private static java.lang.String toTSV(final java.util.List<java.lang.String> stringList)
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toDelimitedString(
            stringList,'\t');
    }

    private static java.util.List<java.util.List<java.lang.String>> toListListFromCSV(
    final java.lang.String multiLineString)
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toListList(
            multiLineString,',');
    }

    private static java.util.List<java.util.List<java.lang.String>> toListListFromTSV(
    final java.lang.String multiLineString)
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toListList(
            multiLineString,'\t');
    }

    private static java.lang.String toCSVLines(
    final java.util.List<java.util.List<java.lang.String>> listList)
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toLines(
            listList,',');
    }

    private static java.lang.String toTSVLines(
    final java.util.List<java.util.List<java.lang.String>> listList)
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toLines(
            listList,'\t');
    }
    // endregion
    // endregion

    // region Public Methods
    // region headerRow Public Methods
    @java.lang.SuppressWarnings({"WeakerAccess"}) public void clearHeaderRow()
    {
        org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.clearStringList(
            this.getHeaderRow());
    }

    // region setHeaderRow() Public Methods
    @java.lang.SuppressWarnings({"WeakerAccess"})
    public void setHeaderRowFromCSV(final java.lang.String csvHeaderRow)
    {
        this.setHeaderRow(
            org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toStringListFromCSV(
                csvHeaderRow));
    }

    @java.lang.SuppressWarnings({"WeakerAccess"})
    public void setHeaderRowFromTSV(final java.lang.String tsvHeaderRow)
    {
        this.setHeaderRow(
            org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toStringListFromTSV(
                tsvHeaderRow));
    }
    // endregion

    // region getHeaderRow() Public Methods
    @java.lang.SuppressWarnings({"WeakerAccess"}) public java.lang.String getHeaderRowAsCSV()
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toCSV(
            this.getHeaderRow());
    }

    @java.lang.SuppressWarnings({"WeakerAccess"}) public java.lang.String getHeaderRowAsTSV()
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toTSV(
            this.getHeaderRow());
    }
    // endregion
    // endregion

    // region observationVariableDbIds Public Methods
    @java.lang.SuppressWarnings({"unused"}) public void clearObservationVariableDbIds()
    {
        org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.clearStringList(
            this.getObservationVariableDbIds());
    }

    // region setObservationVariableDbIds() Public Methods
    @java.lang.SuppressWarnings({"unused"}) public void setObservationVariableDbIdsFromCSV(
    final java.lang.String csvObservationVariableDbIds)
    {
        this.setObservationVariableDbIds(
            org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toStringListFromCSV(
                csvObservationVariableDbIds));
    }

    @java.lang.SuppressWarnings({"unused"}) public void setObservationVariableDbIdsFromTSV(
    final java.lang.String tsvObservationVariableDbIds)
    {
        this.setObservationVariableDbIds(
            org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toStringListFromTSV(
                tsvObservationVariableDbIds));
    }
    // endregion

    // region getObservationVariableDbIds() Public Methods
    @java.lang.SuppressWarnings({"unused"})
    public java.lang.String getObservationVariableDbIdsAsCSV()
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toCSV(
            this.getObservationVariableDbIds());
    }

    @java.lang.SuppressWarnings({"unused"})
    public java.lang.String getObservationVariableDbIdsAsTSV()
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toTSV(
            this.getObservationVariableDbIds());
    }
    // endregion
    // endregion

    // region data Public Methods
    @java.lang.SuppressWarnings({"WeakerAccess"}) public void clearData()
    {
        final java.util.List<java.util.List<java.lang.String>> data = this.getData();
        if (null != data) data.clear();
    }

    // region setData() Public Methods
    @java.lang.SuppressWarnings({"WeakerAccess"})
    public void setDataFromCSV(final java.lang.String csvData)
    {
        this.setData(
            org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toListListFromCSV(
                csvData));
    }

    @java.lang.SuppressWarnings({"WeakerAccess"})
    public void setDataFromTSV(final java.lang.String tsvData)
    {
        this.setData(
            org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toListListFromTSV(
                tsvData));
    }
    // endregion

    // region getData() Public Methods
    @java.lang.SuppressWarnings({"WeakerAccess"}) public java.lang.String getDataAsCSV()
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toCSVLines(
            this.getData());
    }

    @java.lang.SuppressWarnings({"WeakerAccess"}) public java.lang.String getDataAsTSV()
    {
        return org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest.toTSVLines(
            this.getData());
    }
    // endregion
    // endregion
    // endregion
}