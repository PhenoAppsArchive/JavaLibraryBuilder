package org.wheatgenetics.brapi1_3.studies.slr;                           // slr: StudyLayoutRequest

/**
 * Uses:
 * io.swagger.client.model.ObservationUnitPosition
 * io.swagger.client.model.ObservationUnitPositionsResponse
 * io.swagger.client.model.ObservationUnitPositionsResponseResult
 * io.swagger.client.model.StudyLayoutRequest
 * io.swagger.client.model.StudyLayoutRequestLayout
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout
 */
@java.lang.SuppressWarnings({"unused"})
public class StudyLayoutRequest extends io.swagger.client.model.StudyLayoutRequest
implements org.wheatgenetics.javalib.mstrdtl.Items
{
    public StudyLayoutRequest(
    final io.swagger.client.model.ObservationUnitPositionsResponse observationUnitPositionsResponse)
    {
        super();

        if (null != observationUnitPositionsResponse)
        {
            final io.swagger.client.model.ObservationUnitPositionsResponseResult result =
                observationUnitPositionsResponse.getResult();
            if (null != result)
            {
                final java.util.List<io.swagger.client.model.ObservationUnitPosition> data =
                    result.getData();
                if (null != data) if (data.size() > 0)
                    for (final io.swagger.client.model.ObservationUnitPosition
                    observationUnitPosition: data)
                        this.addLayoutItem(
                            new org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout(
                                observationUnitPosition));
            }
        }
    }

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (null != item) item.setPosition(this.size());
        this.addLayoutItem((org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout) item);
    }

    @java.lang.Override public void append()
    { this.append(new org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout()); }

    @java.lang.Override public int size()
    {
        final java.util.List<io.swagger.client.model.StudyLayoutRequestLayout> layout =
            this.getLayout();
        return null == layout ? 0 : layout.size();
    }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IllegalArgumentException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        else
        {
            final java.util.List<io.swagger.client.model.StudyLayoutRequestLayout> layout =
                this.getLayout();
            return null == layout ? null :
                (org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout)
                    layout.get(position);
        }
    }
    // endregion
}