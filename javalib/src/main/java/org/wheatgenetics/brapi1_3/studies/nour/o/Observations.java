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
 * org.wheatgenetics.brapi1_3.studies.nour.o.Observation.Container
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"}) public class Observations
extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items,
org.wheatgenetics.brapi1_3.studies.nour.o.Observation.Container
{
    private java.util.ArrayList<io.swagger.client.model.Observation> arrayListInstance = null; // ll

    private java.util.ArrayList<io.swagger.client.model.Observation> arrayList()
    {
        if (null == this.arrayListInstance)
            // noinspection Convert2Diamond
            this.arrayListInstance = new java.util.ArrayList<io.swagger.client.model.Observation>();
        return this.arrayListInstance;
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
            observationSummaries)
                this.append(new org.wheatgenetics.brapi1_3.studies.nour.o.Observation(this,
                    observationSummary , germplasmDbId, germplasmName, observationLevel,
                    observationUnitDbId, observationUnitName         , studyDbId       ));
    }

    public Observations(final org.wheatgenetics.brapi1_3.studies.nour.o.Observations observations,
    final java.lang.String operator, final java.lang.String uploadedBy)
    {
        super();
        if (null != observations) if (observations.size() > 0)
            for (final io.swagger.client.model.Observation observation:
            observations.arrayListInstance)
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

    // region Overridden Methods
    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (item instanceof org.wheatgenetics.brapi1_3.studies.nour.o.Observation)
        {
            final org.wheatgenetics.brapi1_3.studies.nour.o.Observation observation =
                (org.wheatgenetics.brapi1_3.studies.nour.o.Observation) item;
            if (observation.containersAreTheSame(this))
            {
                observation.setPosition(this.size());
                this.arrayList().add(observation);
            }
        }
    }

    @java.lang.Override public void append()
    { this.append(new org.wheatgenetics.brapi1_3.studies.nour.o.Observation(this)); }

    @java.lang.Override public int size()
    { return null == this.arrayListInstance ? 0 : this.arrayListInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.arrayListInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.o.Observation)
                this.arrayListInstance.get(nonNegativePosition);
    }
    // endregion

    // region org.wheatgenetics.brapi1_3.studies.nour.o.Observation.Container Overridden Method
    @java.lang.Override public boolean canMoveDown(final int position)
    { return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()); }
    // endregion
    // endregion

    public java.util.List<io.swagger.client.model.Observation> list()
    { return this.arrayListInstance; }
}