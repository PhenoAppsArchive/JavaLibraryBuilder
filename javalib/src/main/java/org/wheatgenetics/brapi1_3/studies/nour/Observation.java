package org.wheatgenetics.brapi1_3.studies.nour;

/**
 * Uses:
 * io.swagger.client.model.Observation
 * io.swagger.client.model.ObservationSummary
 */
class Observation extends io.swagger.client.model.Observation
{
    Observation(final io.swagger.client.model.ObservationSummary observationSummary,
    final java.lang.String germplasmDbId      , final java.lang.String germplasmName      ,
    final java.lang.String observationLevel   , final java.lang.String observationUnitDbId,
    final java.lang.String observationUnitName, final java.lang.String studyDbId          )
    {
        super();

        if (null != observationSummary) this
            .germplasmDbId          (germplasmDbId                                  )
            .germplasmName          (germplasmName                                  )
            .observationDbId        (observationSummary.getObservationDbId()        )
            .observationLevel       (observationLevel                               )
            .observationTimeStamp   (observationSummary.getObservationTimeStamp()   )
            .observationUnitDbId    (observationUnitDbId                            )
            .observationUnitName    (observationUnitName                            )
            .observationVariableDbId(observationSummary.getObservationVariableDbId())
            .observationVariableName(observationSummary.getObservationVariableName())
            .season                 (observationSummary.getSeason                 ())
            .studyDbId              (studyDbId                                      )
            .value                  (observationSummary.getValue()                  );
    }

    Observation(final io.swagger.client.model.Observation observation)
    {
        super();

        if (null != observation) this
            .germplasmDbId          (observation.getGermplasmDbId          ())
            .germplasmName          (observation.getGermplasmName          ())
            .observationDbId        (observation.getObservationDbId        ())
            .observationLevel       (observation.getObservationLevel       ())
            .observationTimeStamp   (observation.getObservationTimeStamp   ())
            .observationUnitDbId    (observation.getObservationUnitDbId    ())
            .observationUnitName    (observation.getObservationUnitName    ())
            .observationVariableDbId(observation.getObservationVariableDbId())
            .observationVariableName(observation.getObservationVariableName())
            .season                 (observation.getSeason                 ())
            .studyDbId              (observation.getStudyDbId              ())
            .value                  (observation.getValue                  ());
    }

    Observation(final io.swagger.client.model.Observation observation,
    final java.lang.String operator, final java.lang.String uploadedBy)
    { this(observation); this.operator(operator).uploadedBy(uploadedBy); }
}