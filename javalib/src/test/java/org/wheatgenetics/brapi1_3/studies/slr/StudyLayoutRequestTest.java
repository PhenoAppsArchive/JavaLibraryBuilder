package org.wheatgenetics.brapi1_3.studies.slr;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * io.swagger.client.model.StudyLayoutRequestLayout.EntryTypeEnum
 * io.swagger.client.model.StudyLayoutRequestLayout.PositionCoordinateXTypeEnum
 * io.swagger.client.model.StudyLayoutRequestLayout.PositionCoordinateYTypeEnum
 *
 * org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest
 * org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class StudyLayoutRequestTest extends java.lang.Object
{
    @org.junit.Test() public void toJsonWorks()
    {
        final org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest studyLayoutRequest =
            new org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest();
        studyLayoutRequest.append();
        {
            final org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout
                studyLayoutRequestLayout =
                    new org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout(
                        studyLayoutRequest);
            studyLayoutRequestLayout.blockNumber(159)
                .entryType(io.swagger.client.model.StudyLayoutRequestLayout.EntryTypeEnum.FILLER)
                .observationUnitDbId("789").positionCoordinateX("89.9")
                .positionCoordinateXType(io.swagger.client.model.StudyLayoutRequestLayout
                    .PositionCoordinateXTypeEnum.MEASURED_COL).positionCoordinateY("9")
                .positionCoordinateYType(io.swagger.client.model.StudyLayoutRequestLayout
                    .PositionCoordinateYTypeEnum.GRID_ROW).replicate(456);
            studyLayoutRequest.append(studyLayoutRequestLayout);
        }
        org.junit.Assert.assertEquals(
            /* expected => */"{\n" +
                "  \"layout\": [\n"                                      +
                "    {\n"                                                +
                "      \"position\": 0\n"                                +
                "    },\n"                                               +
                "    {\n"                                                +
                "      \"position\": 1,\n"                               +
                "      \"blockNumber\": 159,\n"                          +
                "      \"entryType\": \"FILLER\",\n"                     +
                "      \"observationUnitDbId\": \"789\",\n"              +
                "      \"positionCoordinateX\": \"89.9\",\n"             +
                "      \"positionCoordinateXType\": \"MEASURED_COL\",\n" +
                "      \"positionCoordinateY\": \"9\",\n"                +
                "      \"positionCoordinateYType\": \"GRID_ROW\",\n"     +
                "      \"replicate\": 456\n"                             +
                "    }\n"                                                +
                "  ]\n"                                                  +
                "}",
            /* actual => */ studyLayoutRequest.toJson());
    }

    @org.junit.Test() public void fromJsonWorks()
    {
        final org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest studyLayoutRequest =
            new org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest();
        final java.lang.String json = "{\n" +
            "  \"layout\": [\n"                                      +
            "    {\n"                                                +
            "      \"position\": 0\n"                                +
            "    },\n"                                               +
            "    {\n"                                                +
            "      \"position\": 1,\n"                               +
            "      \"blockNumber\": 159,\n"                          +
            "      \"entryType\": \"FILLER\",\n"                     +
            "      \"observationUnitDbId\": \"789\",\n"              +
            "      \"positionCoordinateX\": \"89.9\",\n"             +
            "      \"positionCoordinateXType\": \"MEASURED_COL\",\n" +
            "      \"positionCoordinateY\": \"9\",\n"                +
            "      \"positionCoordinateYType\": \"GRID_ROW\",\n"     +
            "      \"replicate\": 456\n"                             +
            "    }\n"                                                +
            "  ]\n"                                                  +
            "}";
        org.junit.Assert.assertEquals(json, studyLayoutRequest.fromJson(json).toJson());
    }
}