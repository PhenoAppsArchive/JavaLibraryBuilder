package org.wheatgenetics.brapi1_3.studies.nour.oux;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref
 * org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class ObservationUnitXrefsTest extends java.lang.Object
{
    public static org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs
    makeObservationUnitXrefs()
    {
        final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs result =
            new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs();
        result.append();
        {
            final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref
                observationUnitXref =
                    new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref(result);
            observationUnitXref.id("id").source("source");
            result.append(observationUnitXref);
        }
        return result;
    }

    @org.junit.Test() public void toJsonWorks()
    {
        org.junit.Assert.assertEquals(
            /* expected => */"{\n" +
                "  \"listInstance\": [\n"        +
                "    {\n"                        +
                "      \"position\": 0\n"        +
                "    },\n"                       +
                "    {\n"                        +
                "      \"position\": 1,\n"       +
                "      \"id\": \"id\",\n"        +
                "      \"source\": \"source\"\n" +
                "    }\n"                        +
                "  ]\n"                          +
                "}",
            /* actual => */ org.wheatgenetics.brapi1_3.studies.nour.oux
                .ObservationUnitXrefsTest.makeObservationUnitXrefs().toJson());
    }

    @org.junit.Test() public void fromJsonWorks()
    {
        final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs
            observationUnitXrefs =
                new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs();
        final java.lang.String json = "{\n" +
            "  \"listInstance\": [\n"        +
            "    {\n"                        +
            "      \"position\": 0\n"        +
            "    },\n"                       +
            "    {\n"                        +
            "      \"position\": 1,\n"       +
            "      \"id\": \"id\",\n"        +
            "      \"source\": \"source\"\n" +
            "    }\n"                        +
            "  ]\n"                          +
            "}";
        org.junit.Assert.assertEquals(json, observationUnitXrefs.fromJson(json).toJson());
    }
}