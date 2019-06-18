package org.wheatgenetics.brapi1_3.studies;

/**
 * Uses:
 * io.swagger.client.model.Observation
 * io.swagger.client.model.ObservationSummary
 *
 * org.wheatgenetics.brapi1_3.studies.Observation
 */
class Observations extends java.util.ArrayList<io.swagger.client.model.Observation>
{
    Observations(
    final java.util.List<io.swagger.client.model.ObservationSummary> observationSummaries,
    final java.lang.String germplasmDbId      , final java.lang.String germplasmName      ,
    final java.lang.String observationLevel   , final java.lang.String observationUnitDbId,
    final java.lang.String observationUnitName, final java.lang.String studyDbId          )
    {
        super();

        if (null != observationSummaries)
            for (final io.swagger.client.model.ObservationSummary observationSummary:
            observationSummaries) this.add(new org.wheatgenetics.brapi1_3.studies.Observation(
                observationSummary , germplasmDbId      , germplasmName, observationLevel,
                observationUnitDbId, observationUnitName, studyDbId                      ));
    }

    Observations(final java.util.List<io.swagger.client.model.Observation> observations)
    {
        super();

        if (null != observations)
            for (final io.swagger.client.model.Observation observation: observations)
                this.add(new org.wheatgenetics.brapi1_3.studies.Observation(observation));
    }

    Observations(final java.util.List<io.swagger.client.model.Observation> observations,
    final java.lang.String operator, final java.lang.String uploadedBy)
    {
        super();

        if (null != observations)
            for (final io.swagger.client.model.Observation observation: observations)
                this.add(new org.wheatgenetics.brapi1_3.studies.Observation(
                    observation, operator, uploadedBy));
    }
}