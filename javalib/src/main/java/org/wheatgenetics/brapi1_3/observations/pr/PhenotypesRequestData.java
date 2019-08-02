package org.wheatgenetics.brapi1_3.observations.pr;

/**
 * Uses:
 * io.swagger.client.model.PhenotypesRequestData
 * io.swagger.client.model.PhenotypesRequestObservation
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 *
 * org.wheatgenetics.brapi1_3.observations.pr.o.Observations
 */
public class PhenotypesRequestData extends io.swagger.client.model.PhenotypesRequestData
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    // region Fields
    private final int position;
    private org.wheatgenetics.brapi1_3.observations.pr.o.Observations
        observationsAsItems = null;                                                     // lazy load
    // endregion

    private void setObservationsAsItems(
    final org.wheatgenetics.brapi1_3.observations.pr.o.Observations observationsAsItems)
    {
        if (null == observationsAsItems)
            { super.observations(null); this.observationsAsItems = null; }
        else
        {
            this.observationsAsItems = observationsAsItems;
            super.observations(this.observationsAsItems.list());
        }
    }

    PhenotypesRequestData(final int position)
    {
        super();

        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IllegalArgumentException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        else
            this.position = position;
    }

    // region Overridden Methods
    @java.lang.Override public io.swagger.client.model.PhenotypesRequestData observations(
    final java.util.List<io.swagger.client.model.PhenotypesRequestObservation> observations)
    {
        if (null == observations)
            this.setObservationsAsItems(null);
        else
            if (null == this.observationsAsItems) this.setObservationsAsItems(
                new org.wheatgenetics.brapi1_3.observations.pr.o.Observations(observations));
            else
                throw new java.lang.UnsupportedOperationException(
                    "this.observationsAsItems already initialized");
        return this;
    }

    @java.lang.Override
    public java.util.List<io.swagger.client.model.PhenotypesRequestObservation> getObservations()
    { return null == this.observationsAsItems ? null : this.observationsAsItems.list(); }

    @java.lang.Override public void setObservations(
    final java.util.List<io.swagger.client.model.PhenotypesRequestObservation> observations)
    { this.observations(observations); }

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public java.lang.String getTitle() { return this.getObservatioUnitDbId(); }

    @java.lang.Override public java.lang.String getContent() { return this.toString(); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }
    // endregion
    // endregion

    @java.lang.SuppressWarnings({"WeakerAccess", "RedundantSuppression"}) int getPosition()
    { return this.position; }

    @java.lang.SuppressWarnings({"unused"})
    public org.wheatgenetics.brapi1_3.observations.pr.o.Observations getObservationsAsItems()
    {
        if (null == this.observationsAsItems) this.setObservationsAsItems(
            new org.wheatgenetics.brapi1_3.observations.pr.o.Observations());
        return this.observationsAsItems;
    }
}