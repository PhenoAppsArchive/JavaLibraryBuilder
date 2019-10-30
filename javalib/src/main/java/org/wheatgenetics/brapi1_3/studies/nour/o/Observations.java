package org.wheatgenetics.brapi1_3.studies.nour.o;               // nour: NewObservationUnitRequests

/**
 * Uses:
 * com.google.gson.Gson
 * com.google.gson.GsonBuilder
 * com.google.gson.reflect.TypeToken
 *
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
    // region Fields
    private           java.lang.String                                    operator, uploadedBy;
    private           java.util.List<io.swagger.client.model.Observation> listInstance = null; // ll
    private transient com.google.gson.Gson                                gsonInstance = null; // ll
    private transient java.lang.reflect.Type                              typeInstance = null; // ll
    // endregion

    // region Private Methods
    private org.wheatgenetics.brapi1_3.studies.nour.o.Observations append(
    final java.util.List<io.swagger.client.model.Observation> observations)
    {
        if (null != observations) if (observations.size() > 0)
            for (final io.swagger.client.model.Observation observation: observations)
                this.append(new org.wheatgenetics.brapi1_3.studies.nour.o.Observation(
                    this, observation, this.operator, this.uploadedBy));
        return this;
    }

    private java.util.List<io.swagger.client.model.Observation> list()
    {
        if (null == this.listInstance)
            // noinspection Convert2Diamond
            this.listInstance = new java.util.ArrayList<io.swagger.client.model.Observation>();
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
            org.wheatgenetics.brapi1_3.studies.nour.o.Observations>(){}.getType();
        return this.typeInstance;
    }
    // endregion

    // region Constructors
    /**
     * Called by
     * 1) androidlibrary org.wheatgenetics.brapi1_3.studies.nour.o:
     *    a) ObservationItemActivity.items(),
     *    b) ObservationsListActivity.items(),
     * 2) org.wheatgenetics.brapi1_3.studies.nour.newObservationUnitRequest
     *    .setObservationsAsItems(), and
     * 3) second Observations(), and
     * 4) NewObservationUnitRequestTest.
     */
    public Observations() { super(); }

    /**
     * Called by third Observations(), fourth Observations(), fifth Observations(), and
     * ObservationsTest.
     */
    Observations(final java.lang.String operator, final java.lang.String uploadedBy)
    { this(); this.operator = operator; this.uploadedBy = uploadedBy; }

    /**
     * Called by second org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.assign().
     */
    public Observations(
    final java.util.List<io.swagger.client.model.ObservationSummary> observationSummaries,
    final java.lang.String germplasmDbId      , final java.lang.String germplasmName      ,
    final java.lang.String observationLevel   , final java.lang.String observationUnitDbId,
    final java.lang.String observationUnitName, final java.lang.String studyDbId          ,
    final java.lang.String operator           , final java.lang.String uploadedBy         )
    {
        this(operator, uploadedBy);
        if (null != observationSummaries) if (observationSummaries.size() > 0)
            for (final io.swagger.client.model.ObservationSummary observationSummary:
            observationSummaries) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.o.Observation(this,
                    observationSummary , germplasmDbId      , germplasmName, observationLevel,
                    observationUnitDbId, observationUnitName, studyDbId    , this.operator   ,
                    this.uploadedBy                                                          ));
    }

    /**
     * Called by third org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.assign().
     */
    public Observations(final org.wheatgenetics.brapi1_3.studies.nour.o.Observations observations,
    final java.lang.String operator, final java.lang.String uploadedBy)
    {
        this(operator, uploadedBy); if (null != observations) if (observations.size() > 0)
            for (final io.swagger.client.model.Observation observation: observations.listInstance)
                this.append(new org.wheatgenetics.brapi1_3.studies.nour.o.Observation(this,
                    (org.wheatgenetics.brapi1_3.studies.nour.o.Observation) observation,
                    this.operator, this.uploadedBy                                     ));
    }

    /**
     * Called by
     * 1) fourth org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.assign() and
     * 2) org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.observations().
     */
    public Observations(final java.util.List<io.swagger.client.model.Observation> observations,
    final java.lang.String operator, final java.lang.String uploadedBy)
    { this(operator, uploadedBy); this.append(observations); }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override
    public boolean canMoveDown(final int position)
    { return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()); }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override
    public void moveUp(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.listInstance, position,position - 1);
    }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override
    public void moveDown(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.listInstance, position,position + 1);
    }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override
    public void delete(final int position)
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

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override public void append()
    {
        this.append(new org.wheatgenetics.brapi1_3.studies.nour.o.Observation(
            this, this.operator, this.uploadedBy));
    }

    @java.lang.Override public int size()
    { return null == this.listInstance ? 0 : this.listInstance.size(); }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override
    public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.listInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.o.Observation)
                this.listInstance.get(nonNegativePosition);
    }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override public java.lang.String toJson()
    { return this.gson().toJson(this); }

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
                final org.wheatgenetics.brapi1_3.studies.nour.o.Observations observations =
                    this.gson().fromJson(trimmedJson, this.type());
                if (null == observations)
                    return this.clear();
                else
                {
                    this.operator   = observations.operator  ;
                    this.uploadedBy = observations.uploadedBy;

                    if (observations.size() <= 0)
                        return this.clear();
                    else
                        { this.clear(); return this.append(observations.listInstance); }
                }
            }
        }
    }
    // endregion

    public java.util.List<io.swagger.client.model.Observation> getList()
    { return this.listInstance; }
}