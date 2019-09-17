package org.wheatgenetics.brapi1_3.studies.nour.ot;              // nour: NewObservationUnitRequests

/**
 * Uses:
 * io.swagger.client.model.ObservationTreatment
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Utils
 */
class ObservationTreatment extends io.swagger.client.model.ObservationTreatment
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    // region Fields
    private transient org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment.Container
        container;
    private int position;
    // endregion

    private void assign(final java.lang.String factor, java.lang.String modality)
    { this.factor(factor).modality(modality); }

    // region Constructors
    /**
     * Called by second ObservationTreatment(), third ObservationTreatment(),
     * org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments.append(), and
     * ObservationTreatmentsTest.
     */
    ObservationTreatment(
    final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment.Container container)
    { super(); this.setContainer(container); }

    /**
     * Called by org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments.append(
     * observationTreatments).
     */
    ObservationTreatment(
    final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment.Container container,
    final io.swagger.client.model.ObservationTreatment                   observationTreatment)
    {
        this(container);
        if (null != observationTreatment)
            this.assign(observationTreatment.getFactor(), observationTreatment.getModality());
    }

    /** Called by org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments(). */
    ObservationTreatment(
    final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment observationTreatment)
    {
        this(observationTreatment.container); this.setPosition(observationTreatment.getPosition());
        this.assign(observationTreatment.getFactor(), observationTreatment.getModality());
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public void setContainer(
    final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment.Container container)
    { this.container = container; }

    @java.lang.Override public int getPosition() { return this.position; }

    @java.lang.Override public void setPosition(final int position)
    { this.position = org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }

    @java.lang.Override public java.lang.String getTitle  () { return this.getFactor(); }
    @java.lang.Override public java.lang.String getContent() { return this.toString (); }

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
    final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment.Container container)
    { return container == this.container; }
}