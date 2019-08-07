package org.wheatgenetics.brapi1_3.studies.nor;                       // nor: NewObservationsRequest

/**
 * Uses:
 * io.swagger.client.model.NewObservationsRequestObservations
 * io.swagger.client.model.Observation
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
class NewObservationsRequestObservations
extends io.swagger.client.model.NewObservationsRequestObservations
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    private int position;

    // region Constructors
    NewObservationsRequestObservations() { super(); }

    NewObservationsRequestObservations(final io.swagger.client.model.Observation observation)
    {
        this();
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
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IllegalArgumentException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        else
            this.position = position;
    }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }

    @java.lang.Override public java.lang.String getTitle  () { return this.getObservationDbId(); }
    @java.lang.Override public java.lang.String getContent() { return this.toString          (); }
    // endregion

    @java.lang.SuppressWarnings({"WeakerAccess", "RedundantSuppression"})
    int getPosition() { return this.position; }
}