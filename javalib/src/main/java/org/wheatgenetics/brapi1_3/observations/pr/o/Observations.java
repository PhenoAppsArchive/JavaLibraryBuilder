package org.wheatgenetics.brapi1_3.observations.pr.o;

/**
 * Uses:
 * com.google.gson.Gson
 * com.google.gson.GsonBuilder
 * com.google.gson.reflect.TypeToken
 *
 * io.swagger.client.model.PhenotypesRequestObservation
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.observations.pr.o.Observation
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"}) public class Observations
extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items
{
    // region Fields
    private java.util.List<io.swagger.client.model.PhenotypesRequestObservation>
        listInstance = null;                                                            // lazy load
    private transient com.google.gson.Gson   gsonInstance = null;                       // lazy load
    private transient java.lang.reflect.Type typeInstance = null;                       // lazy load
    // endregion

    // region Private Methods
    private org.wheatgenetics.brapi1_3.observations.pr.o.Observations append(final
    java.util.List<io.swagger.client.model.PhenotypesRequestObservation> observations)
    {
        if (null != observations) if (observations.size() > 0)
            for (final io.swagger.client.model.PhenotypesRequestObservation
            phenotypesRequestObservation: observations) this.append(
                new org.wheatgenetics.brapi1_3.observations.pr.o.Observation(
                    this, phenotypesRequestObservation));
        return this;
    }

    private java.util.List<io.swagger.client.model.PhenotypesRequestObservation> list()
    {
        if (null == this.listInstance)
            // noinspection Convert2Diamond
            this.listInstance =
                new java.util.ArrayList<io.swagger.client.model.PhenotypesRequestObservation>();
        return this.listInstance;
    }

    private com.google.gson.Gson gson()
    {
        if (null == this.gsonInstance)
            this.gsonInstance = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
        return this.gsonInstance;
    }

    private org.wheatgenetics.javalib.mstrdtl.Items clear()
    { if (null != this.listInstance) this.listInstance.clear(); return this; }

    private java.lang.reflect.Type type()
    {
        if (null == this.typeInstance) this.typeInstance = new com.google.gson.reflect.TypeToken<
            org.wheatgenetics.brapi1_3.observations.pr.o.Observations>(){}.getType();
        return this.typeInstance;
    }
    // endregion

    // region Constructors
    /**
     * Called by second Observations(), org.wheatgenetics.brapi1_3.observations.pr
     * .PhenotypesRequestData.setObservationsAsItems(json), and ObservationsTest.
     */
    public Observations() { super(); }

    /**
     * Called by third Observations() and
     * org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.observations().
     */
    public Observations(final java.util.List<io.swagger.client.model.PhenotypesRequestObservation>
    phenotypesRequestObservations) { this(); this.append(phenotypesRequestObservations); }

    /** Called by third org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData(). */
    @java.lang.SuppressWarnings({"CopyConstructorMissesField"}) public Observations(
    final org.wheatgenetics.brapi1_3.observations.pr.o.Observations observations)
    { this(null == observations ? null : observations.listInstance); }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
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

    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (item instanceof org.wheatgenetics.brapi1_3.observations.pr.o.Observation)
        {
            final org.wheatgenetics.brapi1_3.observations.pr.o.Observation observation =
                (org.wheatgenetics.brapi1_3.observations.pr.o.Observation) item;
            if (observation.containersAreTheSame(this))
                { observation.setPosition(this.size()); this.list().add(observation); }
        }
    }

    @java.lang.Override public void append()
    { this.append(new org.wheatgenetics.brapi1_3.observations.pr.o.Observation(this)); }

    @java.lang.Override public int size()
    { return null == this.listInstance ? 0 : this.listInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.listInstance ? null :
            (org.wheatgenetics.brapi1_3.observations.pr.o.Observation)
                this.listInstance.get(nonNegativePosition);
    }

    @java.lang.Override public java.lang.String toJson() { return this.gson().toJson(this); }

    @java.lang.Override
    public org.wheatgenetics.javalib.mstrdtl.Items fromJson(final java.lang.String json)
    {
        if (null == json)
            return this.clear();
        else
        {
            final java.lang.String trimmedJson = json.trim();
            if (trimmedJson.length() <= 0)
                return this.clear();
            else
            {
                final org.wheatgenetics.brapi1_3.observations.pr.o.Observations observations =
                    this.gson().fromJson(trimmedJson, this.type());
                if (null == observations)
                    return this.clear();
                else
                    if (observations.size() <= 0)
                        return this.clear();
                    else
                        { this.clear(); return this.append(observations.listInstance); }
            }
        }
    }
    // endregion

    public java.util.List<io.swagger.client.model.PhenotypesRequestObservation> getList()
    { return this.listInstance; }
}