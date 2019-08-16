package org.wheatgenetics.brapi1_3.studies.nour;                 // nour: NewObservationUnitRequests

/**
 * Used:
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
 * org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.Container
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject", "unused"})
public class NewObservationUnitRequests extends java.lang.Object
implements org.wheatgenetics.javalib.mstrdtl.Items,
org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.Container
{
    private java.util.List<io.swagger.client.model.NewObservationUnitRequest>
        listInstance = null;                                                            // lazy load

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
    // endregion

    // region Constructors
    public NewObservationUnitRequests(
    final io.swagger.client.model.ObservationUnitsResponse1 observationUnitsResponse1)
    {
        super();
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

    public NewObservationUnitRequests(final
    org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests newObservationUnitRequests,
    final java.lang.String operator, final java.lang.String uploadedBy)
    {
        super();

        if (null != newObservationUnitRequests) if (newObservationUnitRequests.size() > 0)
            for (final io.swagger.client.model.NewObservationUnitRequest newObservationUnitRequest:
            newObservationUnitRequests.listInstance) this.append(
                new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(
                    (org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest)
                        newObservationUnitRequest,
                    operator, uploadedBy));
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
        this.append(
            new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(this));
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

    // region org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.Container org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
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
    // endregion
    // endregion
    // endregion

    public java.util.List<io.swagger.client.model.NewObservationUnitRequest> getList()
    { return this.listInstance; }
}