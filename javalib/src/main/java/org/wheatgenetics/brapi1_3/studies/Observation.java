package org.wheatgenetics.brapi1_3.studies;

/**
 * Uses:
 * io.swagger.client.model.Observation
 * io.swagger.client.model.ObservationSummary
 */
class Observation extends io.swagger.client.model.Observation
{
    Observation(final io.swagger.client.model.ObservationSummary observationSummary)
    {
        super();

        if (null != observationSummary) this                                        // TODO: Others!
            .observationDbId        (observationSummary.getObservationDbId        ())
            .observationTimeStamp   (observationSummary.getObservationTimeStamp   ())
            .observationVariableDbId(observationSummary.getObservationVariableDbId())
            .observationVariableName(observationSummary.getObservationVariableName())
            .season                 (observationSummary.getSeason                 ())
            .value                  (observationSummary.getValue                  ());
    }
}