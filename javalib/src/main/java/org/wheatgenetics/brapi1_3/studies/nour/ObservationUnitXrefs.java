package org.wheatgenetics.brapi1_3.studies.nour;

/**
 * Uses:
 * io.swagger.client.model.ObservationUnitXref
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.brapi1_3.studies.nour.ObservationUnitXref
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"}) class ObservationUnitXrefs
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
    ObservationUnitXrefs(
    final java.util.List<io.swagger.client.model.ObservationUnitXref> observationUnitXrefs)
    {
        super();

        if (null != observationUnitXrefs) if (observationUnitXrefs.size() > 0)
        {
            int position = 0;
            for (final io.swagger.client.model.ObservationUnitXref observationUnitXref:
            observationUnitXrefs)
                this.arrayList().add(
                    new org.wheatgenetics.brapi1_3.studies.nour.ObservationUnitXref(
                        position++, observationUnitXref));
        }
    }

    @java.lang.SuppressWarnings({"CopyConstructorMissesField"}) ObservationUnitXrefs(
    final org.wheatgenetics.brapi1_3.studies.nour.ObservationUnitXrefs observationUnitXrefs)
    {
        super();

        if (null != observationUnitXrefs) if (observationUnitXrefs.size() > 0)
            for (final io.swagger.client.model.ObservationUnitXref observationUnitXref:
            observationUnitXrefs.arrayListInstance)
                this.add(new org.wheatgenetics.brapi1_3.studies.nour.ObservationUnitXref(
                    (org.wheatgenetics.brapi1_3.studies.nour.ObservationUnitXref)
                        observationUnitXref));
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void add(final org.wheatgenetics.javalib.mstrdtl.Item item)
    { this.arrayList().add((org.wheatgenetics.brapi1_3.studies.nour.ObservationUnitXref) item); }

    @java.lang.Override public void append()
    { this.add(new org.wheatgenetics.brapi1_3.studies.nour.ObservationUnitXref(this.size())); }

    @java.lang.Override public int size()
    { return null == this.arrayListInstance ? 0 : this.arrayListInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        return null == this.arrayListInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.ObservationUnitXref)
                this.arrayListInstance.get(position);
    }
    // endregion

    java.util.List<io.swagger.client.model.ObservationUnitXref> list()
    { return this.arrayListInstance; }
}