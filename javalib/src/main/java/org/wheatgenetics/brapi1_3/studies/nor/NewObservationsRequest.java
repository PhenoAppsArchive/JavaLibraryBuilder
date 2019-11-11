package org.wheatgenetics.brapi1_3.studies.nor;                       // nor: NewObservationsRequest

/**
 * Uses:
 * com.google.gson.Gson
 * com.google.gson.GsonBuilder
 * com.google.gson.reflect.TypeToken
 *
 * io.swagger.client.model.NewObservationsRequest
 * io.swagger.client.model.NewObservationsRequestObservations
 * io.swagger.client.model.Observation
 * io.swagger.client.model.ObservationsResponse
 * io.swagger.client.model.ObservationsResponseResult
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations
 */
public class NewObservationsRequest extends io.swagger.client.model.NewObservationsRequest
implements org.wheatgenetics.javalib.mstrdtl.Items
{
    // region Fields
    private transient com.google.gson.Gson   gsonInstance = null;                       // lazy load
    private transient java.lang.reflect.Type typeInstance = null;                       // lazy load
    // endregion

    // region Private Methods
    private com.google.gson.Gson gson()
    {
        if (null == this.gsonInstance)
            this.gsonInstance = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
        return this.gsonInstance;
    }

    private org.wheatgenetics.javalib.mstrdtl.Items clear()
    {
        {
            final java.util.List<io.swagger.client.model.NewObservationsRequestObservations>
                observations = this.getObservations();
            if (null != observations) observations.clear();
        }
        return this;
    }

    private java.lang.reflect.Type type()
    {
        if (null == this.typeInstance) this.typeInstance = new com.google.gson.reflect.TypeToken<
            org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest>(){}.getType();
        return this.typeInstance;
    }
    // endregion

    // region Constructors
    /**
     * Called by
     * 1) androidlibrarybuilder org.wheatgenetics.androidlibrarybuilder.brapi1_3:
     *     a) Activity.newObservationsRequest(),
     *     b) studies.Fragment.setNewObservationsRequest(json),
     * 2) androidlibrary org.wheatgenetics.brapi1_3.studies.nor:
     *     a) NewObservationsRequestListActivity.items(),
     *     b) NewObservationsRequestObservationsItemActivity.items(),
     * 3) second NewObservationsRequest(), and
     * 4) NewObservationsRequestTest.
     */
    @java.lang.SuppressWarnings({"WeakerAccess"}) public NewObservationsRequest() { super(); }

    /**
     * Called by androidlibrarybuilder org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
     * .Fragment.observationsResponseCallback().
     */
    @java.lang.SuppressWarnings({"unused"}) public NewObservationsRequest(
    final io.swagger.client.model.ObservationsResponse observationsResponse)
    {
        this();
        if (null != observationsResponse)
        {
            final io.swagger.client.model.ObservationsResponseResult result =
                observationsResponse.getResult();
            if (null != result)
            {
                final java.util.List<io.swagger.client.model.Observation> data = result.getData();
                if (null != data) if (data.size() > 0)
                    for (final io.swagger.client.model.Observation observation: data)
                        this.append(new org.wheatgenetics.brapi1_3.studies.nor
                            .NewObservationsRequestObservations(this, observation));
            }
        }
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public boolean canMoveDown(final int position)
    { return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()); }

    @java.lang.Override public void moveUp(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.getObservations(), position,position - 1);
    }

    @java.lang.Override public void moveDown(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.getObservations(), position,position + 1);
    }

    @java.lang.Override public void delete(final int position)
    { org.wheatgenetics.javalib.mstrdtl.Utils.delete(this.getObservations(), position); }

    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (item instanceof
        org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations)
        {
            final org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations
                newObservationsRequestObservations =
                    (org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations)
                        item;
            if (newObservationsRequestObservations.containersAreTheSame(this))
            {
                newObservationsRequestObservations.setPosition(this.size());
                this.addObservationsItem(newObservationsRequestObservations);
            }
        }
    }

    @java.lang.Override public void append()
    {
        this.append(
            new org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations(
                this));
    }

    @java.lang.Override public int size()
    {
        final java.util.List<io.swagger.client.model.NewObservationsRequestObservations>
            observations = this.getObservations();
        return null == observations ? 0 : observations.size();
    }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        final java.util.List<io.swagger.client.model.NewObservationsRequestObservations>
            observations = this.getObservations();
        return null == observations ? null :
            (org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations)
                observations.get(nonNegativePosition);
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
                final org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest
                    newObservationsRequest = this.gson().fromJson(trimmedJson, this.type());
                if (null == newObservationsRequest)
                    return this.clear();
                else
                    if (newObservationsRequest.size() <= 0)
                        return this.clear();
                    else
                    {
                        this.clear();

                        for (final io.swagger.client.model.NewObservationsRequestObservations
                        newObservationsRequestObservations:
                        newObservationsRequest.getObservations()) this.append(new org.wheatgenetics
                            .brapi1_3.studies.nor.NewObservationsRequestObservations(
                                this, newObservationsRequestObservations));

                        return this;
                    }
            }
        }
    }
    // endregion
}