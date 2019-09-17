package org.wheatgenetics.brapi1_3.studies.nour;                 // nour: NewObservationUnitRequests

/**
 * Uses:
 * io.swagger.client.model.NewObservationUnitRequest
 * io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateXTypeEnum
 * io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateYTypeEnum
 * io.swagger.client.model.Observation
 * io.swagger.client.model.ObservationSummary
 * io.swagger.client.model.ObservationTreatment
 * io.swagger.client.model.ObservationUnit
 * io.swagger.client.model.ObservationUnit.PositionCoordinateXTypeEnum
 * io.swagger.client.model.ObservationUnit.PositionCoordinateYTypeEnum
 * io.swagger.client.model.ObservationUnitXref
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Utils
 *
 * org.wheatgenetics.brapi1_3.studies.nour.o.Observations
 * org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments
 * org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs
 */
@java.lang.SuppressWarnings({"WeakerAccess"})
public class NewObservationUnitRequest extends io.swagger.client.model.NewObservationUnitRequest
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    // region Fields
    private transient org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.Container
        container;
    private int position;

    private java.lang.String operator = null, uploadedBy = null;

    private transient org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs
        observationUnitXrefsAsItems = null;
    private transient org.wheatgenetics.brapi1_3.studies.nour.o.Observations
        observationsAsItems = null;
    private transient org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments
        observationTreatmentsAsItems = null;
    // endregion

    // region Private Methods
    // region convert() Private Methods
    private static io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateXTypeEnum
    convert(final io.swagger.client.model.ObservationUnit.PositionCoordinateXTypeEnum
        positionCoordinateXTypeEnum)
    {
        if (null == positionCoordinateXTypeEnum)
            return null;
        else
            switch (positionCoordinateXTypeEnum)
            {
                case LONGITUDE: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateXTypeEnum.LONGITUDE;

                case LATITUDE: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateXTypeEnum.LATITUDE;

                case PLANTED_ROW: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateXTypeEnum.PLANTED_ROW;

                case PLANTED_INDIVIDUAL: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateXTypeEnum.PLANTED_INDIVIDUAL;

                case GRID_ROW: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateXTypeEnum.GRID_ROW;

                case GRID_COL: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateXTypeEnum.GRID_COL;

                case MEASURED_ROW: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateXTypeEnum.MEASURED_ROW;

                case MEASURED_COL: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateXTypeEnum.MEASURED_COL;

                default: return null;
            }
    }

    private static io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateYTypeEnum
    convert(final io.swagger.client.model.ObservationUnit.PositionCoordinateYTypeEnum
        positionCoordinateYTypeEnum)
    {
        if (null == positionCoordinateYTypeEnum)
            return null;
        else
            switch (positionCoordinateYTypeEnum)
            {
                case LONGITUDE: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateYTypeEnum.LONGITUDE;

                case LATITUDE: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateYTypeEnum.LATITUDE;

                case PLANTED_ROW: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateYTypeEnum.PLANTED_ROW;

                case PLANTED_INDIVIDUAL: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateYTypeEnum.PLANTED_INDIVIDUAL;

                case GRID_ROW: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateYTypeEnum.GRID_ROW;

                case GRID_COL: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateYTypeEnum.GRID_COL;

                case MEASURED_ROW: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateYTypeEnum.MEASURED_ROW;

                case MEASURED_COL: return io.swagger.client.model
                    .NewObservationUnitRequest.PositionCoordinateYTypeEnum.MEASURED_COL;

                default: return null;
            }
    }
    // endregion

    // region assign() Private Methods
    /** Called by second assign(), third assign(), and fourth assign(). */
    private org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest assign(
    final java.lang.String blockNumber        , final java.lang.String entryNumber        ,
    final java.lang.String entryType          , final java.lang.String germplasmDbId      ,
    final java.lang.String observationLevel   , final java.lang.String observationUnitDbId,
    final java.lang.String observationUnitName, final java.lang.String plantNumber        ,
    final java.lang.String plotNumber         , final java.lang.String positionCoordinateX,
    final java.lang.String positionCoordinateY, final java.lang.String replicate          ,
    final java.lang.String studyDbId                                                      )
    {
        this.blockNumber(blockNumber).entryNumber(entryNumber).entryType(entryType)
            .germplasmDbId      (germplasmDbId      ).observationLevel   (observationLevel   )
            .observationUnitDbId(observationUnitDbId).observationUnitName(observationUnitName)
            .plantNumber        (plantNumber        ).plotNumber         (plotNumber         )
            .positionCoordinateX(positionCoordinateX).positionCoordinateY(positionCoordinateY)
            .replicate          (replicate          ).studyDbId(studyDbId                    );
        return this;
    }

    /** Called by third NewObservationUnitRequest(). */
    private void assign(
    final java.lang.String blockNumber        , final java.lang.String entryNumber        ,
    final java.lang.String entryType          , final java.lang.String germplasmDbId      ,
    final java.lang.String germplasmName      , final java.lang.String observationLevel   ,
    final java.lang.String observationUnitDbId, final java.lang.String observationUnitName,
    final java.util.List<io.swagger.client.model.ObservationUnitXref> observationUnitXrefs,
    final java.util.List<io.swagger.client.model.ObservationSummary > observationSummaries,
    final java.lang.String plantNumber        , final java.lang.String plotNumber,
    final java.lang.String positionCoordinateX,
    final io.swagger.client.model.ObservationUnit.PositionCoordinateXTypeEnum
        positionCoordinateXType,
    final java.lang.String positionCoordinateY,
    final io.swagger.client.model.ObservationUnit.PositionCoordinateYTypeEnum
        positionCoordinateYType,
    final java.lang.String replicate, final java.lang.String studyDbId,
    final java.util.List<io.swagger.client.model.ObservationTreatment> observationTreatments)
    {
        this.assign(blockNumber, entryNumber, entryType, germplasmDbId, observationLevel,
            observationUnitDbId, observationUnitName, plantNumber, plotNumber, positionCoordinateX,
            positionCoordinateY, replicate, studyDbId)
            .positionCoordinateXType(
                org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.convert(
                    positionCoordinateXType))
            .positionCoordinateYType(
                org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.convert(
                    positionCoordinateYType));
        if (null != observationUnitXrefs) this.setObservationUnitXrefsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs(
                observationUnitXrefs));
        if (null != observationSummaries) this.setObservationsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.o.Observations(observationSummaries,
                germplasmDbId      , germplasmName, observationLevel, observationUnitDbId,
                observationUnitName, studyDbId    , this.operator   , this.uploadedBy    ));
        if (null != observationTreatments) this.setObservationTreatmentsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments(
                observationTreatments));
    }

    /** Called by fourth NewObservationUnitRequest(). */
    private void assign(
    final java.lang.String blockNumber        , final java.lang.String entryNumber        ,
    final java.lang.String entryType          , final java.lang.String germplasmDbId      ,
    final java.lang.String observationLevel   , final java.lang.String observationUnitDbId,
    final java.lang.String observationUnitName,
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs observationUnitXrefs,
    final org.wheatgenetics.brapi1_3.studies.nour.o.Observations           observations       ,
    final java.lang.String plantNumber        , final java.lang.String plotNumber,
    final java.lang.String positionCoordinateX,
    final io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateXTypeEnum
        positionCoordinateXType,
    final java.lang.String positionCoordinateY,
    final io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateYTypeEnum
        positionCoordinateYType,
    final java.lang.String replicate, final java.lang.String studyDbId,
    final org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments observationTreatments)
    {
        this.assign(blockNumber, entryNumber, entryType, germplasmDbId, observationLevel,
            observationUnitDbId, observationUnitName, plantNumber, plotNumber, positionCoordinateX,
            positionCoordinateY, replicate, studyDbId)
            .positionCoordinateXType(positionCoordinateXType)
            .positionCoordinateYType(positionCoordinateYType);
        if (null != observationUnitXrefs) this.setObservationUnitXrefsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs(
                observationUnitXrefs));
        if (null != observations) this.setObservationsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.o.Observations(
                observations, this.operator, this.uploadedBy));
        if (null != observationTreatments) this.setObservationTreatmentsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments(
                observationTreatments));
    }

    /** Called by fifth NewObservationUnitRequest(). */
    private void assign(
    final java.lang.String blockNumber        , final java.lang.String entryNumber        ,
    final java.lang.String entryType          , final java.lang.String germplasmDbId      ,
    final java.lang.String observationLevel   , final java.lang.String observationUnitDbId,
    final java.lang.String observationUnitName,
    final java.util.List<io.swagger.client.model.ObservationUnitXref> observationUnitXrefs,
    final java.util.List<io.swagger.client.model.Observation        > observations        ,
    final java.lang.String plantNumber        , final java.lang.String plotNumber,
    final java.lang.String positionCoordinateX,
    final io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateXTypeEnum
        positionCoordinateXType,
    final java.lang.String positionCoordinateY,
    final io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateYTypeEnum
        positionCoordinateYType,
    final java.lang.String replicate, final java.lang.String studyDbId,
    final java.util.List<io.swagger.client.model.ObservationTreatment> observationTreatments)
    {
        this.assign(blockNumber, entryNumber, entryType, germplasmDbId, observationLevel,
            observationUnitDbId, observationUnitName, plantNumber, plotNumber, positionCoordinateX,
            positionCoordinateY, replicate, studyDbId)
            .positionCoordinateXType(positionCoordinateXType)
            .positionCoordinateYType(positionCoordinateYType);
        if (null != observationUnitXrefs) this.setObservationUnitXrefsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs(
                observationUnitXrefs));
        if (null != observations) this.setObservationsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.o.Observations(
                observations, this.operator, this.uploadedBy));
        if (null != observationTreatments) this.setObservationTreatmentsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments(
                observationTreatments));
    }
    // endregion
    // endregion

    // region Constructors
    /** Called by second NewObservationUnitRequest() and third NewObservationUnitRequest(). */
    private NewObservationUnitRequest(final
    org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.Container container)
    { super(); this.setContainer(container); }

    /**
     * Called by fourth NewObservationUnitRequest(), fifth NewObservationUnitRequest(),
     * org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests.append(), and
     * NewObservationUnitRequestsTest.
     */
    NewObservationUnitRequest(final
        org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.Container container,
    final java.lang.String operator, final java.lang.String uploadedBy)
    { this(container); this.operator = operator; this.uploadedBy = uploadedBy; }

    /** Called by second org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests(). */
    NewObservationUnitRequest(
    final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.Container container,
    final io.swagger.client.model.ObservationUnit                               observationUnit)
    {
        this(container); if (null != observationUnit) this.assign(
            observationUnit.getBlockNumber        (), observationUnit.getEntryNumber            (),
            observationUnit.getEntryType          (), observationUnit.getGermplasmDbId          (),
            observationUnit.getGermplasmName      (), observationUnit.getObservationLevel       (),
            observationUnit.getObservationUnitDbId(), observationUnit.getObservationUnitName    (),
            observationUnit.getObservationUnitXref(), observationUnit.getObservations           (),
            observationUnit.getPlantNumber        (), observationUnit.getPlotNumber             (),
            observationUnit.getPositionCoordinateX(), observationUnit.getPositionCoordinateXType(),
            observationUnit.getPositionCoordinateY(), observationUnit.getPositionCoordinateYType(),
            observationUnit.getReplicate          (), observationUnit.getStudyDbId              (),
            observationUnit.getTreatments         ()                                              );
    }

    /** Called by third org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests(). */
    NewObservationUnitRequest(final
    org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest newObservationUnitRequest,
    final java.lang.String operator, final java.lang.String uploadedBy)
    {
        this(newObservationUnitRequest.container, operator, uploadedBy);
        this.setPosition(newObservationUnitRequest.getPosition()); this.assign(
            newObservationUnitRequest.getBlockNumber                 (),
            newObservationUnitRequest.getEntryNumber                 (),
            newObservationUnitRequest.getEntryType                   (),
            newObservationUnitRequest.getGermplasmDbId               (),
            newObservationUnitRequest.getObservationLevel            (),
            newObservationUnitRequest.getObservationUnitDbId         (),
            newObservationUnitRequest.getObservationUnitName         (),
            newObservationUnitRequest.getObservationUnitXrefsAsItems (),
            newObservationUnitRequest.getObservationsAsItems         (),
            newObservationUnitRequest.getPlantNumber                 (),
            newObservationUnitRequest.getPlotNumber                  (),
            newObservationUnitRequest.getPositionCoordinateX         (),
            newObservationUnitRequest.getPositionCoordinateXType     (),
            newObservationUnitRequest.getPositionCoordinateY         (),
            newObservationUnitRequest.getPositionCoordinateYType     (),
            newObservationUnitRequest.getReplicate                   (),
            newObservationUnitRequest.getStudyDbId                   (),
            newObservationUnitRequest.getObservationTreatmentsAsItems());
    }

    /** Called by org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests.fromJson(). */
    NewObservationUnitRequest(
    final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.Container container,
    final io.swagger.client.model.NewObservationUnitRequest           newObservationUnitRequest,
    final java.lang.String operator,                          final java.lang.String uploadedBy)
    {
        this(container, operator, uploadedBy); if (null != newObservationUnitRequest) this.assign(
            newObservationUnitRequest.getBlockNumber            (),
            newObservationUnitRequest.getEntryNumber            (),
            newObservationUnitRequest.getEntryType              (),
            newObservationUnitRequest.getGermplasmDbId          (),
            newObservationUnitRequest.getObservationLevel       (),
            newObservationUnitRequest.getObservationUnitDbId    (),
            newObservationUnitRequest.getObservationUnitName    (),
            newObservationUnitRequest.getObservationUnitXref    (),
            newObservationUnitRequest.getObservations           (),
            newObservationUnitRequest.getPlantNumber            (),
            newObservationUnitRequest.getPlotNumber             (),
            newObservationUnitRequest.getPositionCoordinateX    (),
            newObservationUnitRequest.getPositionCoordinateXType(),
            newObservationUnitRequest.getPositionCoordinateY    (),
            newObservationUnitRequest.getPositionCoordinateYType(),
            newObservationUnitRequest.getReplicate              (),
            newObservationUnitRequest.getStudyDbId              (),
            newObservationUnitRequest.getTreatments             ());
    }
    // endregion

    // region Overridden Methods
    // region observationUnitXrefs Overridden Methods
    @java.lang.Override
    public io.swagger.client.model.NewObservationUnitRequest observationUnitXref(
    final java.util.List<io.swagger.client.model.ObservationUnitXref> observationUnitXrefs)
    {
        if (null == observationUnitXrefs)
            this.setObservationUnitXrefsAsItems(null);
        else
            if (null == this.observationUnitXrefsAsItems) this.setObservationUnitXrefsAsItems(
                new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs(
                    observationUnitXrefs));
            else
                throw new java.lang.UnsupportedOperationException(
                    "this.observationUnitXrefsAsItems already initialized");
        return this;
    }

    @java.lang.Override
    public java.util.List<io.swagger.client.model.ObservationUnitXref> getObservationUnitXref()
    {
        return null == this.observationUnitXrefsAsItems ?
            null : this.observationUnitXrefsAsItems.getList();
    }

    @java.lang.Override public void setObservationUnitXref(
    final java.util.List<io.swagger.client.model.ObservationUnitXref> observationUnitXrefs)
    { this.observationUnitXref(observationUnitXrefs); }
    // endregion

    // region observations Overridden Methods
    @java.lang.Override public io.swagger.client.model.NewObservationUnitRequest observations(
    final java.util.List<io.swagger.client.model.Observation> observations)
    {
        if (null == observations)
            this.setObservationsAsItems(null);
        else
            if (null == this.observationsAsItems) this.setObservationsAsItems(
                new org.wheatgenetics.brapi1_3.studies.nour.o.Observations(
                    observations, this.operator, this.uploadedBy));
            else
                throw new java.lang.UnsupportedOperationException(
                    "this.observationsAsItems already initialized");
        return this;
    }

    @java.lang.Override public java.util.List<io.swagger.client.model.Observation> getObservations()
    { return null == this.observationsAsItems ? null : this.observationsAsItems.getList(); }

    @java.lang.Override public void setObservations(
    final java.util.List<io.swagger.client.model.Observation> observations)
    { this.observations(observations); }
    // endregion

    // region observationTreatments Overridden Methods
    @java.lang.Override public io.swagger.client.model.NewObservationUnitRequest treatments(
    final java.util.List<io.swagger.client.model.ObservationTreatment> observationTreatments)
    {
        if (null == observationTreatments)
            this.setObservationTreatmentsAsItems(null);
        else
            if (null == this.observationTreatmentsAsItems) this.setObservationTreatmentsAsItems(
                new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments(
                    observationTreatments));
            else
                throw new java.lang.UnsupportedOperationException(
                    "this.observationTreatmentsAsItems already initialized");
        return this;
    }

    @java.lang.Override
    public java.util.List<io.swagger.client.model.ObservationTreatment> getTreatments()
    {
        return null == this.observationTreatmentsAsItems ?
            null : this.observationTreatmentsAsItems.getList();
    }

    @java.lang.Override public void setTreatments(
    final java.util.List<io.swagger.client.model.ObservationTreatment> observationTreatments)
    { this.treatments(observationTreatments); }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public void setContainer(
    final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.Container container)
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
    final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.Container container)
    { return container == this.container; }

    // region setAsItems() Package Methods
    void setObservationUnitXrefsAsItems(final
    org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs observationUnitXrefsAsItems)
    {
        this.observationUnitXrefsAsItems = observationUnitXrefsAsItems;
        super.observationUnitXref(this.getObservationUnitXref());
    }

    void setObservationsAsItems(
    final org.wheatgenetics.brapi1_3.studies.nour.o.Observations observationsAsItems)
    { this.observationsAsItems = observationsAsItems; super.observations(this.getObservations()); }

    void setObservationTreatmentsAsItems(final
    org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments observationTreatmentsAsItems)
    {
        this.observationTreatmentsAsItems = observationTreatmentsAsItems;
        super.treatments(this.getTreatments());
    }
    // endregion
    // endregion

    // region Public Methods
    @java.lang.SuppressWarnings({"WeakerAccess"})
    public org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs
    getObservationUnitXrefsAsItems() { return this.observationUnitXrefsAsItems; }

    @java.lang.SuppressWarnings({"WeakerAccess"})
    public org.wheatgenetics.brapi1_3.studies.nour.o.Observations getObservationsAsItems()
    { return this.observationsAsItems; }

    @java.lang.SuppressWarnings({"WeakerAccess"})
    public org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments
    getObservationTreatmentsAsItems() { return this.observationTreatmentsAsItems; }
    // endregion
}