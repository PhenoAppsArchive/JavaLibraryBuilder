package org.wheatgenetics.brapi1_3.observations.pr;

/**
 * Uses:
 * com.google.gson.Gson
 * com.google.gson.GsonBuilder
 * com.google.gson.reflect.TypeToken
 *
 * io.swagger.client.model.PhenotypesRequest
 * io.swagger.client.model.PhenotypesRequestData
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData
 */
@java.lang.SuppressWarnings({"unused"})
public class PhenotypesRequest extends io.swagger.client.model.PhenotypesRequest
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
            final java.util.List<io.swagger.client.model.PhenotypesRequestData> data =
                this.getData();
            if (null != data) data.clear();
        }
        return this;
    }

    private java.lang.reflect.Type type()
    {
        if (null == this.typeInstance) this.typeInstance = new com.google.gson.reflect.TypeToken<
            org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequest>(){}.getType();
        return this.typeInstance;
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public boolean canMoveDown(final int position)
    { return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()); }

    @java.lang.Override public void moveUp(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.getData(), position,position - 1);
    }

    @java.lang.Override public void moveDown(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.getData(), position,position + 1);
    }

    @java.lang.Override public void delete(final int position)
    { org.wheatgenetics.javalib.mstrdtl.Utils.delete(this.getData(), position); }

    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (item instanceof org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData)
        {
            final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData
                phenotypesRequestData =
                    (org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData) item;
            if (phenotypesRequestData.containersAreTheSame(this))
            {
                phenotypesRequestData.setPosition(this.size());
                this.addDataItem(phenotypesRequestData);
            }
        }
    }

    @java.lang.Override public void append()
    {
        this.append(
            new org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData(this));
    }

    @java.lang.Override public int size()
    {
        final java.util.List<io.swagger.client.model.PhenotypesRequestData> data = this.getData();
        return null == data ? 0 : data.size();
    }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        final java.util.List<io.swagger.client.model.PhenotypesRequestData> data = this.getData();
        return null == data ? null :
            (org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData)
                data.get(nonNegativePosition);
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
                final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequest
                    phenotypesRequest = this.gson().fromJson(trimmedJson, this.type());
                if (null == phenotypesRequest)
                    return this.clear();
                else
                    if (phenotypesRequest.size() <= 0)
                        return this.clear();
                    else
                    {
                        this.clear();

                        for (final io.swagger.client.model.PhenotypesRequestData
                        phenotypesRequestData: phenotypesRequest.getData()) this.append(
                            new org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData(
                                this, phenotypesRequestData));

                        return this;
                    }
            }
        }
    }
    // endregion
}