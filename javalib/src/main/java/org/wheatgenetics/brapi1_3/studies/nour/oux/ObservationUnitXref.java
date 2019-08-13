package org.wheatgenetics.brapi1_3.studies.nour.oux;             // nour: NewObservationUnitRequests

/**
 * Uses:
 * io.swagger.client.model.ObservationUnitXref
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Utils
 */
class ObservationUnitXref extends io.swagger.client.model.ObservationUnitXref
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    // region Fields
    private final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container
        container;
    private int position;
    // endregion

    private void assign(final java.lang.String id, final java.lang.String source)
    { this.id(id).source(source); }

    // region Constructors
    ObservationUnitXref(final
    org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container container)
    { super(); this.container = container; }

    ObservationUnitXref(final
    org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container container,
    final io.swagger.client.model.ObservationUnitXref observationUnitXref)
    {
        this(container);
        if (null != observationUnitXref)
            this.assign(observationUnitXref.getId(), observationUnitXref.getSource());
    }

    ObservationUnitXref(
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref observationUnitXref)
    {
        this(observationUnitXref.container); this.setPosition(observationUnitXref.getPosition());
        this.assign(observationUnitXref.getId(), observationUnitXref.getSource());
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public void setPosition(final int position)
    { this.position = org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position); }

    @java.lang.Override public int getPosition() { return this.position; }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }

    @java.lang.Override public java.lang.String getTitle  () { return this.getId   (); }
    @java.lang.Override public java.lang.String getContent() { return this.toString(); }

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
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container container)
    { return container == this.container; }
}