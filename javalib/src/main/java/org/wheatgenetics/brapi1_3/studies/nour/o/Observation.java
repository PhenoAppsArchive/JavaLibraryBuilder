package org.wheatgenetics.brapi1_3.studies.nour.o;               // nour: NewObservationUnitRequests

/**
 * Uses:
 * org.threeten.bp.OffsetDateTime
 *
 * io.swagger.client.model.Observation
 * io.swagger.client.model.ObservationSummary
 * io.swagger.client.model.Season
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
class Observation extends io.swagger.client.model.Observation
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    private final int position;

    // region Private Methods
    private void assign(
    final java.lang.String germplasmDbId  , final java.lang.String germplasmName   ,
    final java.lang.String observationDbId, final java.lang.String observationLevel,
    final org.threeten.bp.OffsetDateTime observationTimeStamp,
    final java.lang.String observationUnitDbId    , final java.lang.String observationUnitName    ,
    final java.lang.String observationVariableDbId, final java.lang.String observationVariableName,
    final io.swagger.client.model.Season season   , final java.lang.String studyDbId              ,
    final java.lang.String value                                                                  )
    {
        final io.swagger.client.model.Season copyOfSeason =
            new io.swagger.client.model.Season().season(season.getSeason())
                .seasonDbId(season.getSeasonDbId()).year(season.getYear());
        this
            .germplasmDbId          (germplasmDbId          )
            .germplasmName          (germplasmName          )
            .observationDbId        (observationDbId        )
            .observationLevel       (observationLevel       )
            .observationTimeStamp   (observationTimeStamp   )
            .observationUnitDbId    (observationUnitDbId    )
            .observationUnitName    (observationUnitName    )
            .observationVariableDbId(observationVariableDbId)
            .observationVariableName(observationVariableName)
            .season                 (copyOfSeason           )
            .studyDbId              (studyDbId              )
            .value                  (value                  );
    }

    private int getPosition() { return this.position; }
    // endregion

    // region Constructors
    Observation(final int position)
    {
        super();

        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IllegalArgumentException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        else
            this.position = position;
    }

    Observation(final int position,
    final io.swagger.client.model.ObservationSummary observationSummary,
    final java.lang.String germplasmDbId      , final java.lang.String germplasmName      ,
    final java.lang.String observationLevel   , final java.lang.String observationUnitDbId,
    final java.lang.String observationUnitName, final java.lang.String studyDbId          )
    {
        this(position);
        if (null != observationSummary) this.assign(
            germplasmDbId                               ,               germplasmName      ,
            observationSummary.getObservationDbId     (),               observationLevel   ,
            observationSummary.getObservationTimeStamp(),               observationUnitDbId,
            observationUnitName,            observationSummary.getObservationVariableDbId(),
            observationSummary.getObservationVariableName(), observationSummary.getSeason(),
            studyDbId                                      , observationSummary.getValue ());
    }

    Observation(final int position, final io.swagger.client.model.Observation observation)
    {
        this(position);
        if (null != observation) this.assign(
            observation.getGermplasmDbId          (), observation.getGermplasmName          (),
            observation.getObservationDbId        (), observation.getObservationLevel       (),
            observation.getObservationTimeStamp   (), observation.getObservationUnitDbId    (),
            observation.getObservationUnitName    (), observation.getObservationVariableDbId(),
            observation.getObservationVariableName(), observation.getSeason                 (),
            observation.getStudyDbId              (), observation.getValue                  ());
    }

    Observation(final org.wheatgenetics.brapi1_3.studies.nour.o.Observation observation,
    final java.lang.String operator, final java.lang.String uploadedBy)
    { this(observation.position, observation); this.operator(operator).uploadedBy(uploadedBy); }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public java.lang.String getTitle() { return this.getObservationDbId(); }

    @java.lang.Override public java.lang.String getContent() { return this.toString(); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }
    // endregion
}