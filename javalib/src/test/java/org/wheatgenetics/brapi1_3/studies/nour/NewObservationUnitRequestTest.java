package org.wheatgenetics.brapi1_3.studies.nour;

/**
 * Uses:
 * org.junit.Assert
 * org.junit.Test
 *
 * org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs
 * org.wheatgenetics.brapi1_3.studies.nour.o.Observations
 * org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments
 *
 * org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class NewObservationUnitRequestTest extends java.lang.Object
{
    private static <T> int size(final java.util.List<T> list)
    { return null == list ? 0 : list.size(); }

    private static void assertEquals(final int expected,
    final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest
        sourceNewObservationUnitRequest,
    final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest
        destinationNewObservationUnitRequest)
    {
        org.junit.Assert.assertEquals(expected,
            org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequestTest.size(
                sourceNewObservationUnitRequest.getObservationUnitXref()));
        org.junit.Assert.assertEquals(expected,
            org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequestTest.size(
                destinationNewObservationUnitRequest.getObservationUnitXref()));

        org.junit.Assert.assertEquals(expected,
            org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequestTest.size(
                sourceNewObservationUnitRequest.getObservations()));
        org.junit.Assert.assertEquals(expected,
            org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequestTest.size(
                destinationNewObservationUnitRequest.getObservations()));

        org.junit.Assert.assertEquals(expected,
            org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequestTest.size(
                sourceNewObservationUnitRequest.getTreatments()));
        org.junit.Assert.assertEquals(expected,
            org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequestTest.size(
                destinationNewObservationUnitRequest.getTreatments()));
    }

    @org.junit.Test() public void constructorWorks()
    {
        final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest
            sourceNewObservationUnitRequest =
                new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest();
        org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest
            destinationNewObservationUnitRequest =
                new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(
                    sourceNewObservationUnitRequest);
        org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequestTest.assertEquals(
            0, sourceNewObservationUnitRequest, destinationNewObservationUnitRequest);

        {
            final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs
                observationUnitXrefs =
                    new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs();
            final org.wheatgenetics.brapi1_3.studies.nour.o.Observations observations =
                new org.wheatgenetics.brapi1_3.studies.nour.o.Observations();
            final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments
                observationTreatments =
                    new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments();

            sourceNewObservationUnitRequest.setObservationUnitXrefsAsItems (observationUnitXrefs );
            sourceNewObservationUnitRequest.setObservationsAsItems         (observations         );
            sourceNewObservationUnitRequest.setObservationTreatmentsAsItems(observationTreatments);

            destinationNewObservationUnitRequest =
                new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(
                    sourceNewObservationUnitRequest);

            org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequestTest.assertEquals(
                0, sourceNewObservationUnitRequest, destinationNewObservationUnitRequest);


            observationUnitXrefs.append(); observations.append(); observationTreatments.append();

            sourceNewObservationUnitRequest.setObservationUnitXrefsAsItems (observationUnitXrefs );
            sourceNewObservationUnitRequest.setObservationsAsItems         (observations         );
            sourceNewObservationUnitRequest.setObservationTreatmentsAsItems(observationTreatments);
        }
        destinationNewObservationUnitRequest =
            new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(
                sourceNewObservationUnitRequest);

        org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequestTest.assertEquals(
            1, sourceNewObservationUnitRequest, destinationNewObservationUnitRequest);
    }
}