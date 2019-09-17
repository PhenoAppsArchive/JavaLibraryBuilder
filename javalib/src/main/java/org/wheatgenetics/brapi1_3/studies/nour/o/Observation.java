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
 * org.wheatgenetics.javalib.mstrdtl.Utils
 */
class Observation extends io.swagger.client.model.Observation
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    // region Fields
    private transient org.wheatgenetics.brapi1_3.studies.nour.o.Observation.Container container;
    private           int                                                             position ;
    // endregion

    private void assign(
    final java.lang.String germplasmDbId  , final java.lang.String germplasmName   ,
    final java.lang.String observationDbId, final java.lang.String observationLevel,
    final org.threeten.bp.OffsetDateTime observationTimeStamp,
    final java.lang.String observationUnitDbId    , final java.lang.String observationUnitName    ,
    final java.lang.String observationVariableDbId, final java.lang.String observationVariableName,
    final io.swagger.client.model.Season season   , final java.lang.String studyDbId              ,
    final java.lang.String value                                                                  )
    {
        final io.swagger.client.model.Season copyOfSeason = null == season ? null :
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

    // region Constructors
    /**
     * Called by second Observation(), third Observation(), fourth Observation(),
     * org.wheatgenetics.brapi1_3.studies.nour.o.Observations.append(), and ObservationsTest.
     */
    Observation(final org.wheatgenetics.brapi1_3.studies.nour.o.Observation.Container container,
    final java.lang.String operator, final java.lang.String uploadedBy)
    { super(); this.setContainer(container); this.operator(operator).uploadedBy(uploadedBy); }

    /** Called by second org.wheatgenetics.brapi1_3.studies.nour.o.Observations(). */
    Observation(final org.wheatgenetics.brapi1_3.studies.nour.o.Observation.Container container,
    final io.swagger.client.model.ObservationSummary observationSummary,
    final java.lang.String germplasmDbId      , final java.lang.String germplasmName      ,
    final java.lang.String observationLevel   , final java.lang.String observationUnitDbId,
    final java.lang.String observationUnitName, final java.lang.String studyDbId          ,
    final java.lang.String operator           , final java.lang.String uploadedBy         )
    {
        this(container, operator, uploadedBy); if (null != observationSummary) this.assign(
            germplasmDbId                               ,                      germplasmName      ,
            observationSummary.getObservationDbId     (),                      observationLevel   ,
            observationSummary.getObservationTimeStamp(),                      observationUnitDbId,
            observationUnitName,                   observationSummary.getObservationVariableDbId(),
            observationSummary.getObservationVariableName(),        observationSummary.getSeason(),
            studyDbId                                      ,        observationSummary.getValue ());
    }

    /** Called by third org.wheatgenetics.brapi1_3.studies.nour.o.Observations(). */
    Observation(final org.wheatgenetics.brapi1_3.studies.nour.o.Observation observation,
    final java.lang.String operator, final java.lang.String uploadedBy)
    {
        this(observation.container, operator, uploadedBy);
        this.setPosition(observation.getPosition()); this.assign(
            observation.getGermplasmDbId          (), observation.getGermplasmName          (),
            observation.getObservationDbId        (), observation.getObservationLevel       (),
            observation.getObservationTimeStamp   (), observation.getObservationUnitDbId    (),
            observation.getObservationUnitName    (), observation.getObservationVariableDbId(),
            observation.getObservationVariableName(), observation.getSeason                 (),
            observation.getStudyDbId              (), observation.getValue                  ());

    }

    /**
     * Called by fourth org.wheatgenetics.brapi1_3.studies.nour.o.Observations() and
     * org.wheatgenetics.brapi1_3.studies.nour.o.Observations.fromJson().
     */
    Observation(final org.wheatgenetics.brapi1_3.studies.nour.o.Observation.Container container,
    final io.swagger.client.model.Observation observation, final java.lang.String operator,
    final java.lang.String uploadedBy)
    {
        this(container, operator, uploadedBy); if (null != observation) this.assign(
        observation.getGermplasmDbId          (), observation.getGermplasmName          (),
        observation.getObservationDbId        (), observation.getObservationLevel       (),
        observation.getObservationTimeStamp   (), observation.getObservationUnitDbId    (),
        observation.getObservationUnitName    (), observation.getObservationVariableDbId(),
        observation.getObservationVariableName(), observation.getSeason                 (),
        observation.getStudyDbId              (), observation.getValue                  ());
    }

    /**
     * Called by androidlibrary
     * org.wheatgenetics.brapi1_3.studies.nour.o.ObservationAlertDialog.show().
     */
    @java.lang.SuppressWarnings({"unused"})
    Observation(final org.wheatgenetics.brapi1_3.studies.nour.o.Observation observation)
    { this(observation, observation.getOperator(), observation.getUploadedBy()); }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public void setContainer(
    final org.wheatgenetics.brapi1_3.studies.nour.o.Observation.Container container)
    { this.container = container; }

    @java.lang.Override public int getPosition() { return this.position; }

    @java.lang.Override public void setPosition(final int position)
    { this.position = org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }

    @java.lang.Override public java.lang.String getTitle  () { return this.getObservationDbId(); }
    @java.lang.Override public java.lang.String getContent() { return this.toString          (); }

    @java.lang.Override public boolean canMoveUp()
    {
        return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(
            this.container, this.getPosition());
    }

    @java.lang.Override public boolean canMoveDown()
    {
        return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(
            this.container, this.getPosition());
    }
    // endregion

    boolean containersAreTheSame(
    final org.wheatgenetics.brapi1_3.studies.nour.o.Observation.Container container)
    { return container == this.container; }
}