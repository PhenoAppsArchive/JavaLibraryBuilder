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
    private java.util.ArrayList<io.swagger.client.model.ObservationUnitXref>
        arrayListInstance = null;                                                       // lazy load

    private java.util.ArrayList<io.swagger.client.model.ObservationUnitXref> arrayList()
    {
        if (null == this.arrayListInstance)
            // noinspection Convert2Diamond
            this.arrayListInstance =
                new java.util.ArrayList<io.swagger.client.model.ObservationUnitXref>();
        return this.arrayListInstance;
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
            observationUnitXrefs.arrayListInstance) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref(
                    (org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref)
                        observationUnitXref));
    }
    // endregion

    // region Overridden Methods
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
                this.arrayList().add(observationUnitXref);
            }
        }
    }

    @java.lang.Override public void append()
    {
        this.append(
            new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref(this));
    }

    @java.lang.Override public int size()
    { return null == this.arrayListInstance ? 0 : this.arrayListInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.arrayListInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref)
                this.arrayListInstance.get(nonNegativePosition);
    }
    // endregion

    // region org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref.Container Overridden Methods
    @java.lang.Override public boolean canMoveDown(final int position)
    { return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()); }

    @java.lang.Override public void moveUp(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(position, this.size()))
            java.util.Collections.swap(this.arrayListInstance, position,position - 1);
    }

    @java.lang.Override public void moveDown(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()))
            java.util.Collections.swap(this.arrayListInstance, position,position + 1);
    }
    // endregion
    // endregion

    public java.util.List<io.swagger.client.model.ObservationUnitXref> list()
    { return this.arrayListInstance; }
}