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
    private java.util.List<io.swagger.client.model.ObservationTreatment> listInstance = null;  // ll

    private java.util.List<io.swagger.client.model.ObservationTreatment> list()
    {
        if (null == this.listInstance)
            // noinspection Convert2Diamond
            this.listInstance =
                new java.util.ArrayList<io.swagger.client.model.ObservationTreatment>();
        return this.listInstance;
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
            observationTreatments.listInstance) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment(
                    (org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment)
                        observationTreatment));
    }
    // endregion

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
                this.list().add(observationTreatment);
            }
        }
    }

    @java.lang.Override public void append()
    {
        this.append(
            new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment(this));
    }

    @java.lang.Override public int size()
    { return null == this.listInstance ? 0 : this.listInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.listInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment)
                this.listInstance.get(nonNegativePosition);
    }

    // region org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment.Container org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public boolean canMoveDown(final int position)
    { return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()); }

    @java.lang.Override public void moveUp(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.listInstance, position,position - 1);
    }

    @java.lang.Override public void moveDown(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.listInstance, position,position + 1);
    }

    @java.lang.Override public void delete(final int position)
    { org.wheatgenetics.javalib.mstrdtl.Utils.delete(this.listInstance, position); }
    // endregion
    // endregion

    public java.util.List<io.swagger.client.model.ObservationTreatment> getList()
    { return this.listInstance; }
}