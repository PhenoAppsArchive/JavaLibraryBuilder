package org.wheatgenetics.brapi1_3.observations.pr.o;

/**
 * Uses:
 * io.swagger.client.model.PhenotypesRequestObservation
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
class Observation extends io.swagger.client.model.PhenotypesRequestObservation
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    private final int position;

    private int getPosition() { return this.position; }

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
    final io.swagger.client.model.PhenotypesRequestObservation observation)
    {
        this(position);
        if (null != observation) this
            .collector              (observation.getCollector              ())
            .observationDbId        (observation.getObservationDbId        ())
            .observationTimeStamp   (observation.getObservationTimeStamp   ())
            .observationVariableDbId(observation.getObservationVariableDbId())
            .observationVariableName(observation.getObservationVariableName())
            .season                 (observation.getSeason                 ())
            .value                  (observation.getValue                  ());
    }

    @java.lang.SuppressWarnings({"unused"})
    Observation(final org.wheatgenetics.brapi1_3.observations.pr.o.Observation observation)
    { this(observation.getPosition(), observation); }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public java.lang.String getTitle() { return this.getObservationDbId(); }

    @java.lang.Override public java.lang.String getContent() { return this.toString(); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }
    // endregion
}