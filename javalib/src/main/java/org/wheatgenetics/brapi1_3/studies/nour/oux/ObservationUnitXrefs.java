package org.wheatgenetics.brapi1_3.studies.nour.oux;             // nour: NewObservationUnitRequests

/**
 * Uses:
 * com.google.gson.Gson
 * com.google.gson.GsonBuilder
 * com.google.gson.reflect.TypeToken
 *
 * io.swagger.client.model.ObservationUnitXref
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"}) public class ObservationUnitXrefs
extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items
{
    // region Fields
    private java.util.List<io.swagger.client.model.ObservationUnitXref> listInstance = null;   // ll
    private transient com.google.gson.Gson                              gsonInstance = null;   // ll
    private transient java.lang.reflect.Type                            typeInstance = null;   // ll
    // endregion

    // region Private Methods
    private org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs append(
    final java.util.List<io.swagger.client.model.ObservationUnitXref> observationUnitXrefs)
    {
        if (null != observationUnitXrefs) if (observationUnitXrefs.size() > 0)
            for (final io.swagger.client.model.ObservationUnitXref observationUnitXref:
            observationUnitXrefs) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref(
                    this, observationUnitXref));
        return this;
    }

    private java.util.List<io.swagger.client.model.ObservationUnitXref> list()
    {
        if (null == this.listInstance)
            // noinspection Convert2Diamond
            this.listInstance =
                new java.util.ArrayList<io.swagger.client.model.ObservationUnitXref>();
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
            org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs>(){}.getType();
        return this.typeInstance;
    }
    // endregion

    // region Constructors
    /**
     * Called by
     * 1) androidlibrary org.wheatgenetics.brapi1_3.studies.nour.oux:
     *    a) ObservationUnitXrefItemActivity.items(),
     *    b) ObservationUnitXrefListActivity.items(),
     * 2) org.wheatgenetics.brapi1_3.studies.nour.newObservationUnitRequest
     *    .setObservationUnitXrefsAsItems(),
     * 3) second ObservationUnitXrefs(),
     * 4) third ObservationUnitXrefs(),
     * 5) ObservationUnitXrefsTest, and
     * 6) NewObservationUnitRequestTest.
     */
    public ObservationUnitXrefs() { super(); }

    /**
     * Called by
     * 1) org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest:
     *    a) second assign(),
     *    b) third assign(), and
     * 2) org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.observationUnitXref().
     */
    public ObservationUnitXrefs(
    final java.util.List<io.swagger.client.model.ObservationUnitXref> observationUnitXrefs)
    { this(); this.append(observationUnitXrefs); }

    /**
     * Called by third org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.assign().
     */
    @java.lang.SuppressWarnings({"CopyConstructorMissesField"}) public ObservationUnitXrefs(
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs observationUnitXrefs)
    {
        this();
        if (null != observationUnitXrefs) if (observationUnitXrefs.size() > 0)
            for (final io.swagger.client.model.ObservationUnitXref observationUnitXref:
            observationUnitXrefs.listInstance) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref(this,
                    (org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref)
                        observationUnitXref));
    }
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
        if (item instanceof org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref)
        {
            final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref
                observationUnitXref =
                    (org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref) item;
            if (observationUnitXref.containersAreTheSame(this))
            {
                observationUnitXref.setPosition(this.size());
                this.list().add(observationUnitXref);
            }
        }
    }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override public void append()
    {
        this.append(
            new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref(this));
    }

    @java.lang.Override public int size()
    { return null == this.listInstance ? 0 : this.listInstance.size(); }

    @java.lang.SuppressWarnings({"unused"}) @java.lang.Override
    public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.listInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXref)
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
                final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs
                    observationUnitXrefs = this.gson().fromJson(trimmedJson, this.type());
                if (null == observationUnitXrefs)
                    return this.clear();
                else
                    if (observationUnitXrefs.size() <= 0)
                        return this.clear();
                    else
                        { this.clear(); return this.append(observationUnitXrefs.listInstance); }
            }
        }
    }
    // endregion

    public java.util.List<io.swagger.client.model.ObservationUnitXref> getList()
    { return this.listInstance; }
}