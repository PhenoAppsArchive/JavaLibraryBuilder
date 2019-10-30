package org.wheatgenetics.brapi1_3.studies.nour;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateXTypeEnum
 * io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateYTypeEnum
 *
 * org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefsTest
 * org.wheatgenetics.brapi1_3.studies.nour.o.ObservationsTest
 * org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatmentsTest
 *
 * org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest
 * org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class NewObservationUnitRequestsTest extends java.lang.Object
{
    @org.junit.Test() public void toJsonWorks()
    {
        final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests
            newObservationUnitRequests;
        {
            final java.lang.String operator = "operator", uploadedBy = "uploadedBy";
            newObservationUnitRequests =
                new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests(
                    operator, uploadedBy);
            newObservationUnitRequests.append();
            {
                final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest
                    newObservationUnitRequest =
                        new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(
                            newObservationUnitRequests, operator, uploadedBy);

                newObservationUnitRequest.blockNumber("blockNumber").entryNumber("entryNumber")
                    .entryType       ("entryType"       ).germplasmDbId      ("germplasmDbId"      )
                    .observationLevel("observationLevel").observationUnitDbId("observationUnitDbId")
                    .observationUnitName("observationUnitName").plantNumber  ("plantNumber"        )
                    .plotNumber         ("plotNumber").positionCoordinateX   ("positionCoordinateX")
                    .positionCoordinateXType(io.swagger.client.model
                        .NewObservationUnitRequest.PositionCoordinateXTypeEnum.LONGITUDE)
                    .positionCoordinateY("positionCoordinateY")
                    .positionCoordinateYType(io.swagger.client.model
                        .NewObservationUnitRequest.PositionCoordinateYTypeEnum.LATITUDE)
                    .replicate("replicate").studyDbId("studyDbId");

                newObservationUnitRequest.setObservationUnitXrefsAsItems(org.wheatgenetics.brapi1_3
                    .studies.nour.oux.ObservationUnitXrefsTest.makeObservationUnitXrefs());
                newObservationUnitRequest.setObservationsAsItems(
                    org.wheatgenetics.brapi1_3.studies.nour.o.ObservationsTest.makeObservations(
                        operator, uploadedBy));
                newObservationUnitRequest.setObservationTreatmentsAsItems(org.wheatgenetics.brapi1_3
                    .studies.nour.ot.ObservationTreatmentsTest.makeObservationTreatments());

                newObservationUnitRequests.append(newObservationUnitRequest);
            }
        }
        org.junit.Assert.assertEquals(
            /* expected => */"{\n" +
                "  \"operator\": \"operator\",\n"                           +
                "  \"uploadedBy\": \"uploadedBy\",\n"                       +
                "  \"listInstance\": [\n"                                   +
                "    {\n"                                                   +
                "      \"position\": 0,\n"                                  +
                "      \"operator\": \"operator\",\n"                       +
                "      \"uploadedBy\": \"uploadedBy\"\n"                    +
                "    },\n"                                                  +
                "    {\n"                                                   +
                "      \"position\": 1,\n"                                  +
                "      \"operator\": \"operator\",\n"                       +
                "      \"uploadedBy\": \"uploadedBy\",\n"                   +
                "      \"blockNumber\": \"blockNumber\",\n"                 +
                "      \"entryNumber\": \"entryNumber\",\n"                 +
                "      \"entryType\": \"entryType\",\n"                     +
                "      \"germplasmDbId\": \"germplasmDbId\",\n"             +
                "      \"observationLevel\": \"observationLevel\",\n"       +
                "      \"observationUnitDbId\": \"observationUnitDbId\",\n" +
                "      \"observationUnitName\": \"observationUnitName\",\n" +
                "      \"observationUnitXref\": [\n"                        +
                "        {\n"                                               +
                "          \"position\": 0\n"                               +
                "        },\n"                                              +
                "        {\n"                                               +
                "          \"position\": 1,\n"                              +
                "          \"id\": \"id\",\n"                               +
                "          \"source\": \"source\"\n"                        +
                "        }\n"                                               +
                "      ],\n"                                                +
                "      \"observations\": [\n"                               +
                "        {\n"                                               +
                "          \"position\": 0,\n"                              +
                "          \"operator\": \"operator\",\n"                   +
                "          \"uploadedBy\": \"uploadedBy\"\n"                +
                "        },\n"                                              +
                "        {\n"                                               +
                "          \"position\": 1,\n"                              +
                "          \"germplasmDbId\": \"123\",\n"                   +
                "          \"germplasmName\": \"abc\",\n"                   +
                "          \"observationDbId\": \"456\",\n"                 +
                "          \"observationLevel\": \"def\",\n"                +
                "          \"observationTimeStamp\": {\n"                   +
                "            \"dateTime\": {\n"                             +
                "              \"date\": {\n"                               +
                "                \"year\": 2016,\n"                         +
                "                \"month\": 1,\n"                           +
                "                \"day\": 1\n"                              +
                "              },\n"                                        +
                "              \"time\": {\n"                               +
                "                \"hour\": 0,\n"                            +
                "                \"minute\": 0,\n"                          +
                "                \"second\": 0,\n"                          +
                "                \"nano\": 0\n"                             +
                "              }\n"                                         +
                "            },\n"                                          +
                "            \"offset\": {\n"                               +
                "              \"totalSeconds\": 0\n"                       +
                "            }\n"                                           +
                "          },\n"                                            +
                "          \"observationUnitDbId\": \"789\",\n"             +
                "          \"observationUnitName\": \"ghi\",\n"             +
                "          \"observationVariableDbId\": \"111\",\n"         +
                "          \"observationVariableName\": \"fff\",\n"         +
                "          \"operator\": \"operator\",\n"                   +
                "          \"studyDbId\": \"555\",\n"                       +
                "          \"uploadedBy\": \"uploadedBy\",\n"               +
                "          \"value\": \"789.33\"\n"                         +
                "        }\n"                                               +
                "      ],\n"                                                +
                "      \"plantNumber\": \"plantNumber\",\n"                 +
                "      \"plotNumber\": \"plotNumber\",\n"                   +
                "      \"positionCoordinateX\": \"positionCoordinateX\",\n" +
                "      \"positionCoordinateXType\": \"LONGITUDE\",\n"       +
                "      \"positionCoordinateY\": \"positionCoordinateY\",\n" +
                "      \"positionCoordinateYType\": \"LATITUDE\",\n"        +
                "      \"replicate\": \"replicate\",\n"                     +
                "      \"studyDbId\": \"studyDbId\",\n"                     +
                "      \"treatments\": [\n"                                 +
                "        {\n"                                               +
                "          \"position\": 0\n"                               +
                "        },\n"                                              +
                "        {\n"                                               +
                "          \"position\": 1,\n"                              +
                "          \"factor\": \"factor\",\n"                       +
                "          \"modality\": \"modality\"\n"                    +
                "        }\n"                                               +
                "      ]\n"                                                 +
                "    }\n"                                                   +
                "  ]\n"                                                     +
                "}",
            /* actual => */ newObservationUnitRequests.toJson());
    }

    @org.junit.Test() public void fromJsonWorks()
    {
        final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests
            newObservationUnitRequests =
                new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests(
                    "operator","uploadedBy");
        final java.lang.String json = "{\n" +
            "  \"operator\": \"operator\",\n"                           +
            "  \"uploadedBy\": \"uploadedBy\",\n"                       +
            "  \"listInstance\": [\n"                                   +
            "    {\n"                                                   +
            "      \"position\": 0,\n"                                  +
            "      \"operator\": \"operator\",\n"                       +
            "      \"uploadedBy\": \"uploadedBy\"\n"                    +
            "    },\n"                                                  +
            "    {\n"                                                   +
            "      \"position\": 1,\n"                                  +
            "      \"operator\": \"operator\",\n"                       +
            "      \"uploadedBy\": \"uploadedBy\",\n"                   +
            "      \"blockNumber\": \"blockNumber\",\n"                 +
            "      \"entryNumber\": \"entryNumber\",\n"                 +
            "      \"entryType\": \"entryType\",\n"                     +
            "      \"germplasmDbId\": \"germplasmDbId\",\n"             +
            "      \"observationLevel\": \"observationLevel\",\n"       +
            "      \"observationUnitDbId\": \"observationUnitDbId\",\n" +
            "      \"observationUnitName\": \"observationUnitName\",\n" +
            "      \"observationUnitXref\": [\n"                        +
            "        {\n"                                               +
            "          \"position\": 0\n"                               +
            "        },\n"                                              +
            "        {\n"                                               +
            "          \"position\": 1,\n"                              +
            "          \"id\": \"id\",\n"                               +
            "          \"source\": \"source\"\n"                        +
            "        }\n"                                               +
            "      ],\n"                                                +
            "      \"observations\": [\n"                               +
            "        {\n"                                               +
            "          \"position\": 0,\n"                              +
            "          \"operator\": \"operator\",\n"                   +
            "          \"uploadedBy\": \"uploadedBy\"\n"                +
            "        },\n"                                              +
            "        {\n"                                               +
            "          \"position\": 1,\n"                              +
            "          \"germplasmDbId\": \"123\",\n"                   +
            "          \"germplasmName\": \"abc\",\n"                   +
            "          \"observationDbId\": \"456\",\n"                 +
            "          \"observationLevel\": \"def\",\n"                +
            "          \"observationTimeStamp\": {\n"                   +
            "            \"dateTime\": {\n"                             +
            "              \"date\": {\n"                               +
            "                \"year\": 2016,\n"                         +
            "                \"month\": 1,\n"                           +
            "                \"day\": 1\n"                              +
            "              },\n"                                        +
            "              \"time\": {\n"                               +
            "                \"hour\": 0,\n"                            +
            "                \"minute\": 0,\n"                          +
            "                \"second\": 0,\n"                          +
            "                \"nano\": 0\n"                             +
            "              }\n"                                         +
            "            },\n"                                          +
            "            \"offset\": {\n"                               +
            "              \"totalSeconds\": 0\n"                       +
            "            }\n"                                           +
            "          },\n"                                            +
            "          \"observationUnitDbId\": \"789\",\n"             +
            "          \"observationUnitName\": \"ghi\",\n"             +
            "          \"observationVariableDbId\": \"111\",\n"         +
            "          \"observationVariableName\": \"fff\",\n"         +
            "          \"operator\": \"operator\",\n"                   +
            "          \"studyDbId\": \"555\",\n"                       +
            "          \"uploadedBy\": \"uploadedBy\",\n"               +
            "          \"value\": \"789.33\"\n"                         +
            "        }\n"                                               +
            "      ],\n"                                                +
            "      \"plantNumber\": \"plantNumber\",\n"                 +
            "      \"plotNumber\": \"plotNumber\",\n"                   +
            "      \"positionCoordinateX\": \"positionCoordinateX\",\n" +
            "      \"positionCoordinateXType\": \"LONGITUDE\",\n"       +
            "      \"positionCoordinateY\": \"positionCoordinateY\",\n" +
            "      \"positionCoordinateYType\": \"LATITUDE\",\n"        +
            "      \"replicate\": \"replicate\",\n"                     +
            "      \"studyDbId\": \"studyDbId\",\n"                     +
            "      \"treatments\": [\n"                                 +
            "        {\n"                                               +
            "          \"position\": 0\n"                               +
            "        },\n"                                              +
            "        {\n"                                               +
            "          \"position\": 1,\n"                              +
            "          \"factor\": \"factor\",\n"                       +
            "          \"modality\": \"modality\"\n"                    +
            "        }\n"                                               +
            "      ]\n"                                                 +
            "    }\n"                                                   +
            "  ]\n"                                                     +
            "}";
        org.junit.Assert.assertEquals(json, newObservationUnitRequests.fromJson(json).toJson());
    }
}