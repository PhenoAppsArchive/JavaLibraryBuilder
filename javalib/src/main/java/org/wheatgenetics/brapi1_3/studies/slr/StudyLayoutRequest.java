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
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout
 * org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout.Container
 */
@java.lang.SuppressWarnings({"unused"})
public class StudyLayoutRequest extends io.swagger.client.model.StudyLayoutRequest
implements org.wheatgenetics.javalib.mstrdtl.Items,
org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout.Container
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
                                this, observationUnitPosition));
            }
        }
    }

    // region Overridden Methods
    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public void append(final org.wheatgenetics.javalib.mstrdtl.Item item)
    {
        if (item instanceof org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout)
        {
            final org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout
                studyLayoutRequestLayout =
                    (org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout) item;
            if (studyLayoutRequestLayout.containersAreTheSame(this))
            {
                studyLayoutRequestLayout.setPosition(this.size());
                this.addLayoutItem(studyLayoutRequestLayout);
            }
        }
    }

    @java.lang.Override public void append()
    {
        this.append(
            new org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout(this));
    }

    @java.lang.Override public int size()
    {
        final java.util.List<io.swagger.client.model.StudyLayoutRequestLayout> layout =
            this.getLayout();
        return null == layout ? 0 : layout.size();
    }

    @java.lang.Override public org.wheatgenetics.javalib.mstrdtl.Item get(final int position)
    {
        final int nonNegativePosition =
            org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position);
        final java.util.List<io.swagger.client.model.StudyLayoutRequestLayout> layout =
            this.getLayout();
        return null == layout ? null :
            (org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout)
                layout.get(nonNegativePosition);
    }
    // endregion

    // region org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout.Container Overridden Method
    @java.lang.Override public boolean canMoveDown(final int position)
    { return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()); }
    // endregion
    // endregion
}