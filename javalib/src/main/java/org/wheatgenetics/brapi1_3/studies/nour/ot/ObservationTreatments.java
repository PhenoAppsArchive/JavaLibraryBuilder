package org.wheatgenetics.brapi1_3.studies.nour.ot;              // nour: NewObservationUnitRequests

/**
 * Uses:
 * io.swagger.client.model.ObservationTreatment
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"}) public class ObservationTreatments
extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items
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
        {
            int position = 0;
            for (final io.swagger.client.model.ObservationTreatment observationTreatment:
            observationTreatments)
                this.add(new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment(
                    position++, observationTreatment));
        }
    }

    @java.lang.SuppressWarnings({"CopyConstructorMissesField"}) public ObservationTreatments(
    final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments observationTreatments)
    {
        super();

        if (null != observationTreatments) if (observationTreatments.size() > 0)
            for (final io.swagger.client.model.ObservationTreatment observationTreatment:
            observationTreatments.arrayListInstance)
                this.add(new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment(
                    (org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment)
                        observationTreatment));
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void add(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        this.arrayList().add(
            (org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment) item);
    }

    @java.lang.Override public void append()
    { this.add(new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment(this.size())); }

    @java.lang.Override public int size()
    { return null == this.arrayListInstance ? 0 : this.arrayListInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        return null == this.arrayListInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment)
                this.arrayListInstance.get(position);
    }
    // endregion

    public java.util.List<io.swagger.client.model.ObservationTreatment> list()
    { return this.arrayListInstance; }
}