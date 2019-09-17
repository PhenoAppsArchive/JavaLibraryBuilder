package org.wheatgenetics.brapi1_3.studies.nor;                       // nor: NewObservationsRequest

/**
 * Uses:
 * org.threeten.bp.OffsetDateTime
 *
 * io.swagger.client.model.NewObservationsRequestObservations
 * io.swagger.client.model.Observation
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Utils
 */
class NewObservationsRequestObservations
extends io.swagger.client.model.NewObservationsRequestObservations
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    // region Fields
    private transient
        org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations.Container
            container;
    private int position;
    // endregion

    private void assign(
    final java.lang.String               collector              ,
    final java.lang.String               observationDbId        ,
    final org.threeten.bp.OffsetDateTime observationTimeStamp   ,
    final java.lang.String               observationUnitDbId    ,
    final java.lang.String               observationVariableDbId,
    final java.lang.String               value                  )
    {
        this.collector              (collector              )
            .observationDbId        (observationDbId        )
            .observationTimeStamp   (observationTimeStamp   )
            .observationUnitDbId    (observationUnitDbId    )
            .observationVariableDbId(observationVariableDbId)
            .value                  (value                  );
    }

    // region Constructors
    /**
     * Called by second NewObservationsRequestObservations(),
     * third NewObservationsRequestObservations(),
     * org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest.append(), and
     * NewObservationsRequestTest.
     */
    NewObservationsRequestObservations(final
    org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations.Container container)
    { super(); this.setContainer(container); }

    /** Called by org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest(). */
    NewObservationsRequestObservations(final
    org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations.Container container,
    final io.swagger.client.model.Observation observation)
    {
        this(container);
        if (null != observation) this.assign(
            observation.getOperator               (),
            observation.getObservationDbId        (),
            observation.getObservationTimeStamp   (),
            observation.getObservationUnitDbId    (),
            observation.getObservationVariableDbId(),
            observation.getValue                  ());
    }

    /** Called by org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest.fromJson(). */
    NewObservationsRequestObservations(final
    org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations.Container container,
    final io.swagger.client.model.NewObservationsRequestObservations
        newObservationsRequestObservations)
    {
        this(container);
        if (null != newObservationsRequestObservations) this.assign(
            newObservationsRequestObservations.getCollector              (),
            newObservationsRequestObservations.getObservationDbId        (),
            newObservationsRequestObservations.getObservationTimeStamp   (),
            newObservationsRequestObservations.getObservationUnitDbId    (),
            newObservationsRequestObservations.getObservationVariableDbId(),
            newObservationsRequestObservations.getValue                  ());
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public void setContainer(final
    org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations.Container container)
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

    boolean containersAreTheSame(final
    org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations.Container container)
    { return container == this.container; }
}