package org.wheatgenetics.brapi1_3.observations.pr;

/**
 * Uses:
 * io.swagger.client.model.PhenotypesRequest
 * io.swagger.client.model.PhenotypesRequestData
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData
 */
@java.lang.SuppressWarnings({"unused"}) public class PhenotypesRequest
extends io.swagger.client.model.PhenotypesRequest implements org.wheatgenetics.javalib.mstrdtl.Items
{
    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (null != item) item.setPosition(this.size());
        this.addDataItem((org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData) item);
    }

    @java.lang.Override public void append()
    { this.append(new org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData()); }

    @java.lang.Override public int size()
    {
        final java.util.List<io.swagger.client.model.PhenotypesRequestData> data = this.getData();
        return null == data ? 0 : data.size();
    }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IllegalArgumentException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        else
        {
            final java.util.List<io.swagger.client.model.PhenotypesRequestData> data =
                this.getData();
            return null == data ? null :
                (org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData)
                    data.get(position);
        }
    }
    // endregion
}