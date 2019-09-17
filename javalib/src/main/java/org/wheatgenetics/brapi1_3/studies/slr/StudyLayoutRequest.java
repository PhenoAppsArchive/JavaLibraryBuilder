package org.wheatgenetics.brapi1_3.studies.slr;                           // slr: StudyLayoutRequest

/**
 * Uses:
 * com.google.gson.Gson
 * com.google.gson.GsonBuilder
 * com.google.gson.reflect.TypeToken
 *
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
 */
@java.lang.SuppressWarnings({"unused"})
public class StudyLayoutRequest extends io.swagger.client.model.StudyLayoutRequest
implements org.wheatgenetics.javalib.mstrdtl.Items
{
    // region Fields
    private transient com.google.gson.Gson   gsonInstance = null;                       // lazy load
    private transient java.lang.reflect.Type typeInstance = null;                       // lazy load
    // endregion

    // region Private Methods
    private com.google.gson.Gson gson()
    {
        if (null == this.gsonInstance)
            this.gsonInstance = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
        return this.gsonInstance;
    }

    private org.wheatgenetics.javalib.mstrdtl.Items clear()
    {
        {
            final java.util.List<io.swagger.client.model.StudyLayoutRequestLayout> layout =
                this.getLayout();
            if (null != layout) layout.clear();
        }
        return this;
    }

    private java.lang.reflect.Type type()
    {
        if (null == this.typeInstance) this.typeInstance = new com.google.gson.reflect.TypeToken<
            org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest>(){}.getType();
        return this.typeInstance;
    }
    // endregion

    // region Constructors
    /** Called by second StudyLayoutRequest() and StudyLayoutRequestTest. */
    StudyLayoutRequest() { super(); }

    /** Called by androidlibrary org.wheatgenetics.brapi1_3.Application.makeStudyLayoutRequest(). */
    public StudyLayoutRequest(
    final io.swagger.client.model.ObservationUnitPositionsResponse observationUnitPositionsResponse)
    {
        this();
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
                    observationUnitPosition: data) this.append(
                        new org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout(
                            this, observationUnitPosition));
            }
        }
    }
    // endregion

    // region org.wheatgenetics.javalib.mstrdtl.Items Overridden Methods
    @java.lang.Override public boolean canMoveDown(final int position)
    { return org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()); }

    @java.lang.Override public void moveUp(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveUp(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.getLayout(), position,position - 1);
    }

    @java.lang.Override public void moveDown(final int position)
    {
        if (org.wheatgenetics.javalib.mstrdtl.Utils.canMoveDown(position, this.size()))
            org.wheatgenetics.javalib.mstrdtl.Utils.swap(
                this.getLayout(), position,position + 1);
    }

    @java.lang.Override public void delete(final int position)
    { org.wheatgenetics.javalib.mstrdtl.Utils.delete(this.getLayout(), position); }

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

    @java.lang.Override public java.lang.String toJson() { return this.gson().toJson(this); }

    @java.lang.Override
    public org.wheatgenetics.javalib.mstrdtl.Items fromJson(final java.lang.String json)
    {
        if (null == json)
            return this.clear();
        else
        {
            final java.lang.String trimmedJson = json.trim();
            if (trimmedJson.length() <= 0)
                return this.clear();
            else
            {
                final org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest studyLayoutRequest =
                    this.gson().fromJson(trimmedJson, this.type());
                if (null == studyLayoutRequest)
                    return this.clear();
                else
                    if (studyLayoutRequest.size() <= 0)
                        return this.clear();
                    else
                    {
                        this.clear();

                        for (final io.swagger.client.model.StudyLayoutRequestLayout
                        studyLayoutRequestLayout: studyLayoutRequest.getLayout()) this.append(
                            new org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestLayout(
                                this, studyLayoutRequestLayout));

                        return this;
                    }
            }
        }
    }
    // endregion
}