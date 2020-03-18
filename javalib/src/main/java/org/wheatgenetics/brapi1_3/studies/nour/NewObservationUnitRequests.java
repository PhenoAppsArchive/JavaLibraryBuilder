package org.wheatgenetics.brapi1_3.studies.nour;                 // nour: NewObservationUnitRequests

/**
 * Used:
 * com.google.gson.Gson
 * com.google.gson.GsonBuilder
 * com.google.gson.reflect.TypeToken
 *
 * io.swagger.client.model.NewObservationUnitRequest
 * io.swagger.client.model.ObservationUnit
 * io.swagger.client.model.ObservationUnitsResponse1
 * io.swagger.client.model.ObservationUnitsResponse1Result
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public class NewObservationUnitRequests extends java.lang.Object
implements org.wheatgenetics.javalib.mstrdtl.Items
{
    // region Fields
    private java.lang.String                                     operator = null, uploadedBy = null;
    private java.util.List<io.swagger.client.model.NewObservationUnitRequest>
        listInstance = null;                                                            // lazy load
    private transient com.google.gson.Gson   gsonInstance = null;                       // lazy load
    private transient java.lang.reflect.Type typeInstance = null;                       // lazy load
    // endregion

    // region Private Methods
    /** Convert the given object to string with each line indented by 4 spaces. */
    private static java.lang.String toIndentedString(final java.lang.Object o)
    { return null == o ? "null" : o.toString().replace("\n","\n    "); }

    private java.util.List<io.swagger.client.model.NewObservationUnitRequest> list()
    {
        if (null == this.listInstance)
            // noinspection Convert2Diamond
            this.listInstance =
                new java.util.ArrayList<io.swagger.client.model.NewObservationUnitRequest>();
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
            org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests>(){}.getType();
        return this.typeInstance;
    }
    // endregion

    // region Constructors
    /**
     * Called by
     * 1) androidlibrarybuilder org.wheatgenetics.androidlibrarybuilder.brapi1_3:
     *     a) Activity.newObservationUnitRequests(),
     *     b) studies.Fragment.setNewObservationUnitRequests(json),
     * 2) androidlibrary org.wheatgenetics.brapi1_3.studies.nour:
     *     a) NewObservationUnitRequestsListActivity.items(),
     *     b) NewObservationUnitRequestItemActivity.items(),
     * 3) second NewObservationUnitRequests(), and
     * 4) third NewObservationUnitRequests().
     */
    @java.lang.SuppressWarnings({"WeakerAccess"}) public NewObservationUnitRequests() { super(); }

    /** Called by fourth NewObservationUnitRequests() and NewObservationUnitRequestsTest. */
    NewObservationUnitRequests(final java.lang.String operator, final java.lang.String uploadedBy)
    { this(); this.operator = operator; this.uploadedBy = uploadedBy; }

    /**
     * Called by androidlibrarybuilder org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
     * .Fragment.observationUnitsResponse1Callback().
     */
    @java.lang.SuppressWarnings({"unused"}) public NewObservationUnitRequests(
    final io.swagger.client.model.ObservationUnitsResponse1 observationUnitsResponse1)
    {
        this();
        if (null != observationUnitsResponse1)
        {
            final io.swagger.client.model.ObservationUnitsResponse1Result result =
                observationUnitsResponse1.getResult();
            if (null != result)
            {
                final java.util.List<io.swagger.client.model.ObservationUnit> data =
                    result.getData();
                if (null != data) if (data.size() > 0)
                    for (final io.swagger.client.model.ObservationUnit observationUnit: data)
                        this.append(new
                            org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(
                                this, observationUnit));
            }
        }
    }

    /**
     * Called by androidlibrarybuilder org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
     * .Fragment.studiesStudyDbIdObservationunitsPut().
     */
    @java.lang.SuppressWarnings({"unused"}) public NewObservationUnitRequests(final
    org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests newObservationUnitRequests,
    final java.lang.String operator, final java.lang.String uploadedBy)
    {
        this(operator, uploadedBy);
        if (null != newObservationUnitRequests) if (newObservationUnitRequests.size() > 0)
            for (final io.swagger.client.model.NewObservationUnitRequest newObservationUnitRequest:
            newObservationUnitRequests.listInstance) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(
                    (org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest)
                        newObservationUnitRequest,
                    this.operator, this.uploadedBy));
    }
    // endregion

    // region Overridden Methods
    @java.lang.Override public java.lang.String toString()
    {
        @java.lang.SuppressWarnings({"StringBufferReplaceableByString"})
        final java.lang.StringBuilder stringBuilder =
            new java.lang.StringBuilder("class NewObservationUnitRequests {");

        stringBuilder.append("\n    list: ").append(
            org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests.toIndentedString(
                this.list()));
        stringBuilder.append("\n}");

        return stringBuilder.toString();
    }

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
        if (item instanceof org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest)
        {
            final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest
                newObservationUnitRequest =
                    (org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest) item;
            if (newObservationUnitRequest.containersAreTheSame(this))
            {
                newObservationUnitRequest.setPosition(this.size());
                this.list().add(newObservationUnitRequest);
            }
        }
    }

    @java.lang.Override public void append()
    {
        this.append(new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(
            this, this.operator, this.uploadedBy));
    }

    @java.lang.Override public int size()
    { return null == this.listInstance ? 0 : this.listInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        return null == this.listInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest)
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
                final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests
                    newObservationUnitRequests = this.gson().fromJson(trimmedJson, this.type());
                if (null == newObservationUnitRequests)
                    return this.clear();
                else
                {
                    this.operator   = newObservationUnitRequests.operator  ;
                    this.uploadedBy = newObservationUnitRequests.uploadedBy;

                    if (newObservationUnitRequests.size() <= 0)
                        return this.clear();
                    else
                    {
                        this.clear();

                        for (final io.swagger.client.model.NewObservationUnitRequest
                        newObservationUnitRequest: newObservationUnitRequests.listInstance)
                            this.append(new
                                org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(
                                    this, newObservationUnitRequest, this.operator,
                                    this.uploadedBy));

                        return this;
                    }
                }
            }
        }
    }
    // endregion
    // endregion

    @java.lang.SuppressWarnings({"unused"})
    public java.util.List<io.swagger.client.model.NewObservationUnitRequest> getList()
    { return this.listInstance; }
}