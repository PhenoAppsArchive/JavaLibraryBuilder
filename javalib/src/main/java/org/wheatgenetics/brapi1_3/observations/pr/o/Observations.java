package org.wheatgenetics.brapi1_3.observations.pr.o;

/**
 * Uses:
 * io.swagger.client.model.PhenotypesRequestObservation
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.brapi1_3.observations.pr.o.Observation
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"}) public class Observations
extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items
{
    private java.util.ArrayList<io.swagger.client.model.PhenotypesRequestObservation>
        arrayListInstance = null;                                                       // lazy load

    private java.util.ArrayList<io.swagger.client.model.PhenotypesRequestObservation> arrayList()
    {
        if (null == this.arrayListInstance)
            // noinspection Convert2Diamond
            this.arrayListInstance =
                new java.util.ArrayList<io.swagger.client.model.PhenotypesRequestObservation>();
        return this.arrayListInstance;
    }

    // region Constructors
    public Observations() { super(); }

    public Observations(
    final java.util.List<io.swagger.client.model.PhenotypesRequestObservation> observations)
    {
        this();
        if (null != observations) if (observations.size() > 0)
            for (final io.swagger.client.model.PhenotypesRequestObservation observation:
            observations) this.append(new org.wheatgenetics.brapi1_3.observations.pr.o.Observation(
                observation));
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (null != item) item.setPosition(this.size());
        this.arrayList().add((org.wheatgenetics.brapi1_3.observations.pr.o.Observation) item);
    }

    @java.lang.Override public void append()
    { this.append(new org.wheatgenetics.brapi1_3.observations.pr.o.Observation()); }

    @java.lang.Override public int size()
    { return null == this.arrayListInstance ? 0 : this.arrayListInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IllegalArgumentException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        return null == this.arrayListInstance ? null :
            (org.wheatgenetics.brapi1_3.observations.pr.o.Observation)
                this.arrayListInstance.get(position);
    }
    // endregion

    public java.util.List<io.swagger.client.model.PhenotypesRequestObservation> list()
    { return this.arrayListInstance; }
}