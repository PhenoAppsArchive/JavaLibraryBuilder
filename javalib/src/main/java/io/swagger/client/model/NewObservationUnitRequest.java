/*
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Observation;
import io.swagger.client.model.ObservationTreatment;
import io.swagger.client.model.ObservationUnitXref;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NewObservationUnitRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-15T17:05:32.234Z[GMT]")public class NewObservationUnitRequest {

  @SerializedName("X")
  private String X = null;

  @SerializedName("Y")
  private String Y = null;

  @SerializedName("blockNumber")
  private String blockNumber = null;

  @SerializedName("entryNumber")
  private String entryNumber = null;

  @SerializedName("entryType")
  private String entryType = null;

  @SerializedName("germplasmDbId")
  private String germplasmDbId = null;

  @SerializedName("observationLevel")
  private String observationLevel = null;

  @SerializedName("observationUnitDbId")
  private String observationUnitDbId = null;

  @SerializedName("observationUnitName")
  private String observationUnitName = null;

  @SerializedName("observationUnitXref")
  private List<ObservationUnitXref> observationUnitXref = null;

  @SerializedName("observations")
  private List<Observation> observations = null;

  @SerializedName("plantNumber")
  private String plantNumber = null;

  @SerializedName("plotNumber")
  private String plotNumber = null;

  @SerializedName("positionCoordinateX")
  private String positionCoordinateX = null;
  /**
   * The type of positional coordinate used. Must be one of the following values LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See \&quot;Location Coordinate Encoding\&quot; for details LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See \&quot;Location Coordinate Encoding\&quot; for details PLANTED_ROW - The physical planted row number  PLANTED_INDIVIDUAl - The physical counted number, could be independant or within a planted row GRID_ROW - The row index number of a square grid overlay GRID_COL - The column index number of a square grid overlay MEASURED_ROW - The distance in meters from a defined 0th row MEASURED_COL - The distance in meters from a defined 0th column 
   */
  @JsonAdapter(PositionCoordinateXTypeEnum.Adapter.class)
  public enum PositionCoordinateXTypeEnum {
    LONGITUDE("LONGITUDE"),
    LATITUDE("LATITUDE"),
    PLANTED_ROW("PLANTED_ROW"),
    PLANTED_INDIVIDUAL("PLANTED_INDIVIDUAl"),
    GRID_ROW("GRID_ROW"),
    GRID_COL("GRID_COL"),
    MEASURED_ROW("MEASURED_ROW"),
    MEASURED_COL("MEASURED_COL");

    private String value;

    PositionCoordinateXTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PositionCoordinateXTypeEnum fromValue(String text) {
      for (PositionCoordinateXTypeEnum b : PositionCoordinateXTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PositionCoordinateXTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PositionCoordinateXTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PositionCoordinateXTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PositionCoordinateXTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("positionCoordinateXType")
  private PositionCoordinateXTypeEnum positionCoordinateXType = null;

  @SerializedName("positionCoordinateY")
  private String positionCoordinateY = null;
  /**
   * The type of positional coordinate used. Must be one of the following values LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See \&quot;Location Coordinate Encoding\&quot; for details LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See \&quot;Location Coordinate Encoding\&quot; for details PLANTED_ROW - The physical planted row number  PLANTED_INDIVIDUAl - The physical counted number, could be independant or within a planted row GRID_ROW - The row index number of a square grid overlay GRID_COL - The column index number of a square grid overlay MEASURED_ROW - The distance in meters from a defined 0th row MEASURED_COL - The distance in meters from a defined 0th column 
   */
  @JsonAdapter(PositionCoordinateYTypeEnum.Adapter.class)
  public enum PositionCoordinateYTypeEnum {
    LONGITUDE("LONGITUDE"),
    LATITUDE("LATITUDE"),
    PLANTED_ROW("PLANTED_ROW"),
    PLANTED_INDIVIDUAL("PLANTED_INDIVIDUAl"),
    GRID_ROW("GRID_ROW"),
    GRID_COL("GRID_COL"),
    MEASURED_ROW("MEASURED_ROW"),
    MEASURED_COL("MEASURED_COL");

    private String value;

    PositionCoordinateYTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PositionCoordinateYTypeEnum fromValue(String text) {
      for (PositionCoordinateYTypeEnum b : PositionCoordinateYTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PositionCoordinateYTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PositionCoordinateYTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PositionCoordinateYTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PositionCoordinateYTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("positionCoordinateYType")
  private PositionCoordinateYTypeEnum positionCoordinateYType = null;

  @SerializedName("replicate")
  private String replicate = null;

  @SerializedName("studyDbId")
  private String studyDbId = null;

  @SerializedName("treatments")
  private List<ObservationTreatment> treatments = null;
  public NewObservationUnitRequest X(String X) {
    this.X = X;
    return this;
  }

  

  /**
  * DEPRECATED - use \&quot;positionCoordinateX\&quot;
  * @return X
  **/
  @Schema(description = "DEPRECATED - use \"positionCoordinateX\"")
  public String getX() {
    return X;
  }
  public void setX(String X) {
    this.X = X;
  }
  public NewObservationUnitRequest Y(String Y) {
    this.Y = Y;
    return this;
  }

  

  /**
  * DEPRECATED - use \&quot;positionCoordinateY\&quot;
  * @return Y
  **/
  @Schema(description = "DEPRECATED - use \"positionCoordinateY\"")
  public String getY() {
    return Y;
  }
  public void setY(String Y) {
    this.Y = Y;
  }
  public NewObservationUnitRequest blockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

  

  /**
  * The block number for an observation unit. Different systems may use different block designs.
  * @return blockNumber
  **/
  @Schema(description = "The block number for an observation unit. Different systems may use different block designs.")
  public String getBlockNumber() {
    return blockNumber;
  }
  public void setBlockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
  }
  public NewObservationUnitRequest entryNumber(String entryNumber) {
    this.entryNumber = entryNumber;
    return this;
  }

  

  /**
  * The entry number for an observation unit. Different systems may use different entry systems.
  * @return entryNumber
  **/
  @Schema(description = "The entry number for an observation unit. Different systems may use different entry systems.")
  public String getEntryNumber() {
    return entryNumber;
  }
  public void setEntryNumber(String entryNumber) {
    this.entryNumber = entryNumber;
  }
  public NewObservationUnitRequest entryType(String entryType) {
    this.entryType = entryType;
    return this;
  }

  

  /**
  * The type of entry for this observation unit. ex. \&quot;check\&quot;, \&quot;test\&quot;, \&quot;filler\&quot;
  * @return entryType
  **/
  @Schema(description = "The type of entry for this observation unit. ex. \"check\", \"test\", \"filler\"")
  public String getEntryType() {
    return entryType;
  }
  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }
  public NewObservationUnitRequest germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  

  /**
  *  The ID which uniquely identifies a germplasm
  * @return germplasmDbId
  **/
  @Schema(description = " The ID which uniquely identifies a germplasm")
  public String getGermplasmDbId() {
    return germplasmDbId;
  }
  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }
  public NewObservationUnitRequest observationLevel(String observationLevel) {
    this.observationLevel = observationLevel;
    return this;
  }

  

  /**
  * The level of an observation unit. ex. \&quot;plot\&quot;, \&quot;plant\&quot;
  * @return observationLevel
  **/
  @Schema(description = "The level of an observation unit. ex. \"plot\", \"plant\"")
  public String getObservationLevel() {
    return observationLevel;
  }
  public void setObservationLevel(String observationLevel) {
    this.observationLevel = observationLevel;
  }
  public NewObservationUnitRequest observationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
    return this;
  }

  

  /**
  * The ID which uniquely identifies an observation unit
  * @return observationUnitDbId
  **/
  @Schema(description = "The ID which uniquely identifies an observation unit")
  public String getObservationUnitDbId() {
    return observationUnitDbId;
  }
  public void setObservationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
  }
  public NewObservationUnitRequest observationUnitName(String observationUnitName) {
    this.observationUnitName = observationUnitName;
    return this;
  }

  

  /**
  * A human readable name for an observation unit
  * @return observationUnitName
  **/
  @Schema(description = "A human readable name for an observation unit")
  public String getObservationUnitName() {
    return observationUnitName;
  }
  public void setObservationUnitName(String observationUnitName) {
    this.observationUnitName = observationUnitName;
  }
  public NewObservationUnitRequest observationUnitXref(List<ObservationUnitXref> observationUnitXref) {
    this.observationUnitXref = observationUnitXref;
    return this;
  }

  public NewObservationUnitRequest addObservationUnitXrefItem(ObservationUnitXref observationUnitXrefItem) {
    if (this.observationUnitXref == null) {
      this.observationUnitXref = new ArrayList<ObservationUnitXref>();
    }
    this.observationUnitXref.add(observationUnitXrefItem);
    return this;
  }

  /**
  * A list of external references to this observation unit
  * @return observationUnitXref
  **/
  @Schema(description = "A list of external references to this observation unit")
  public List<ObservationUnitXref> getObservationUnitXref() {
    return observationUnitXref;
  }
  public void setObservationUnitXref(List<ObservationUnitXref> observationUnitXref) {
    this.observationUnitXref = observationUnitXref;
  }
  public NewObservationUnitRequest observations(List<Observation> observations) {
    this.observations = observations;
    return this;
  }

  public NewObservationUnitRequest addObservationsItem(Observation observationsItem) {
    if (this.observations == null) {
      this.observations = new ArrayList<Observation>();
    }
    this.observations.add(observationsItem);
    return this;
  }

  /**
  * List of observations associated with this observation unit
  * @return observations
  **/
  @Schema(description = "List of observations associated with this observation unit")
  public List<Observation> getObservations() {
    return observations;
  }
  public void setObservations(List<Observation> observations) {
    this.observations = observations;
  }
  public NewObservationUnitRequest plantNumber(String plantNumber) {
    this.plantNumber = plantNumber;
    return this;
  }

  

  /**
  * The plant number in a field. Applicable for observationLevel: \&quot;plant\&quot;
  * @return plantNumber
  **/
  @Schema(description = "The plant number in a field. Applicable for observationLevel: \"plant\"")
  public String getPlantNumber() {
    return plantNumber;
  }
  public void setPlantNumber(String plantNumber) {
    this.plantNumber = plantNumber;
  }
  public NewObservationUnitRequest plotNumber(String plotNumber) {
    this.plotNumber = plotNumber;
    return this;
  }

  

  /**
  * The plot number in a field. Applicable for observationLevel: \&quot;plot\&quot;
  * @return plotNumber
  **/
  @Schema(description = "The plot number in a field. Applicable for observationLevel: \"plot\"")
  public String getPlotNumber() {
    return plotNumber;
  }
  public void setPlotNumber(String plotNumber) {
    this.plotNumber = plotNumber;
  }
  public NewObservationUnitRequest positionCoordinateX(String positionCoordinateX) {
    this.positionCoordinateX = positionCoordinateX;
    return this;
  }

  

  /**
  * The X position coordinate for an observation unit. Different systems may use different coordinate systems.
  * @return positionCoordinateX
  **/
  @Schema(description = "The X position coordinate for an observation unit. Different systems may use different coordinate systems.")
  public String getPositionCoordinateX() {
    return positionCoordinateX;
  }
  public void setPositionCoordinateX(String positionCoordinateX) {
    this.positionCoordinateX = positionCoordinateX;
  }
  public NewObservationUnitRequest positionCoordinateXType(PositionCoordinateXTypeEnum positionCoordinateXType) {
    this.positionCoordinateXType = positionCoordinateXType;
    return this;
  }

  

  /**
  * The type of positional coordinate used. Must be one of the following values LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See \&quot;Location Coordinate Encoding\&quot; for details LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See \&quot;Location Coordinate Encoding\&quot; for details PLANTED_ROW - The physical planted row number  PLANTED_INDIVIDUAl - The physical counted number, could be independant or within a planted row GRID_ROW - The row index number of a square grid overlay GRID_COL - The column index number of a square grid overlay MEASURED_ROW - The distance in meters from a defined 0th row MEASURED_COL - The distance in meters from a defined 0th column 
  * @return positionCoordinateXType
  **/
  @Schema(description = "The type of positional coordinate used. Must be one of the following values LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details PLANTED_ROW - The physical planted row number  PLANTED_INDIVIDUAl - The physical counted number, could be independant or within a planted row GRID_ROW - The row index number of a square grid overlay GRID_COL - The column index number of a square grid overlay MEASURED_ROW - The distance in meters from a defined 0th row MEASURED_COL - The distance in meters from a defined 0th column ")
  public PositionCoordinateXTypeEnum getPositionCoordinateXType() {
    return positionCoordinateXType;
  }
  public void setPositionCoordinateXType(PositionCoordinateXTypeEnum positionCoordinateXType) {
    this.positionCoordinateXType = positionCoordinateXType;
  }
  public NewObservationUnitRequest positionCoordinateY(String positionCoordinateY) {
    this.positionCoordinateY = positionCoordinateY;
    return this;
  }

  

  /**
  * The Y position coordinate for an observation unit. Different systems may use different coordinate systems.
  * @return positionCoordinateY
  **/
  @Schema(description = "The Y position coordinate for an observation unit. Different systems may use different coordinate systems.")
  public String getPositionCoordinateY() {
    return positionCoordinateY;
  }
  public void setPositionCoordinateY(String positionCoordinateY) {
    this.positionCoordinateY = positionCoordinateY;
  }
  public NewObservationUnitRequest positionCoordinateYType(PositionCoordinateYTypeEnum positionCoordinateYType) {
    this.positionCoordinateYType = positionCoordinateYType;
    return this;
  }

  

  /**
  * The type of positional coordinate used. Must be one of the following values LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See \&quot;Location Coordinate Encoding\&quot; for details LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See \&quot;Location Coordinate Encoding\&quot; for details PLANTED_ROW - The physical planted row number  PLANTED_INDIVIDUAl - The physical counted number, could be independant or within a planted row GRID_ROW - The row index number of a square grid overlay GRID_COL - The column index number of a square grid overlay MEASURED_ROW - The distance in meters from a defined 0th row MEASURED_COL - The distance in meters from a defined 0th column 
  * @return positionCoordinateYType
  **/
  @Schema(description = "The type of positional coordinate used. Must be one of the following values LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See \"Location Coordinate Encoding\" for details PLANTED_ROW - The physical planted row number  PLANTED_INDIVIDUAl - The physical counted number, could be independant or within a planted row GRID_ROW - The row index number of a square grid overlay GRID_COL - The column index number of a square grid overlay MEASURED_ROW - The distance in meters from a defined 0th row MEASURED_COL - The distance in meters from a defined 0th column ")
  public PositionCoordinateYTypeEnum getPositionCoordinateYType() {
    return positionCoordinateYType;
  }
  public void setPositionCoordinateYType(PositionCoordinateYTypeEnum positionCoordinateYType) {
    this.positionCoordinateYType = positionCoordinateYType;
  }
  public NewObservationUnitRequest replicate(String replicate) {
    this.replicate = replicate;
    return this;
  }

  

  /**
  * The replicate number of an observation unit. May be the same as blockNumber.
  * @return replicate
  **/
  @Schema(description = "The replicate number of an observation unit. May be the same as blockNumber.")
  public String getReplicate() {
    return replicate;
  }
  public void setReplicate(String replicate) {
    this.replicate = replicate;
  }
  public NewObservationUnitRequest studyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
    return this;
  }

  

  /**
  * The ID which uniquely identifies a study within the given database server
  * @return studyDbId
  **/
  @Schema(description = "The ID which uniquely identifies a study within the given database server")
  public String getStudyDbId() {
    return studyDbId;
  }
  public void setStudyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
  }
  public NewObservationUnitRequest treatments(List<ObservationTreatment> treatments) {
    this.treatments = treatments;
    return this;
  }

  public NewObservationUnitRequest addTreatmentsItem(ObservationTreatment treatmentsItem) {
    if (this.treatments == null) {
      this.treatments = new ArrayList<ObservationTreatment>();
    }
    this.treatments.add(treatmentsItem);
    return this;
  }

  /**
  * List of treatments applied to an observation unit.
  * @return treatments
  **/
  @Schema(description = "List of treatments applied to an observation unit.")
  public List<ObservationTreatment> getTreatments() {
    return treatments;
  }
  public void setTreatments(List<ObservationTreatment> treatments) {
    this.treatments = treatments;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewObservationUnitRequest newObservationUnitRequest = (NewObservationUnitRequest) o;
    return Objects.equals(this.X, newObservationUnitRequest.X) &&
        Objects.equals(this.Y, newObservationUnitRequest.Y) &&
        Objects.equals(this.blockNumber, newObservationUnitRequest.blockNumber) &&
        Objects.equals(this.entryNumber, newObservationUnitRequest.entryNumber) &&
        Objects.equals(this.entryType, newObservationUnitRequest.entryType) &&
        Objects.equals(this.germplasmDbId, newObservationUnitRequest.germplasmDbId) &&
        Objects.equals(this.observationLevel, newObservationUnitRequest.observationLevel) &&
        Objects.equals(this.observationUnitDbId, newObservationUnitRequest.observationUnitDbId) &&
        Objects.equals(this.observationUnitName, newObservationUnitRequest.observationUnitName) &&
        Objects.equals(this.observationUnitXref, newObservationUnitRequest.observationUnitXref) &&
        Objects.equals(this.observations, newObservationUnitRequest.observations) &&
        Objects.equals(this.plantNumber, newObservationUnitRequest.plantNumber) &&
        Objects.equals(this.plotNumber, newObservationUnitRequest.plotNumber) &&
        Objects.equals(this.positionCoordinateX, newObservationUnitRequest.positionCoordinateX) &&
        Objects.equals(this.positionCoordinateXType, newObservationUnitRequest.positionCoordinateXType) &&
        Objects.equals(this.positionCoordinateY, newObservationUnitRequest.positionCoordinateY) &&
        Objects.equals(this.positionCoordinateYType, newObservationUnitRequest.positionCoordinateYType) &&
        Objects.equals(this.replicate, newObservationUnitRequest.replicate) &&
        Objects.equals(this.studyDbId, newObservationUnitRequest.studyDbId) &&
        Objects.equals(this.treatments, newObservationUnitRequest.treatments);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(X, Y, blockNumber, entryNumber, entryType, germplasmDbId, observationLevel, observationUnitDbId, observationUnitName, observationUnitXref, observations, plantNumber, plotNumber, positionCoordinateX, positionCoordinateXType, positionCoordinateY, positionCoordinateYType, replicate, studyDbId, treatments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewObservationUnitRequest {\n");
    
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    observationLevel: ").append(toIndentedString(observationLevel)).append("\n");
    sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
    sb.append("    observationUnitName: ").append(toIndentedString(observationUnitName)).append("\n");
    sb.append("    observationUnitXref: ").append(toIndentedString(observationUnitXref)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
    sb.append("    plantNumber: ").append(toIndentedString(plantNumber)).append("\n");
    sb.append("    plotNumber: ").append(toIndentedString(plotNumber)).append("\n");
    sb.append("    positionCoordinateX: ").append(toIndentedString(positionCoordinateX)).append("\n");
    sb.append("    positionCoordinateXType: ").append(toIndentedString(positionCoordinateXType)).append("\n");
    sb.append("    positionCoordinateY: ").append(toIndentedString(positionCoordinateY)).append("\n");
    sb.append("    positionCoordinateYType: ").append(toIndentedString(positionCoordinateYType)).append("\n");
    sb.append("    replicate: ").append(toIndentedString(replicate)).append("\n");
    sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
    sb.append("    treatments: ").append(toIndentedString(treatments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
