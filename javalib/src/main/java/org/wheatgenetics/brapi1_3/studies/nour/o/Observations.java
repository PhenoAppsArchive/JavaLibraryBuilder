package org.wheatgenetics.brapi1_3.studies.nour.o;               // nour: NewObservationUnitRequests

/**
 * Uses:
 * io.swagger.client.model.Observation
 * io.swagger.client.model.ObservationSummary
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.studies.nour.o.Observation
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"}) public class Observations
extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items
{
    private java.util.List<io.swagger.client.model.Observation> listInstance = null;    // lazy load

    private java.util.List<io.swagger.client.model.Observation> list()
    {
        if (null == this.listInstance)
            // noinspection Convert2Diamond
            this.listInstance = new java.util.ArrayList<io.swagger.client.model.Observation>();
        return this.listInstance;
    }

    // region Constructors
    public Observations(
    final java.util.List<io.swagger.client.model.ObservationSummary> observationSummaries,
    final java.lang.String germplasmDbId      , final java.lang.String germplasmName      ,
    final java.lang.String observationLevel   , final java.lang.String observationUnitDbId,
    final java.lang.String observationUnitName, final java.lang.String studyDbId          )
    {
        super();
        if (null != observationSummaries) if (observationSummaries.size() > 0)
            for (final io.swagger.client.model.ObservationSummary observationSummary:
            observationSummaries) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.o.Observation(this,
                    observationSummary , germplasmDbId, germplasmName, observationLevel,
                    observationUnitDbId, observationUnitName         , studyDbId       ));
    }

    public Observations(final org.wheatgenetics.brapi1_3.studies.nour.o.Observations observations,
    final java.lang.String operator, final java.lang.String uploadedBy)
    {
        super();
        if (null != observations) if (observations.size() > 0)
            for (final io.swagger.client.model.Observation observation: observations.listInstance)
                this.append(new org.wheatgenetics.brapi1_3.studies.nour.o.Observation(
                    (org.wheatgenetics.brapi1_3.studies.nour.o.Observation) observation,
                    operator, uploadedBy                                               ));
    }

    public Observations(final java.util.List<io.swagger.client.model.Observation> observations)
    {
        super();
        if (null != observations) if (observations.size() > 0)
            for (final io.swagger.client.model.Observation observation: observations)
                this.append(new org.wheatgenetics.brapi1_3.studies.nour.o.Observation(
                    this, observation));
    }
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
        if (item instanceof org.wheatgenetics.brapi1_3.studies.nour.o.Observation)
        {
            final org.wheatgenetics.brapi1_3.studies.nour.o.Observation observation =
                (org.wheatgenetics.brapi1_3.studies.nour.o.Observation) item;
            if (observation.containersAreTheSame(this))
                { observation.setPosition(this.size()); this.list().add(observation); }
        }
    }

    @java.lang.Override public void append()
    { this.append(new org.wheatgenetics.brapi1_3.studies.nour.o.Observation(this)); }

    @java.lang.Override public int size()
    { return null == this.listInstance ? 0 : this.listInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.listInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.o.Observation)
                this.listInstance.get(nonNegativePosition);
    }
    // endregion

    public java.util.List<io.swagger.client.model.Observation> getList()
    { return this.listInstance; }
}