package org.wheatgenetics.brapi1_3.studies.nour.o;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.wheatgenetics.brapi1_3.studies.nour.o.Observation
 * org.wheatgenetics.brapi1_3.studies.nour.o.Observations
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class ObservationsTest extends java.lang.Object
{
    public static org.wheatgenetics.brapi1_3.studies.nour.o.Observations makeObservations(
    final java.lang.String operator, final java.lang.String uploadedBy)
    {
        final org.wheatgenetics.brapi1_3.studies.nour.o.Observations result =
            new org.wheatgenetics.brapi1_3.studies.nour.o.Observations(operator, uploadedBy);
        result.append();
        {
            final org.wheatgenetics.brapi1_3.studies.nour.o.Observation observation =
                new org.wheatgenetics.brapi1_3.studies.nour.o.Observation(
                    result, operator, uploadedBy);
            observation.germplasmDbId("123").germplasmName("abc").observationDbId("456")
                .observationLevel("def").observationTimeStamp(org.threeten.bp.OffsetDateTime.of(
                    2016,1,1,0,0,0,0,
                    org.threeten.bp.ZoneOffset.UTC)).observationUnitDbId("789")
                .observationUnitName("ghi").observationVariableDbId("111")
                .observationVariableName("fff").operator(operator).studyDbId("555")
                .uploadedBy(uploadedBy).value("789.33");
            result.append(observation);
        }
        return result;
    }

    @org.junit.Test() public void toJsonWorks()
    {
        org.junit.Assert.assertEquals(
            /* expected => */"{\n" +
                "  \"operator\": \"Jane Roe\",\n"               +
                "  \"uploadedBy\": \"John Doe\",\n"             +
                "  \"listInstance\": [\n"                       +
                "    {\n"                                       +
                "      \"position\": 0,\n"                      +
                "      \"operator\": \"Jane Roe\",\n"           +
                "      \"uploadedBy\": \"John Doe\"\n"          +
                "    },\n"                                      +
                "    {\n"                                       +
                "      \"position\": 1,\n"                      +
                "      \"germplasmDbId\": \"123\",\n"           +
                "      \"germplasmName\": \"abc\",\n"           +
                "      \"observationDbId\": \"456\",\n"         +
                "      \"observationLevel\": \"def\",\n"        +
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
                "      \"observationUnitDbId\": \"789\",\n"     +
                "      \"observationUnitName\": \"ghi\",\n"     +
                "      \"observationVariableDbId\": \"111\",\n" +
                "      \"observationVariableName\": \"fff\",\n" +
                "      \"operator\": \"Jane Roe\",\n"           +
                "      \"studyDbId\": \"555\",\n"               +
                "      \"uploadedBy\": \"John Doe\",\n"         +
                "      \"value\": \"789.33\"\n"                 +
                "    }\n"                                       +
                "  ]\n"                                         +
                "}",
            /* actual => */
                org.wheatgenetics.brapi1_3.studies.nour.o.ObservationsTest.makeObservations(
                    "Jane Roe","John Doe").toJson());
    }

    @org.junit.Test() public void fromJsonWorks()
    {
        final org.wheatgenetics.brapi1_3.studies.nour.o.Observations observations;
        final java.lang.String                                       json        ;
        {
            final java.lang.String operator = "Jane Roe", uploadedBy = "John Doe";
            observations =
                new org.wheatgenetics.brapi1_3.studies.nour.o.Observations(operator, uploadedBy);
            json = "{\n" +
                "  \"operator\": \""   + operator   + "\",\n"   +
                "  \"uploadedBy\": \"" + uploadedBy + "\",\n"   +
                "  \"listInstance\": [\n"                       +
                "    {\n"                                       +
                "      \"position\": 0,\n"                      +
                "      \"operator\": \"Jane Roe\",\n"           +
                "      \"uploadedBy\": \"John Doe\"\n"          +
                "    },\n"                                      +
                "    {\n"                                       +
                "      \"position\": 1,\n"                      +
                "      \"germplasmDbId\": \"123\",\n"           +
                "      \"germplasmName\": \"abc\",\n"           +
                "      \"observationDbId\": \"456\",\n"         +
                "      \"observationLevel\": \"def\",\n"        +
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
                "      \"observationUnitDbId\": \"789\",\n"     +
                "      \"observationUnitName\": \"ghi\",\n"     +
                "      \"observationVariableDbId\": \"111\",\n" +
                "      \"observationVariableName\": \"fff\",\n" +
                "      \"operator\": \"Jane Roe\",\n"           +
                "      \"studyDbId\": \"555\",\n"               +
                "      \"uploadedBy\": \"John Doe\",\n"         +
                "      \"value\": \"789.33\"\n"                 +
                "    }\n"                                       +
                "  ]\n"                                         +
                "}";
        }
        org.junit.Assert.assertEquals(json, observations.fromJson(json).toJson());
    }
}