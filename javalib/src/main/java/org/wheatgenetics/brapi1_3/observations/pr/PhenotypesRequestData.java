package org.wheatgenetics.brapi1_3.observations.pr;

/**
 * Uses:
 * io.swagger.client.model.PhenotypesRequestData
 * io.swagger.client.model.PhenotypesRequestObservation
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.observations.pr.o.Observations
 */
public class PhenotypesRequestData extends io.swagger.client.model.PhenotypesRequestData
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    // region Fields
    private transient org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container
        container;
    private int position;

    private transient org.wheatgenetics.brapi1_3.observations.pr.o.Observations
        observationsAsItems = null;                                                     // lazy load
    // endregion

    // region Private Methods
    private void setObservationsAsItems(
    final org.wheatgenetics.brapi1_3.observations.pr.o.Observations observationsAsItems)
    { this.observationsAsItems = observationsAsItems; super.observations(this.getObservations()); }

    private boolean setObservationsAsItemsIfNull(
    final org.wheatgenetics.brapi1_3.observations.pr.o.Observations observationsAsItems)
    {
        final boolean observationsAsItemsWasNull = null == this.observationsAsItems;
        if (observationsAsItemsWasNull) this.setObservationsAsItems(observationsAsItems);
        return !observationsAsItemsWasNull;
    }
    // endregion

    // region Constructors
    /**
     * Called by second PhenotypesRequestData(),
     * org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequest.append(), and
     * PhenotypesRequestTest.
     */
    PhenotypesRequestData(
    final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container container)
    { super(); this.setContainer(container); }

    /** Called by org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequest.fromJson(). */
    PhenotypesRequestData(
    final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container container,
    final io.swagger.client.model.PhenotypesRequestData                  phenotypesRequestData)
    {
        this(container);
        if (null != phenotypesRequestData) this
            .observatioUnitDbId(phenotypesRequestData.getObservatioUnitDbId())
            .observations      (phenotypesRequestData.getObservations      ())
            .studyDbId         (phenotypesRequestData.getStudyDbId         ());
    }
    // endregion

    // region Overridden Methods
    @java.lang.Override public io.swagger.client.model.PhenotypesRequestData observations(
    final java.util.List<io.swagger.client.model.PhenotypesRequestObservation> observations)
    {
        if (null == observations)
            this.setObservationsAsItems(null);
        else
            if (this.setObservationsAsItemsIfNull(
            new org.wheatgenetics.brapi1_3.observations.pr.o.Observations(observations)))
                throw new java.lang.UnsupportedOperationException(
                    "this.observationsAsItems already initialized");
        return this;
    }

    @java.lang.Override
    public java.util.List<io.swagger.client.model.PhenotypesRequestObservation> getObservations()
    { return null == this.observationsAsItems ? null : this.observationsAsItems.getList(); }

    @java.lang.Override public void setObservations(
    final java.util.List<io.swagger.client.model.PhenotypesRequestObservation> observations)
    { this.observations(observations); }

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public void setContainer(
    final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container container)
    { this.container = container; }

    @java.lang.Override public int getPosition() { return this.position; }

    @java.lang.Override public void setPosition(final int position)
    { this.position = org.wheatgenetics.javalib.mstrdtl.Utils.nonNegativePosition(position); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }

    @java.lang.Override public java.lang.String getTitle() { return this.getObservatioUnitDbId(); }
    @java.lang.Override public java.lang.String getContent() { return this.toString           (); }

    @java.lang.Override public boolean canMoveUp()
    {
        return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(
            this.container, this.getPosition());
    }

    @java.lang.Override public boolean canMoveDown()
    {
        return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(
            this.container, this.getPosition());
    }
    // endregion
    // endregion

    boolean containersAreTheSame(
    final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container container)
    { return container == this.container; }

    @java.lang.SuppressWarnings({"unused"})
    public org.wheatgenetics.brapi1_3.observations.pr.o.Observations getObservationsAsItems()
    {
        this.setObservationsAsItemsIfNull(
            new org.wheatgenetics.brapi1_3.observations.pr.o.Observations());
        return this.observationsAsItems;
    }
}