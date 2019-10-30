package org.wheatgenetics.brapi1_3.studies.nour.ot;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment
 * org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class ObservationTreatmentsTest extends java.lang.Object
{
    public static org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments
    makeObservationTreatments()
    {
        final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments result =
            new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments();
        result.append();
        {
            final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment
                observationTreatment =
                    new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment(result);
            observationTreatment.factor("factor").modality("modality");
            result.append(observationTreatment);
        }
        return result;
    }

    @org.junit.Test() public void toJsonWorks()
    {
        org.junit.Assert.assertEquals(
            /* expected => */"{\n" +
                "  \"listInstance\": [\n"            +
                "    {\n"                            +
                "      \"position\": 0\n"            +
                "    },\n"                           +
                "    {\n"                            +
                "      \"position\": 1,\n"           +
                "      \"factor\": \"factor\",\n"    +
                "      \"modality\": \"modality\"\n" +
                "    }\n"                            +
                "  ]\n"                              +
                "}",
            /* actual => */ org.wheatgenetics.brapi1_3.studies.nour.ot
                .ObservationTreatmentsTest.makeObservationTreatments().toJson());
    }

    @org.junit.Test() public void fromJsonWorks()
    {
        final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments
            observationTreatments =
                new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments();
        final java.lang.String json = "{\n" +
            "  \"listInstance\": [\n"            +
            "    {\n"                            +
            "      \"position\": 0\n"            +
            "    },\n"                           +
            "    {\n"                            +
            "      \"position\": 1,\n"           +
            "      \"factor\": \"factor\",\n"    +
            "      \"modality\": \"modality\"\n" +
            "    }\n"                            +
            "  ]\n"                              +
            "}";
        org.junit.Assert.assertEquals(json, observationTreatments.fromJson(json).toJson());
    }
}