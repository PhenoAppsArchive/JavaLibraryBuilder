package org.wheatgenetics.brapi1_3.observations.pr.o;

/**
 * Uses:
 * io.swagger.client.model.PhenotypesRequestObservation
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.observations.pr.o.Observation
 * org.wheatgenetics.brapi1_3.observations.pr.o.Observation.Container
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"}) public class Observations
extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items,
org.wheatgenetics.brapi1_3.observations.pr.o.Observation.Container
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
                this, observation));
    }
    // endregion

    // region Overridden Methods
    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (item instanceof org.wheatgenetics.brapi1_3.observations.pr.o.Observation)
        {
            final org.wheatgenetics.brapi1_3.observations.pr.o.Observation observation =
                (org.wheatgenetics.brapi1_3.observations.pr.o.Observation) item;
            if (observation.containersAreTheSame(this))
                { observation.setPosition(this.size()); this.arrayList().add(observation); }
        }
    }

    @java.lang.Override public void append()
    { this.append(new org.wheatgenetics.brapi1_3.observations.pr.o.Observation(this)); }

    @java.lang.Override public int size()
    { return null == this.arrayListInstance ? 0 : this.arrayListInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.arrayListInstance ? null :
            (org.wheatgenetics.brapi1_3.observations.pr.o.Observation)
                this.arrayListInstance.get(nonNegativePosition);
    }
    // endregion

    // region org.wheatgenetics.brapi1_3.observations.o.Observation.Container Overridden Method
    @java.lang.Override public boolean canMoveDown(final int position)
    { return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()); }
    // endregion
    // endregion

    public java.util.List<io.swagger.client.model.PhenotypesRequestObservation> list()
    { return this.arrayListInstance; }
}