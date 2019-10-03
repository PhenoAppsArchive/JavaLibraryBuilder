package org.wheatgenetics.brapi1_3.observations.pr;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.wheatgenetics.brapi1_3.observations.pr.o.Observations
 * org.wheatgenetics.brapi1_3.observations.pr.o.ObservationsTest
 *
 * org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequest
 * org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class PhenotypesRequestTest extends java.lang.Object
{
    // region Private Methods
    private static <T> int size(final java.util.List<T> list)
    { return null == list ? 0 : list.size(); }

    private static void assertEquals(final int expected,
    final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData
        sourcePhenotypesRequestData,
    final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData
        destinationPhenotypesRequestData)
    {
        org.junit.Assert.assertEquals(expected,
            org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestTest.size(
                sourcePhenotypesRequestData.getObservations()));
        org.junit.Assert.assertEquals(expected,
            org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestTest.size(
                destinationPhenotypesRequestData.getObservations()));
    }
    // endregion

    // region Tests
    @org.junit.Test() public void toJsonWorks()
    {
        final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequest phenotypesRequest =
            new org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequest();
        phenotypesRequest.append();
        {
            final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData
                phenotypesRequestData =
                    new org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData(
                        phenotypesRequest);
            phenotypesRequestData.observatioUnitDbId("56").observations(
                org.wheatgenetics.brapi1_3.observations.pr.o.ObservationsTest.makeObservations()
                    .getList()).studyDbId("789");
            phenotypesRequest.append(phenotypesRequestData);
        }
        org.junit.Assert.assertEquals(
            /* expected => */"{\n" +
                "  \"data\": [\n"                                   +
                "    {\n"                                           +
                "      \"position\": 0\n"                           +
                "    },\n"                                          +
                "    {\n"                                           +
                "      \"position\": 1,\n"                          +
                "      \"observatioUnitDbId\": \"56\",\n"           +
                "      \"observations\": [\n"                       +
                "        {\n"                                       +
                "          \"position\": 0\n"                       +
                "        },\n"                                      +
                "        {\n"                                       +
                "          \"position\": 1,\n"                      +
                "          \"observationDbId\": \"1\",\n"           +
                "          \"observationTimeStamp\": {\n"           +
                "            \"dateTime\": {\n"                     +
                "              \"date\": {\n"                       +
                "                \"year\": 2016,\n"                 +
                "                \"month\": 1,\n"                   +
                "                \"day\": 1\n"                      +
                "              },\n"                                +
                "              \"time\": {\n"                       +
                "                \"hour\": 0,\n"                    +
                "                \"minute\": 0,\n"                  +
                "                \"second\": 0,\n"                  +
                "                \"nano\": 0\n"                     +
                "              }\n"                                 +
                "            },\n"                                  +
                "            \"offset\": {\n"                       +
                "              \"totalSeconds\": 0\n"               +
                "            }\n"                                   +
                "          },\n"                                    +
                "          \"observationVariableDbId\": \"33\",\n"  +
                "          \"observationVariableName\": \"abc\",\n" +
                "          \"season\": \"fall\",\n"                 +
                "          \"value\": \"5.63\"\n"                   +
                "        }\n"                                       +
                "      ],\n"                                        +
                "      \"studyDbId\": \"789\"\n"                    +
                "    }\n"                                           +
                "  ]\n"                                             +
                "}",
            /* actual => */ phenotypesRequest.toJson());
    }

    @org.junit.Test() public void fromJsonWorks()
    {
        final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequest phenotypesRequest =
            new org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequest();
        final java.lang.String json = "{\n" +
            "  \"data\": [\n"                                   +
            "    {\n"                                           +
            "      \"position\": 0\n"                           +
            "    },\n"                                          +
            "    {\n"                                           +
            "      \"position\": 1,\n"                          +
            "      \"observatioUnitDbId\": \"56\",\n"           +
            "      \"observations\": [\n"                       +
            "        {\n"                                       +
            "          \"position\": 0\n"                       +
            "        },\n"                                      +
            "        {\n"                                       +
            "          \"position\": 1,\n"                      +
            "          \"observationDbId\": \"1\",\n"           +
            "          \"observationTimeStamp\": {\n"           +
            "            \"dateTime\": {\n"                     +
            "              \"date\": {\n"                       +
            "                \"year\": 2016,\n"                 +
            "                \"month\": 1,\n"                   +
            "                \"day\": 1\n"                      +
            "              },\n"                                +
            "              \"time\": {\n"                       +
            "                \"hour\": 0,\n"                    +
            "                \"minute\": 0,\n"                  +
            "                \"second\": 0,\n"                  +
            "                \"nano\": 0\n"                     +
            "              }\n"                                 +
            "            },\n"                                  +
            "            \"offset\": {\n"                       +
            "              \"totalSeconds\": 0\n"               +
            "            }\n"                                   +
            "          },\n"                                    +
            "          \"observationVariableDbId\": \"33\",\n"  +
            "          \"observationVariableName\": \"abc\",\n" +
            "          \"season\": \"fall\",\n"                 +
            "          \"value\": \"5.63\"\n"                   +
            "        }\n"                                       +
            "      ],\n"                                        +
            "      \"studyDbId\": \"789\"\n"                    +
            "    }\n"                                           +
            "  ]\n"                                             +
            "}";
        org.junit.Assert.assertEquals(json, phenotypesRequest.fromJson(json).toJson());
    }

    @org.junit.Test() public void constructorWorks()
    {
        final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData
            sourcePhenotypesRequestData =
                new org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData();
        org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData
            destinationPhenotypesRequestData =
                new org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData(
                    sourcePhenotypesRequestData);
        org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestTest.assertEquals(
            0, sourcePhenotypesRequestData, destinationPhenotypesRequestData);

        {
            final org.wheatgenetics.brapi1_3.observations.pr.o.Observations observations =
                new org.wheatgenetics.brapi1_3.observations.pr.o.Observations();
            sourcePhenotypesRequestData.setObservationsAsItems(observations);
            destinationPhenotypesRequestData =
                new org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData(
                    sourcePhenotypesRequestData);
            org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestTest.assertEquals(
                0, sourcePhenotypesRequestData, destinationPhenotypesRequestData);

            observations.append();
        }
        destinationPhenotypesRequestData =
            new org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData(
                sourcePhenotypesRequestData);
        org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestTest.assertEquals(
            1, sourcePhenotypesRequestData, destinationPhenotypesRequestData);
    }
    // endregion
}