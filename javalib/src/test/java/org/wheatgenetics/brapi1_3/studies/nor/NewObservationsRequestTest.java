package org.wheatgenetics.brapi1_3.studies.nor;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.threeten.bp.OffsetDateTime
 * org.threeten.bp.ZoneOffset
 *
 * org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest
 * org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class NewObservationsRequestTest extends java.lang.Object
{
    @org.junit.Test() public void toJsonWorks()
    {
        final org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest newObservationsRequest =
            new org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest();
        newObservationsRequest.append();
        {
            final org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations
                newObservationsRequestObservations =
                    new org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations(
                        newObservationsRequest);
            newObservationsRequestObservations.collector("John Doe").observationDbId("456")
                .observationTimeStamp(org.threeten.bp.OffsetDateTime.of(
                    2016,1,1,0,0,0,0,
                    org.threeten.bp.ZoneOffset.UTC)).observationUnitDbId("3333")
                .observationVariableDbId("159").value("789.005");
            newObservationsRequest.append(newObservationsRequestObservations);
        }
        org.junit.Assert.assertEquals(
            /* expected => */"{\n" +
                "  \"observations\": [\n"                       +
                "    {\n"                                       +
                "      \"position\": 0\n"                       +
                "    },\n"                                      +
                "    {\n"                                       +
                "      \"position\": 1,\n"                      +
                "      \"collector\": \"John Doe\",\n"          +
                "      \"observationDbId\": \"456\",\n"         +
                "      \"observationTimeStamp\": {\n"           +
                "        \"dateTime\": {\n"                     +
                "          \"date\": {\n"                       +
                "            \"year\": 2016,\n"                 +
                "            \"month\": 1,\n"                   +
                "            \"day\": 1\n"                      +
                "          },\n"                                +
                "          \"time\": {\n"                       +
                "            \"hour\": 0,\n"                    +
                "            \"minute\": 0,\n"                  +
                "            \"second\": 0,\n"                  +
                "            \"nano\": 0\n"                     +
                "          }\n"                                 +
                "        },\n"                                  +
                "        \"offset\": {\n"                       +
                "          \"totalSeconds\": 0\n"               +
                "        }\n"                                   +
                "      },\n"                                    +
                "      \"observationUnitDbId\": \"3333\",\n"    +
                "      \"observationVariableDbId\": \"159\",\n" +
                "      \"value\": \"789.005\"\n"                +
                "    }\n"                                       +
                "  ]\n"                                         +
                "}",
            /* actual => */ newObservationsRequest.toJson());
    }

    @org.junit.Test() public void fromJsonWorks()
    {
        final org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest newObservationsRequest =
            new org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest();
        final java.lang.String json = "{\n" +
            "  \"observations\": [\n"                       +
            "    {\n"                                       +
            "      \"position\": 0\n"                       +
            "    },\n"                                      +
            "    {\n"                                       +
            "      \"position\": 1,\n"                      +
            "      \"collector\": \"John Doe\",\n"          +
            "      \"observationDbId\": \"456\",\n"         +
            "      \"observationTimeStamp\": {\n"           +
            "        \"dateTime\": {\n"                     +
            "          \"date\": {\n"                       +
            "            \"year\": 2016,\n"                 +
            "            \"month\": 1,\n"                   +
            "            \"day\": 1\n"                      +
            "          },\n"                                +
            "          \"time\": {\n"                       +
            "            \"hour\": 0,\n"                    +
            "            \"minute\": 0,\n"                  +
            "            \"second\": 0,\n"                  +
            "            \"nano\": 0\n"                     +
            "          }\n"                                 +
            "        },\n"                                  +
            "        \"offset\": {\n"                       +
            "          \"totalSeconds\": 0\n"               +
            "        }\n"                                   +
            "      },\n"                                    +
            "      \"observationUnitDbId\": \"3333\",\n"    +
            "      \"observationVariableDbId\": \"159\",\n" +
            "      \"value\": \"789.005\"\n"                +
            "    }\n"                                       +
            "  ]\n"                                         +
            "}";
        org.junit.Assert.assertEquals(json, newObservationsRequest.fromJson(json).toJson());
    }
}