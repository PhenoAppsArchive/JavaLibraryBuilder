package org.wheatgenetics.brapi1_3.studies.nour.oux;             // nour: NewObservationUnitRequests

/**
 * Uses:
 * io.swagger.client.model.ObservationUnitXref
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"}) public class ObservationUnitXrefs
extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items
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
            observationUnitXrefs)
                this.append(new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref(
                    observationUnitXref));
    }

    @java.lang.SuppressWarnings({"CopyConstructorMissesField"}) public ObservationUnitXrefs(
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs observationUnitXrefs)
    {
        super();
        if (null != observationUnitXrefs) if (observationUnitXrefs.size() > 0)
            for (final io.swagger.client.model.ObservationUnitXref observationUnitXref:
            observationUnitXrefs.arrayListInstance)
                this.append(new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref(
                    (org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref)
                        observationUnitXref));
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (null != item) item.setPosition(this.size());
        this.arrayList().add(
            (org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref) item);
    }

    @java.lang.Override public void append()
    { this.append(new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref()); }

    @java.lang.Override public int size()
    { return null == this.arrayListInstance ? 0 : this.arrayListInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IllegalArgumentException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        return null == this.arrayListInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref)
                this.arrayListInstance.get(position);
    }
    // endregion

    public java.util.List<io.swagger.client.model.ObservationUnitXref> list()
    { return this.arrayListInstance; }
}