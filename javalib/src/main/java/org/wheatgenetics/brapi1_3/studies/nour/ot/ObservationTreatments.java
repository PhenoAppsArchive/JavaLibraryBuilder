package org.wheatgenetics.brapi1_3.studies.nour.ot;              // nour: NewObservationUnitRequests

/**
 * Uses:
 * io.swagger.client.model.ObservationTreatment
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment
 * org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment.Container
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"}) public class ObservationTreatments
extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items,
org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment.Container
{
    private java.util.ArrayList<io.swagger.client.model.ObservationTreatment>
        arrayListInstance = null;                                                       // lazy load

    private java.util.ArrayList<io.swagger.client.model.ObservationTreatment> arrayList()
    {
        if (null == this.arrayListInstance)
            // noinspection Convert2Diamond
            this.arrayListInstance =
                new java.util.ArrayList<io.swagger.client.model.ObservationTreatment>();
        return this.arrayListInstance;
    }

    // region Constructors
    public ObservationTreatments(
    final java.util.List<io.swagger.client.model.ObservationTreatment> observationTreatments)
    {
        super();
        if (null != observationTreatments) if (observationTreatments.size() > 0)
            for (final io.swagger.client.model.ObservationTreatment observationTreatment:
            observationTreatments) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment(
                    this, observationTreatment));
    }

    @java.lang.SuppressWarnings({"CopyConstructorMissesField"}) public ObservationTreatments(
    final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments observationTreatments)
    {
        super();
        if (null != observationTreatments) if (observationTreatments.size() > 0)
            for (final io.swagger.client.model.ObservationTreatment observationTreatment:
            observationTreatments.arrayListInstance) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment(
                    (org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment)
                        observationTreatment));
    }
    // endregion

    // region Overridden Method
    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (item instanceof org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment)
        {
            final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment
                observationTreatment =
                    (org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment) item;
            if (observationTreatment.containersAreTheSame(this))
            {
                observationTreatment.setPosition(this.size());
                this.arrayList().add(observationTreatment);
            }
        }
    }

    @java.lang.Override public void append()
    {
        this.append(
            new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment(this));
    }

    @java.lang.Override public int size()
    { return null == this.arrayListInstance ? 0 : this.arrayListInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.arrayListInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment)
                this.arrayListInstance.get(nonNegativePosition);
    }
    // endregion

    // region org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment.Container Overridden Methods
    @java.lang.Override public boolean canMoveDown(final int position)
    { return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()); }

    @java.lang.Override public void moveUp(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.arrayListInstance, position,position - 1);
    }

    @java.lang.Override public void moveDown(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.arrayListInstance, position,position + 1);
    }
    // endregion

    public java.util.List<io.swagger.client.model.ObservationTreatment> list()
    { return this.arrayListInstance; }
}