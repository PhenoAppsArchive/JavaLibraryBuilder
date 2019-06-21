package org.wheatgenetics.brapi1_3.studies.nour;

/**
 * Uses:
 * io.swagger.client.model.ObservationTreatment
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
class ObservationTreatment extends io.swagger.client.model.ObservationTreatment
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    private final int position;

    // region Private Methods
    private void assign(final java.lang.String factor, java.lang.String modality)
    { this.factor(factor).modality(modality); }

    private int getPosition() { return this.position; }
    // endregion

    // region Constructors
    ObservationTreatment(final int position) { super(); this.position = position; }

    ObservationTreatment(final int position,
    final io.swagger.client.model.ObservationTreatment observationTreatment)
    {
        this(position);
        if (null != observationTreatment)
            this.assign(observationTreatment.getFactor(), observationTreatment.getModality());
    }

    ObservationTreatment(
    final org.wheatgenetics.brapi1_3.studies.nour.ObservationTreatment observationTreatment)
    {
        this(observationTreatment.getPosition());
        this.assign(observationTreatment.getFactor(), observationTreatment.getModality());
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public java.lang.String getTitle() { return this.getFactor(); }

    @java.lang.Override public java.lang.String getContent() { return this.toString(); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }
    // endregion
}