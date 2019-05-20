package org.wheatgenetics.brapi1_3.studies;

/**
 * Uses:
 * io.swagger.client.model.NewObservationUnitRequest
 * io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateXTypeEnum
 * io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateYTypeEnum
 * io.swagger.client.model.ObservationUnit
 * io.swagger.client.model.ObservationUnit.PositionCoordinateXTypeEnum
 * io.swagger.client.model.ObservationUnit.PositionCoordinateYTypeEnum
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
public class NewObservationUnitRequest extends io.swagger.client.model.NewObservationUnitRequest
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    private final int position;

    // region Private Methods
    private static io.swagger.client.model.NewObservationUnitRequest.PositionCoordinateXTypeEnum
    convert(final io.swagger.client.model.ObservationUnit.PositionCoordinateXTypeEnum
        positionCoordinateXTypeEnum)
    {
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

    // region Constructors
    NewObservationUnitRequest(final int position) { super(); this.position = position; }

    NewObservationUnitRequest(final int position,
    final io.swagger.client.model.ObservationUnit observationUnit)
    {
        this(position);

        if (null != observationUnit) this
            .blockNumber        (observationUnit.getBlockNumber        ())
            .entryNumber        (observationUnit.getEntryNumber        ())
            .entryType          (observationUnit.getEntryType          ())
            .germplasmDbId      (observationUnit.getGermplasmDbId      ())
            .observationLevel   (observationUnit.getObservationLevel   ())
            .observationUnitDbId(observationUnit.getObservationUnitDbId())
            .observationUnitName(observationUnit.getObservationUnitName())
            .observationUnitXref(observationUnit.getObservationUnitXref())
            .observations       (new org.wheatgenetics.brapi1_3.studies.Observations(
                observationUnit.getObservations()))
            .plantNumber            (observationUnit.getPlantNumber        ())
            .plotNumber             (observationUnit.getPlotNumber         ())
            .positionCoordinateX    (observationUnit.getPositionCoordinateX())
            .positionCoordinateXType(org.wheatgenetics.brapi1_3.studies.NewObservationUnitRequest
                .convert(observationUnit.getPositionCoordinateXType()))
            .positionCoordinateY    (observationUnit.getPositionCoordinateY())
            .positionCoordinateYType(org.wheatgenetics.brapi1_3.studies.NewObservationUnitRequest
                .convert(observationUnit.getPositionCoordinateYType()))
            .replicate (observationUnit.getReplicate ())
            .studyDbId (observationUnit.getStudyDbId ())
            .treatments(observationUnit.getTreatments());
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Item Overridden Methods
    @java.lang.Override public java.lang.String getTitle() { return this.getObservationUnitDbId(); }

    @java.lang.Override public java.lang.String getContent() { return this.toString(); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }
    // endregion

    int getPosition() { return this.position; }
}