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
    private transient org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container
        container;
    private int position;
    // endregion

    private void assign(final java.lang.String id, final java.lang.String source)
    { this.id(id).source(source); }

    // region Constructors
    /**
     * Called by org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs.append(), second
     * ObservationUnitXref(), and ObservationUnitXrefsTest.
     */
    ObservationUnitXref(final
    org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container container)
    { super(); this.setContainer(container); }

    /**
     * Called by org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs.append(
     * observationUnitXrefs) and third ObservationUnitXref().
     */
    ObservationUnitXref(
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container container,
    final io.swagger.client.model.ObservationUnitXref                     observationUnitXref)
    {
        this(container);
        if (null != observationUnitXref)
            this.assign(observationUnitXref.getId(), observationUnitXref.getSource());
    }

    /** Called by third org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs(). */
    ObservationUnitXref(
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container container,
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref observationUnitXref)
    {
        this(container, (io.swagger.client.model.ObservationUnitXref) observationUnitXref);
        this.setPosition(observationUnitXref.getPosition());
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public void setContainer(
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container container)
    { this.container = container; }

    @java.lang.Override public int getPosition() { return this.position; }

    @java.lang.Override public void setPosition(final int position)
    { this.position = org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position); }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override
    public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override public java.lang.String getTitle()
    { return this.getId(); }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override public java.lang.String getContent()
    { return this.toString(); }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override public boolean canMoveUp()
    {
        return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(
            this.container, this.getPosition());
    }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override public boolean canMoveDown()
    {
        return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(
            this.container, this.getPosition());
    }
    // endregion

    boolean containersAreTheSame(
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container container)
    { return container == this.container; }
}