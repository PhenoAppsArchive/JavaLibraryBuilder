package org.wheatgenetics.brapi1_3.observations.pr.o;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.threeten.bp.OffsetDateTime
 * org.threeten.bp.ZoneOffset
 *
 * org.wheatgenetics.brapi1_3.observations.pr.o.Observation
 * org.wheatgenetics.brapi1_3.observations.pr.o.Observations
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class ObservationsTest extends java.lang.Object
{
    public static org.wheatgenetics.brapi1_3.observations.pr.o.Observations makeObservations()
    {
        final org.wheatgenetics.brapi1_3.observations.pr.o.Observations result =
            new org.wheatgenetics.brapi1_3.observations.pr.o.Observations();
        result.append();
        {
            final org.wheatgenetics.brapi1_3.observations.pr.o.Observation observation =
                new org.wheatgenetics.brapi1_3.observations.pr.o.Observation(result);
            observation.observationDbId("1").observationTimeStamp(org.threeten.bp.OffsetDateTime.of(
                    2016,1,1,0,0,0,0,
                    org.threeten.bp.ZoneOffset.UTC)).observationVariableDbId("33")
                .observationVariableName("abc").season("fall").value("5.63");
            result.append(observation);
        }
        return result;
    }

    @org.junit.Test() public void toJsonWorks()
    {
        org.junit.Assert.assertEquals(
            /* expected => */"{\n" +
                "  \"listInstance\": [\n"                       +
                "    {\n"                                       +
                "      \"position\": 0\n"                       +
                "    },\n"                                      +
                "    {\n"                                       +
                "      \"position\": 1,\n"                      +
                "      \"observationDbId\": \"1\",\n"           +
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
                "      \"observationVariableDbId\": \"33\",\n"  +
                "      \"observationVariableName\": \"abc\",\n" +
                "      \"season\": \"fall\",\n"                 +
                "      \"value\": \"5.63\"\n"                   +
                "    }\n"                                       +
                "  ]\n"                                         +
                "}",
            /* actual => */
                org.wheatgenetics.brapi1_3.observations.pr.o.ObservationsTest.makeObservations()
                    .toJson());
    }

    @org.junit.Test() public void fromJsonWorks()
    {
        final org.wheatgenetics.brapi1_3.observations.pr.o.Observations observations =
            new org.wheatgenetics.brapi1_3.observations.pr.o.Observations();
        final java.lang.String json = "{\n" +
            "  \"listInstance\": [\n"                       +
            "    {\n"                                       +
            "      \"position\": 0\n"                       +
            "    },\n"                                      +
            "    {\n"                                       +
            "      \"position\": 1,\n"                      +
            "      \"observationDbId\": \"1\",\n"           +
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
            "      \"observationVariableDbId\": \"33\",\n"  +
            "      \"observationVariableName\": \"abc\",\n" +
            "      \"season\": \"fall\",\n"                 +
            "      \"value\": \"5.63\"\n"                   +
            "    }\n"                                       +
            "  ]\n"                                         +
            "}";
        org.junit.Assert.assertEquals(json, observations.fromJson(json).toJson());
    }
}