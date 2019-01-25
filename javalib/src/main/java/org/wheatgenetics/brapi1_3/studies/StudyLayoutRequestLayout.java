package org.wheatgenetics.brapi1_3.studies;

/**
 * Uses:
 * io.swagger.client.model.ObservationUnitPosition
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

            {
                final io.swagger.client.model.StudyLayoutRequestLayout.EntryTypeEnum entryTypeEnum;
                switch (observationUnitPosition.getEntryType())
                {
                    case CHECK:
                        entryTypeEnum =
                            io.swagger.client.model.StudyLayoutRequestLayout.EntryTypeEnum.CHECK;
                        break;

                    case TEST:
                        entryTypeEnum =
                            io.swagger.client.model.StudyLayoutRequestLayout.EntryTypeEnum.TEST;
                        break;

                    case FILLER:
                        entryTypeEnum =
                            io.swagger.client.model.StudyLayoutRequestLayout.EntryTypeEnum.FILLER;
                        break;

                    default: entryTypeEnum = null; break;
                }
                this.setEntryType(entryTypeEnum);
            }

            this.setObservationUnitDbId(observationUnitPosition.getObservationUnitDbId());
            this.setPositionCoordinateX(observationUnitPosition.getPositionCoordinateX());

            {
                final io.swagger.client.model.StudyLayoutRequestLayout.PositionCoordinateXTypeEnum
                    positionCoordinateXTypeEnum;
                switch (observationUnitPosition.getPositionCoordinateXType())
                {
                    case LONGITUDE:
                        positionCoordinateXTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.LONGITUDE;
                        break;

                    case LATITUDE:
                        positionCoordinateXTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.LATITUDE;
                        break;

                    case PLANTED_ROW:
                        positionCoordinateXTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.PLANTED_ROW;
                        break;

                    case PLANTED_INDIVIDUAL:
                        positionCoordinateXTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.PLANTED_INDIVIDUAL;
                        break;

                    case GRID_ROW:
                        positionCoordinateXTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.GRID_ROW;
                        break;

                    case GRID_COL:
                        positionCoordinateXTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.GRID_COL;
                        break;

                    case MEASURED_ROW:
                        positionCoordinateXTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.MEASURED_ROW;
                        break;

                    case MEASURED_COL:
                        positionCoordinateXTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateXTypeEnum.MEASURED_COL;
                        break;

                    default: positionCoordinateXTypeEnum = null;
                }
                this.setPositionCoordinateXType(positionCoordinateXTypeEnum);
            }

            this.setPositionCoordinateY(observationUnitPosition.getPositionCoordinateY());

            {
                final io.swagger.client.model.StudyLayoutRequestLayout.PositionCoordinateYTypeEnum
                    positionCoordinateYTypeEnum;
                switch (observationUnitPosition.getPositionCoordinateYType())
                {
                    case LONGITUDE:
                        positionCoordinateYTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.LONGITUDE;
                        break;

                    case LATITUDE:
                        positionCoordinateYTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.LATITUDE;
                        break;

                    case PLANTED_ROW:
                        positionCoordinateYTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.PLANTED_ROW;
                        break;

                    case PLANTED_INDIVIDUAL:
                        positionCoordinateYTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.PLANTED_INDIVIDUAL;
                        break;

                    case GRID_ROW:
                        positionCoordinateYTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.GRID_ROW;
                        break;

                    case GRID_COL:
                        positionCoordinateYTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.GRID_COL;
                        break;

                    case MEASURED_ROW:
                        positionCoordinateYTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.MEASURED_ROW;
                        break;

                    case MEASURED_COL:
                        positionCoordinateYTypeEnum = io.swagger.client.model
                            .StudyLayoutRequestLayout.PositionCoordinateYTypeEnum.MEASURED_COL;
                        break;

                    default: positionCoordinateYTypeEnum = null;
                }
                this.setPositionCoordinateYType(positionCoordinateYTypeEnum);
            }

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