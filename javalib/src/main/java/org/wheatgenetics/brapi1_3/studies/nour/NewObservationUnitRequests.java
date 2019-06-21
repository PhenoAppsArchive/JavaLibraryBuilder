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
 *
 * org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject", "unused"})
public class NewObservationUnitRequests extends java.lang.Object
implements org.wheatgenetics.javalib.mstrdtl.Items
{
    private java.util.ArrayList<io.swagger.client.model.NewObservationUnitRequest>
        arrayListInstance = null;                                                       // lazy load

    private java.util.ArrayList<io.swagger.client.model.NewObservationUnitRequest>
    arrayList()
    {
        if (null == this.arrayListInstance)
            // noinspection Convert2Diamond
            this.arrayListInstance = new java.util.ArrayList<
                io.swagger.client.model.NewObservationUnitRequest>();
        return this.arrayListInstance;
    }

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
                {
                    int position = 0;
                    for (final io.swagger.client.model.ObservationUnit observationUnit: data)
                        this.arrayList().add(
                            new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(
                                position++, observationUnit));
                }
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
            newObservationUnitRequests.arrayListInstance)
                this.add( new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(
                    (org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest)
                        newObservationUnitRequest,
                    operator, uploadedBy));
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void add(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        this.arrayList().add(
            (org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest) item);
    }

    @java.lang.Override public void append()
    {
        this.add(
            new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest(this.size()));
    }

    @java.lang.Override public int size()
    { return null == this.arrayListInstance ? 0 : this.arrayListInstance.size(); }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        return null == this.arrayListInstance ? null :
            (org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest)
                this.arrayListInstance.get(position);
    }
    // endregion

    public java.util.List<io.swagger.client.model.NewObservationUnitRequest> list()
    { return this.arrayListInstance; }
}