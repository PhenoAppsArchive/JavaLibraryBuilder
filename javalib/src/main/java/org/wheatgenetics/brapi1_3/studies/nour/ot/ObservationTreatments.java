package org.wheatgenetics.brapi1_3.studies.nour.ot;              // nour: NewObservationUnitRequests

/**
 * Uses:
 * com.google.gson.Gson
 * com.google.gson.GsonBuilder
 * com.google.gson.reflect.TypeToken
 *
 * io.swagger.client.model.ObservationTreatment
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"}) public class ObservationTreatments
extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items
{
    // region Fields
    private java.util.List<io.swagger.client.model.ObservationTreatment> listInstance = null;  // ll
    private transient com.google.gson.Gson                               gsonInstance = null;  // ll
    private transient java.lang.reflect.Type                             typeInstance = null;  // ll
    // endregion

    // region Private Methods
    private org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments append(
    final java.util.List<io.swagger.client.model.ObservationTreatment> observationTreatments)
    {
        if (null != observationTreatments) if (observationTreatments.size() > 0)
            for (final io.swagger.client.model.ObservationTreatment observationTreatment:
            observationTreatments) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment(
                    this, observationTreatment));
        return this;
    }

    private java.util.List<io.swagger.client.model.ObservationTreatment> list()
    {
        if (null == this.listInstance)
            // noinspection Convert2Diamond
            this.listInstance =
                new java.util.ArrayList<io.swagger.client.model.ObservationTreatment>();
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
            org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments>(){}.getType();
        return this.typeInstance;
    }
    // endregion

    // region Constructors
    /**
     * Called by
     * 1) androidlibrary org.wheatgenetics.brapi1_3.studies.nour.ot:
     *    a) ObservationTreatmentItemActivity.items(),
     *    b) ObservationTreatmentsListActivity.items(),
     * 2) org.wheatgenetics.brapi1_3.studies.nour.newObservationUnitRequest
     *    .setObservationTreatmentsAsItems(),
     * 3) second ObservationTreatments(),
     * 4) third  ObservationTreatments(), and
     * 5) ObservationTreatmentsTest, and
     * 6) NewObservationUnitRequestTest.
     */
    public ObservationTreatments() { super(); }

    /**
     * Called by
     * 1) org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest:
     *    a) second assign(),
     *    b) fourth assign(), and
     * 2) org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.treatments().
     */
    public ObservationTreatments(
    final java.util.List<io.swagger.client.model.ObservationTreatment> observationTreatments)
    { this(); this.append(observationTreatments); }

    /**
     * Called by third org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.assign().
     */
    @java.lang.SuppressWarnings({"CopyConstructorMissesField"}) public ObservationTreatments(
    final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments observationTreatments)
    {
        this();
        if (null != observationTreatments) if (observationTreatments.size() > 0)
            for (final io.swagger.client.model.ObservationTreatment observationTreatment:
            observationTreatments.listInstance) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment(this,
                    (org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment)
                        observationTreatment));
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
        if (item instanceof org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment)
        {
            final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment
                observationTreatment =
                    (org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment) item;
            if (observationTreatment.containersAreTheSame(this))
            {
                observationTreatment.setPosition(this.size());
                this.list().add(observationTreatment);
            }
        }
    }

    @java.lang.Override public void append()
    {
        this.append(
            new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment(this));
    }

    @java.lang.Override public int size()
    { return null == this.listInstance ? 0 : this.listInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.listInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatment)
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
                final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments
                    observationTreatments = this.gson().fromJson(trimmedJson, this.type());
                if (null == observationTreatments)
                    return this.clear();
                else
                    if (observationTreatments.size() <= 0)
                        return this.clear();
                    else
                        { this.clear(); return this.append(observationTreatments.listInstance); }
            }
        }
    }
    // endregion

    public java.util.List<io.swagger.client.model.ObservationTreatment> getList()
    { return this.listInstance; }
}