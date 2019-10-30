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

    // region Constructors
    /** Called by second PhenotypesRequestData() and PhenotypesRequestTest. */
    PhenotypesRequestData() { super(); }

    /**
     * Called by third PhenotypesRequestData(), fourth PhenotypesRequestData(),
     * org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequest.append(), and
     * PhenotypesRequestTest.
     */
    PhenotypesRequestData(
    final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container container)
    { this(); this.setContainer(container); }

    /** Called by org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequest.fromJson(). */
    PhenotypesRequestData(
    final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container container,
    final io.swagger.client.model.PhenotypesRequestData                  phenotypesRequestData)
    {
        this(container); if (null != phenotypesRequestData) this
            .observationUnitDbId(phenotypesRequestData.getObservationUnitDbId())
            .observations       (phenotypesRequestData.getObservations       ())
            .studyDbId          (phenotypesRequestData.getStudyDbId          ());
    }

    /**
     * Called by androidlibrary
     * org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestDataAlertDialog.show() and
     * PhenotypesRequestTest.
     */
    PhenotypesRequestData(
    final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData phenotypesRequestData)
    {
        this(phenotypesRequestData.container);
        this.setPosition(phenotypesRequestData.getPosition()); this
            .observationUnitDbId(phenotypesRequestData.getObservationUnitDbId())
            .studyDbId          (phenotypesRequestData.getStudyDbId          ());
        this.setObservationsAsItems(new org.wheatgenetics.brapi1_3.observations.pr.o.Observations(
            phenotypesRequestData.getObservationsAsItems()));
    }
    // endregion

    // region Overridden Methods
    @java.lang.Override public io.swagger.client.model.PhenotypesRequestData observations(
    final java.util.List<io.swagger.client.model.PhenotypesRequestObservation> observations)
    {
        if (null == observations)
            this.clearObservationsAsItems();
        else
            if (this.getObservationsAsItems() == null) this.setObservationsAsItems(
                new org.wheatgenetics.brapi1_3.observations.pr.o.Observations(observations));
            else
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

    @java.lang.Override public java.lang.String getTitle() { return this.getObservationUnitDbId(); }
    @java.lang.Override public java.lang.String getContent() { return this.toString            (); }

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

    // region Package Methods
    boolean containersAreTheSame(
    final org.wheatgenetics.brapi1_3.observations.pr.PhenotypesRequestData.Container container)
    { return container == this.container; }

    @java.lang.SuppressWarnings({"WeakerAccess"})
    org.wheatgenetics.brapi1_3.observations.pr.o.Observations getObservationsAsItems()
    { return this.observationsAsItems; }

    void setObservationsAsItems(
    final org.wheatgenetics.brapi1_3.observations.pr.o.Observations observationsAsItems)
    { this.observationsAsItems = observationsAsItems; super.observations(this.getObservations()); }

    @java.lang.SuppressWarnings({"WeakerAccess"}) void clearObservationsAsItems()
    {
        this.setObservationsAsItems(
            (org.wheatgenetics.brapi1_3.observations.pr.o.Observations) null);
    }

    @java.lang.SuppressWarnings({"unused"}) void setObservationsAsItems(final java.lang.String json)
    {
        if (null == json)
            this.clearObservationsAsItems();
        else
        {
            final java.lang.String trimmedJson = json.trim();
            if (trimmedJson.length() <= 0)
                this.clearObservationsAsItems();
            else
            {
                if (null == this.observationsAsItems) this.setObservationsAsItems(
                    new org.wheatgenetics.brapi1_3.observations.pr.o.Observations());
                this.getObservationsAsItems().fromJson(trimmedJson);
            }
        }
    }
    // endregion
}