package org.wheatgenetics.brapi1_3.studies.nour.oux;                 // nour: NewObservationUnitRequests

/**
 * Uses:
 * io.swagger.client.model.ObservationUnitXref
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
class ObservationUnitXref extends io.swagger.client.model.ObservationUnitXref
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    private final int position;

    // region Private Methods
    private void assign(final java.lang.String id, final java.lang.String source)
    { this.id(id).source(source); }

    private int getPosition() { return this.position; }
    // endregion

    // region Constructors
    ObservationUnitXref(final int position) { super(); this.position = position; }

    ObservationUnitXref(final int position,
    final io.swagger.client.model.ObservationUnitXref observationUnitXref)
    {
        this(position);
        if (null != observationUnitXref)
            this.assign(observationUnitXref.getId(), observationUnitXref.getSource());
    }

    ObservationUnitXref(
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref observationUnitXref)
    {
        this(observationUnitXref.getPosition());
        this.assign(observationUnitXref.getId(), observationUnitXref.getSource());
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public java.lang.String getTitle() { return this.getId(); }

    @java.lang.Override public java.lang.String getContent() { return this.toString(); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }
    // endregion
}