package org.wheatgenetics.brapi1_3.observations.pr;

/**
 * Uses:
 * io.swagger.client.model.PhenotypesRequest
 * io.swagger.client.model.PhenotypesRequestData
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData
 * org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container
 */
@java.lang.SuppressWarnings({"unused"})
public class PhenotypesRequest extends io.swagger.client.model.PhenotypesRequest
implements org.wheatgenetics.javalib.mstrdtl.Items,
org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container
{
    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
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

    // region org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
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
    // endregion
    // endregion
}