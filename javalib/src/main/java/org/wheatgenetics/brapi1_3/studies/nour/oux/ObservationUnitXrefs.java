package org.wheatgenetics.brapi1_3.studies.nour.oux;             // nour: NewObservationUnitRequests

/**
 * Uses:
 * io.swagger.client.model.ObservationUnitXref
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref
 * org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"}) public class ObservationUnitXrefs
extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items,
org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container
{
    private java.util.List<io.swagger.client.model.ObservationUnitXref> listInstance = null;   // ll

    private java.util.List<io.swagger.client.model.ObservationUnitXref> list()
    {
        if (null == this.listInstance)
            // noinspection Convert2Diamond
            this.listInstance =
                new java.util.ArrayList<io.swagger.client.model.ObservationUnitXref>();
        return this.listInstance;
    }

    // region Constructors
    public ObservationUnitXrefs(
    final java.util.List<io.swagger.client.model.ObservationUnitXref> observationUnitXrefs)
    {
        super();
        if (null != observationUnitXrefs) if (observationUnitXrefs.size() > 0)
            for (final io.swagger.client.model.ObservationUnitXref observationUnitXref:
            observationUnitXrefs) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref(
                    this, observationUnitXref));
    }

    @java.lang.SuppressWarnings({"CopyConstructorMissesField"}) public ObservationUnitXrefs(
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs observationUnitXrefs)
    {
        super();
        if (null != observationUnitXrefs) if (observationUnitXrefs.size() > 0)
            for (final io.swagger.client.model.ObservationUnitXref observationUnitXref:
            observationUnitXrefs.listInstance) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref(
                    (org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref)
                        observationUnitXref));
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (item instanceof org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref)
        {
            final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref
                observationUnitXref =
                    (org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref) item;
            if (observationUnitXref.containersAreTheSame(this))
            {
                observationUnitXref.setPosition(this.size());
                this.list().add(observationUnitXref);
            }
        }
    }

    @java.lang.Override public void append()
    {
        this.append(
            new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref(this));
    }

    @java.lang.Override public int size()
    { return null == this.listInstance ? 0 : this.listInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.listInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref)
                this.listInstance.get(nonNegativePosition);
    }

    // region org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
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

    public java.util.List<io.swagger.client.model.ObservationUnitXref> getList()
    { return this.listInstance; }
}