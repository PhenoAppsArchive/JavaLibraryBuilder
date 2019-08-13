package org.wheatgenetics.brapi1_3.studies.nor;                       // nor: NewObservationsRequest

/**
 * Uses:
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
    private final
        org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations.Container
            container;
    private int position;
    // endregion

    // region Constructors
    NewObservationsRequestObservations(final
    org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations.Container container)
    { super(); this.container = container; }

    NewObservationsRequestObservations(final
    org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations.Container container,
    final io.swagger.client.model.Observation observation)
    {
        this(container);
        if (null != observation) this
            .collector              (observation.getOperator               ())
            .observationDbId        (observation.getObservationDbId        ())
            .observationTimeStamp   (observation.getObservationTimeStamp   ())
            .observationUnitDbId    (observation.getObservationUnitDbId    ())
            .observationVariableDbId(observation.getObservationVariableDbId())
            .value                  (observation.getValue                  ());
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public void setPosition(final int position)
    { this.position = org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position); }

    @java.lang.Override public int getPosition() { return this.position; }

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