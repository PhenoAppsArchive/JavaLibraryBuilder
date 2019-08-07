package org.wheatgenetics.brapi1_3.studies.nour.ot;              // nour: NewObservationUnitRequests

/**
 * Uses:
 * io.swagger.client.model.ObservationTreatment
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
class ObservationTreatment extends io.swagger.client.model.ObservationTreatment
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    private int position;

    // region Private Methods
    private void assign(final java.lang.String factor, java.lang.String modality)
    { this.factor(factor).modality(modality); }

    private int getPosition() { return this.position; }
    // endregion

    // region Constructors
    ObservationTreatment() { super(); }

    ObservationTreatment(final io.swagger.client.model.ObservationTreatment observationTreatment)
    {
        this();
        if (null != observationTreatment)
            this.assign(observationTreatment.getFactor(), observationTreatment.getModality());
    }

    ObservationTreatment(
    final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment observationTreatment)
    {
        this();
        if (null != observationTreatment)
        {
            this.setPosition(observationTreatment.getPosition());
            this.assign(observationTreatment.getFactor(), observationTreatment.getModality());
        }
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

    @java.lang.Override public java.lang.String getTitle  () { return this.getFactor(); }
    @java.lang.Override public java.lang.String getContent() { return this.toString (); }
    // endregion
}