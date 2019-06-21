package org.wheatgenetics.brapi1_3.studies.nour;                 // nour: NewObservationUnitRequests

/**
 * Uses:
 * io.swagger.client.model.Observation
 * io.swagger.client.model.ObservationSummary
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.brapi1_3.studies.nour.Observation
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
class Observations extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items
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
    Observations(
    final java.util.List<io.swagger.client.model.ObservationSummary> observationSummaries,
    final java.lang.String germplasmDbId      , final java.lang.String germplasmName      ,
    final java.lang.String observationLevel   , final java.lang.String observationUnitDbId,
    final java.lang.String observationUnitName, final java.lang.String studyDbId          )
    {
        super();

        if (null != observationSummaries) if (observationSummaries.size() > 0)
        {
            int position = 0;
            for (final io.swagger.client.model.ObservationSummary observationSummary:
            observationSummaries)
                this.arrayList().add(new org.wheatgenetics.brapi1_3.studies.nour.Observation(
                    position++      , observationSummary , germplasmDbId      , germplasmName,
                    observationLevel, observationUnitDbId, observationUnitName, studyDbId    ));
        }
    }

    Observations(final org.wheatgenetics.brapi1_3.studies.nour.Observations observations,
    final java.lang.String operator, final java.lang.String uploadedBy)
    {
        super();

        if (null != observations) if (observations.size() > 0)
            for (final io.swagger.client.model.Observation observation:
            observations.arrayListInstance)
                this.arrayList().add(new org.wheatgenetics.brapi1_3.studies.nour.Observation(
                    (org.wheatgenetics.brapi1_3.studies.nour.Observation) observation,
                    operator, uploadedBy                                             ));
    }

    Observations(final java.util.List<io.swagger.client.model.Observation> observations)
    {
        super();

        if (null != observations) if (observations.size() > 0)
        {
            int position = 0;
            for (final io.swagger.client.model.Observation observation: observations)
                this.arrayList().add(new org.wheatgenetics.brapi1_3.studies.nour.Observation(
                    position++, observation));
        }
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void add(final org.wheatgenetics.javalib.mstrdtl.Item item)
    { this.arrayList().add((org.wheatgenetics.brapi1_3.studies.nour.Observation) item); }

    @java.lang.Override public void append()
    { this.add(new org.wheatgenetics.brapi1_3.studies.nour.Observation(this.size())); }

    @java.lang.Override public int size()
    { return null == this.arrayListInstance ? 0 : this.arrayListInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        return null == this.arrayListInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.Observation)
                this.arrayListInstance.get(position);
    }
    // endregion

    java.util.List<io.swagger.client.model.Observation> list() { return this.arrayListInstance; }
}