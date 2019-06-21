package org.wheatgenetics.brapi1_3.studies.nor;                       // nor: NewObservationsRequest

/**
 * Uses:
 * io.swagger.client.model.NewObservationsRequest
 * io.swagger.client.model.NewObservationsRequestObservations
 * io.swagger.client.model.Observation
 * io.swagger.client.model.ObservationsResponse
 * io.swagger.client.model.ObservationsResponseResult
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations
 */
@java.lang.SuppressWarnings({"unused"})
public class NewObservationsRequest extends io.swagger.client.model.NewObservationsRequest
implements org.wheatgenetics.javalib.mstrdtl.Items
{
    public NewObservationsRequest(
    final io.swagger.client.model.ObservationsResponse observationsResponse)
    {
        super();

        if (null != observationsResponse)
        {
            final io.swagger.client.model.ObservationsResponseResult result =
                observationsResponse.getResult();
            if (null != result)
            {
                final java.util.List<io.swagger.client.model.Observation> data = result.getData();
                if (null != data) if (data.size() > 0)
                {
                    int position = 0;
                    for (final io.swagger.client.model.Observation observation : data)
                        this.addObservationsItem(new org.wheatgenetics.brapi1_3.studies.nor
                            .NewObservationsRequestObservations(position++, observation));
                }
            }
        }
    }

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void add(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        this.addObservationsItem(
            (org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations) item);
    }

    @java.lang.Override public void append()
    {
        this.add(new
            org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations(this.size()));
    }

    @java.lang.Override public int size()
    {
        final java.util.List<io.swagger.client.model.NewObservationsRequestObservations>
            observations = this.getObservations();
        return null == observations ? 0 : observations.size();
    }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final java.util.List<io.swagger.client.model.NewObservationsRequestObservations>
            observations = this.getObservations();
        return null == observations ? null :
            (org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestObservations)
                observations.get(position);
    }
    // endregion
}