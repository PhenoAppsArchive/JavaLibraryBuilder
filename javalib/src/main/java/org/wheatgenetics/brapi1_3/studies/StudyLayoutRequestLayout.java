package org.wheatgenetics.brapi1_3.studies;

/**
 * Uses:
 * io.swagger.client.model.ObservationUnitPosition
 * io.swagger.client.model.ObservationUnitPosition.EntryTypeEnum
 * io.swagger.client.model.ObservationUnitPosition.PositionCoordinateXTypeEnum
 * io.swagger.client.model.ObservationUnitPosition.PositionCoordinateYTypeEnum
 * io.swagger.client.model.StudyLayoutRequestLayout
 * io.swagger.client.model.StudyLayoutRequestLayout.EntryTypeEnum
 * io.swagger.client.model.StudyLayoutRequestLayout.PositionCoordinateXTypeEnum
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 */
public class StudyLayoutRequestLayout extends io.swagger.client.model.StudyLayoutRequestLayout
implements org.wheatgenetics.javalib.mstrdtl.Item
{
    private final int position;

    // region Constructors
    StudyLayoutRequestLayout(final int position) { super(); this.position = position; }

    StudyLayoutRequestLayout(final int position,
    final io.swagger.client.model.ObservationUnitPosition observationUnitPosition)
    {
        this(position);

        if (null != observationUnitPosition)
        {
            this.setBlockNumber(
                java.lang.Integer.valueOf(observationUnitPosition.getBlockNumber()));

            // region setEntryType()
            {
                final io.swagger.client.model.StudyLayoutRequestLayout.EntryTypeEnum
                    destinationEntryTypeEnum;
                {
                    final io.swagger.client.model.ObservationUnitPosition.EntryTypeEnum
                        sourceEntryTypeEnum = observationUnitPosition.getEntryType();
                    if (null == sourceEntryTypeEnum)
                        destinationEntryTypeEnum = null;
                    else
                        switch (sourceEntryTypeEnum)
                        {
                            case CHECK:
                                destinationEntryTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.EntryTypeEnum.CHECK;
                                break;

                            case TEST:
                                destinationEntryTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.EntryTypeEnum.TEST;
                                break;

                            case FILLER:
                                destinationEntryTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.EntryTypeEnum.FILLER;
                                break;

                            default: destinationEntryTypeEnum = null; break;
                        }
                }
                this.setEntryType(destinationEntryTypeEnum);
            }
            // endregion

            this.setObservationUnitDbId(observationUnitPosition.getObservationUnitDbId());
            this.setPositionCoordinateX(observationUnitPosition.getPositionCoordinateX());

            // region setPositionCoordinateXType()
            {
                final io.swagger.client.model.StudyLayoutRequestLayout.PositionCoordinateXTypeEnum
                    destinationPositionCoordinateXTypeEnum;
                {
                    final
                        io.swagger.client.model.ObservationUnitPosition.PositionCoordinateXTypeEnum
                            sourcePositionCoordinateXTypeEnum =
                                observationUnitPosition.getPositionCoordinateXType();
                    if (null == sourcePositionCoordinateXTypeEnum)
                        destinationPositionCoordinateXTypeEnum = null;
                    else
                        switch (sourcePositionCoordinateXTypeEnum)
                        {
                            case LONGITUDE:
                                destinationPositionCoordinateXTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.LONGITUDE;
                                break;

                            case LATITUDE:
                                destinationPositionCoordinateXTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.LATITUDE;
                                break;

                            case PLANTED_ROW:
                                destinationPositionCoordinateXTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateXTypeEnum.PLANTED_ROW;
                                break;

                            case PLANTED_INDIVIDUAL:
                                destinationPositionCoordinateXTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateXTypeEnum.PLANTED_INDIVIDUAL;
                                break;

                            case GRID_ROW:
                                destinationPositionCoordinateXTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.GRID_ROW;
                                break;

                            case GRID_COL:
                                destinationPositionCoordinateXTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.GRID_COL;
                                break;

                            case MEASURED_ROW:
                                destinationPositionCoordinateXTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateXTypeEnum.MEASURED_ROW;
                                break;

                            case MEASURED_COL:
                                destinationPositionCoordinateXTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateXTypeEnum.MEASURED_COL;
                                break;

                            default: destinationPositionCoordinateXTypeEnum = null;
                        }
                }
                this.setPositionCoordinateXType(destinationPositionCoordinateXTypeEnum);
            }
            // endregion

            this.setPositionCoordinateY(observationUnitPosition.getPositionCoordinateY());

            // region setPositionCoordinateYType()
            {
                final io.swagger.client.model.StudyLayoutRequestLayout.PositionCoordinateYTypeEnum
                    destinationPositionCoordinateYTypeEnum;
                {
                    final
                        io.swagger.client.model.ObservationUnitPosition.PositionCoordinateYTypeEnum
                            sourcePositionCoordinateYTypeEnum =
                                observationUnitPosition.getPositionCoordinateYType();
                    if (null == sourcePositionCoordinateYTypeEnum)
                        destinationPositionCoordinateYTypeEnum = null;
                    else
                        switch (sourcePositionCoordinateYTypeEnum)
                        {
                            case LONGITUDE:
                                destinationPositionCoordinateYTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.LONGITUDE;
                                break;

                            case LATITUDE:
                                destinationPositionCoordinateYTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.LATITUDE;
                                break;

                            case PLANTED_ROW:
                                destinationPositionCoordinateYTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateYTypeEnum.PLANTED_ROW;
                                break;

                            case PLANTED_INDIVIDUAL:
                                destinationPositionCoordinateYTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateYTypeEnum.PLANTED_INDIVIDUAL;
                                break;

                            case GRID_ROW:
                                destinationPositionCoordinateYTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.GRID_ROW;
                                break;

                            case GRID_COL:
                                destinationPositionCoordinateYTypeEnum = io.swagger.client.model
                                    .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.GRID_COL;
                                break;

                            case MEASURED_ROW:
                                destinationPositionCoordinateYTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateYTypeEnum.MEASURED_ROW;
                                break;

                            case MEASURED_COL:
                                destinationPositionCoordinateYTypeEnum =
                                    io.swagger.client.model.StudyLayoutRequestLayout
                                        .PositionCoordinateYTypeEnum.MEASURED_COL;
                                break;

                            default: destinationPositionCoordinateYTypeEnum = null;
                        }
                }
                this.setPositionCoordinateYType(destinationPositionCoordinateYTypeEnum);
            }
            // endregion

            this.setReplicate(java.lang.Integer.valueOf(observationUnitPosition.getReplicate()));
        }
    }
    // endregion

    // region Overridden Methods
    @java.lang.Override public java.lang.String getTitle()
    { return java.lang.Integer.toString(this.getBlockNumber()); }

    @java.lang.Override public java.lang.String getContent() { return this.toString(); }

    @java.lang.Override public java.lang.String getPositionAsString()
    { return java.lang.String.valueOf(this.getPosition()); }
    // endregion

    int getPosition() { return this.position; }
}