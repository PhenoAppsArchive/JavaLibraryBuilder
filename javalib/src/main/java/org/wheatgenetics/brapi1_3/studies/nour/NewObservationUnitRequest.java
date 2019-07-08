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
 *
 * org.wheatgenetics.brapi1_3.studies.nour.o.Observations
 * org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments
 * org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs
 */
public class NewObservationUnitRequest extends io.swagger.client.model.NewObservationUnitRequest
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    // region Fields
    private final int position;

    private org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs
        observationUnitXrefsAsItems = null;
    private org.wheatgenetics.brapi1_3.studies.nour.o.Observations observationsAsItems = null;
    private org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments
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

    // region setAsItems() Private Methods
    private void setObservationUnitXrefsAsItems(final
    org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs observationUnitXrefsAsItems)
    {
        if (null == observationUnitXrefsAsItems)
            { super.observationUnitXref(null); this.observationUnitXrefsAsItems = null; }
        else
        {
            this.observationUnitXrefsAsItems = observationUnitXrefsAsItems;
            super.observationUnitXref(this.observationUnitXrefsAsItems.list());
        }
    }

    private void setObservationsAsItems(final
    org.wheatgenetics.brapi1_3.studies.nour.o.Observations observationsAsItems)
    {
        if (null == observationsAsItems)
            { super.observations(null); this.observationsAsItems = null; }
        else
        {
            this.observationsAsItems = observationsAsItems;
            super.observations(this.observationsAsItems.list());
        }
    }

    private void setObservationTreatmentsAsItems(final
    org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments observationTreatmentsAsItems)
    {
        if (null == observationTreatmentsAsItems)
            { super.treatments(null); this.observationTreatmentsAsItems = null; }
        else
        {
            this.observationTreatmentsAsItems = observationTreatmentsAsItems;
            super.treatments(this.observationTreatmentsAsItems.list());
        }
    }
    // endregion

    // region assign() Private Methods
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
            positionCoordinateY, replicate, studyDbId).positionCoordinateXType(
                org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.convert(
                    positionCoordinateXType))
            .positionCoordinateYType(
                org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest.convert(
                    positionCoordinateYType));
        this.setObservationUnitXrefsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs(
                observationUnitXrefs));
        this.setObservationsAsItems(new org.wheatgenetics.brapi1_3.studies.nour.o.Observations(
            observationSummaries, germplasmDbId      , germplasmName, observationLevel,
            observationUnitDbId , observationUnitName, studyDbId                      ));
        this.setObservationTreatmentsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments(
                observationTreatments));
    }

    private void assign(
    final java.lang.String blockNumber        , final java.lang.String entryNumber        ,
    final java.lang.String entryType          , final java.lang.String germplasmDbId      ,
    final java.lang.String observationLevel   , final java.lang.String observationUnitDbId,
    final java.lang.String observationUnitName,
    final org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs observationUnitXrefs,
    final org.wheatgenetics.brapi1_3.studies.nour.o.Observations           observations       ,
    final java.lang.String operator           , final java.lang.String uploadedBy,
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
        this.setObservationUnitXrefsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.oux.ObservationUnitXrefs(
                observationUnitXrefs));
        this.setObservationsAsItems(new org.wheatgenetics.brapi1_3.studies.nour.o.Observations(
            observations, operator, uploadedBy));
        this.setObservationTreatmentsAsItems(
            new org.wheatgenetics.brapi1_3.studies.nour.ot.ObservationTreatments(
                observationTreatments));
    }
    // endregion
    // endregion

    // region Constructors
    NewObservationUnitRequest(final int position)
    {
        super();

        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IllegalArgumentException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        else
            this.position = position;
    }

    NewObservationUnitRequest(final int position,
    final io.swagger.client.model.ObservationUnit observationUnit)
    {
        this(position);
        if (null != observationUnit) this.assign(
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

    NewObservationUnitRequest(final
    org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequest newObservationUnitRequest,
    final java.lang.String operator, final java.lang.String uploadedBy)
    {
        this(newObservationUnitRequest.getPosition());
        this.assign(
            newObservationUnitRequest.getBlockNumber(), newObservationUnitRequest.getEntryNumber(),
            newObservationUnitRequest.getEntryType(), newObservationUnitRequest.getGermplasmDbId(),
            newObservationUnitRequest.getObservationLevel           (),
            newObservationUnitRequest.getObservationUnitDbId        (),
            newObservationUnitRequest.getObservationUnitName        (),
            newObservationUnitRequest.getObservationUnitXrefsAsItems(),
            newObservationUnitRequest.getObservationsAsItems        (), operator, uploadedBy,
            newObservationUnitRequest.getPlantNumber(), newObservationUnitRequest.getPlotNumber(),
            newObservationUnitRequest.getPositionCoordinateX    (),
            newObservationUnitRequest.getPositionCoordinateXType(),
            newObservationUnitRequest.getPositionCoordinateY    (),
            newObservationUnitRequest.getPositionCoordinateYType(),
            newObservationUnitRequest.getReplicate(), newObservationUnitRequest.getStudyDbId(),
            newObservationUnitRequest.getObservationTreatmentsAsItems()                       );
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
            null : this.observationUnitXrefsAsItems.list();
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
                new org.wheatgenetics.brapi1_3.studies.nour.o.Observations(observations));
            else
                throw new java.lang.UnsupportedOperationException(
                    "this.observationsAsItems already initialized");
        return this;
    }

    @java.lang.Override public java.util.List<io.swagger.client.model.Observation> getObservations()
    { return null == this.observationsAsItems ? null : this.observationsAsItems.list(); }

    @java.lang.Override public void setObservations(
    final java.util.List<io.swagger.client.model.Observation> observations)
    { this.observations(observations); }
    // endregion

    // region observations Overridden Methods
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
            null : this.observationTreatmentsAsItems.list();
    }

    @java.lang.Override public void setTreatments(
    final java.util.List<io.swagger.client.model.ObservationTreatment> observationTreatments)
    { this.treatments(observationTreatments); }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public java.lang.String getTitle() { return this.getObservationUnitDbId(); }

    @java.lang.Override public java.lang.String getContent() { return this.toString(); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }
    // endregion
    // endregion

    @java.lang.SuppressWarnings({"WeakerAccess", "RedundantSuppression"})
    int getPosition() { return this.position; }

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