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
    final java.util.List<io.swagger.client.model.ObservationSummary> observationSummaries)
    {
        super();

        if (null != observationSummaries)
            for (final io.swagger.client.model.ObservationSummary observationSummary:
            observationSummaries)
                this.add(new org.wheatgenetics.brapi1_3.studies.Observation(observationSummary));
    }
}