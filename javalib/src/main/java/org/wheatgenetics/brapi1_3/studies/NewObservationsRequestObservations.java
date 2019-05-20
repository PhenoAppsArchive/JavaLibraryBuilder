package org.wheatgenetics.brapi1_3.studies;

/**
 * Uses:
 * io.swagger.client.model.NewObservationsRequestObservations
 * io.swagger.client.model.Observation
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
public class NewObservationsRequestObservations
extends io.swagger.client.model.NewObservationsRequestObservations
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    private final int position;

    // region Constructors
    NewObservationsRequestObservations(final int position) { super(); this.position = position; }

    NewObservationsRequestObservations(final int position,
    final io.swagger.client.model.Observation observation)
    {
        this(position);

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
    @java.lang.Override public java.lang.String getTitle() { return this.getObservationDbId(); }

    @java.lang.Override public java.lang.String getContent() { return this.toString(); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }
    // endregion

    int getPosition() { return this.position; }
}